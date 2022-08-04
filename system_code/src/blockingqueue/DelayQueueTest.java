package blockingqueue;

import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class DelayQueueTest {
    public static class Task implements Delayed {
        private long outTime;//延迟时间
        private long delayTime;//到期时间

        public Task(long outTime){
            this.outTime = outTime;
            //使用的时间刻度是纳秒级别
            delayTime = System.nanoTime() + TimeUnit.NANOSECONDS.convert(outTime,TimeUnit.SECONDS);
        }

        /**
         * 获取剩余的到期时间 当返回负数的时候代表过期
         * @param unit the time unit
         * @return
         */
        public long getDelay(TimeUnit unit){
            return unit.convert(this.delayTime -
                    System.nanoTime(),TimeUnit.NANOSECONDS);
        }

        /**
         * 对延迟时间排序
         * @param o the object to be compared.
         * @return
         */
        public int compareTo(Delayed o){
            if (o == this) return 0;
            if (o instanceof Task){
                Task task = (Task)o;
                return Long.compare(this.outTime, task.outTime);
            }
            long d = getDelay(TimeUnit.NANOSECONDS) - o.getDelay(TimeUnit.NANOSECONDS);
            return d > 0 ? 1 : d < 0 ? -1 : 0;
        }
        public void print(){
            System.out.println("task_"+outTime+"到期");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        final DelayQueue<Task> queue = new DelayQueue<Task>();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0;i<11;i++){
                    Task task = new Task(i);
                    queue.put(task);
                }
            }
        },"Produce-Thread").start();
        Thread.sleep(1000);
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (;;){
                    Task task = null;
                    try {
                        task = queue.take();
                        task.print();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        },"Consume-Thread").start();
    }
}
