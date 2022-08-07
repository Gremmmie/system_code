package thread;

import java.util.concurrent.PriorityBlockingQueue;

/**
 * 定时器的构成:
 * 一个带优先级的阻塞队列
 * 队列中的每个元素是一个 Task 对象.
 * Task 中带有一个时间属性, 队首元素就是即将
 * 同时有一个 worker 线程一直扫描队首元素, 看队首元素是否需要执行
 */
public class Timer {
    static class Task implements Comparable<Task> {
        private Runnable command;
        private long time;
        public Task(Runnable command, long time) {
            this.command = command;
// time 中存的是绝对时间, 超过这个时间的任务就应该被执行
            this.time = System.currentTimeMillis() + time;
        }
        public void run() {
            command.run();
        }
        @Override
        public int compareTo(Task o) {
// 谁的时间小谁排前面
            return (int)(time - o.time);
        }
    }
    // 核心结构
    private PriorityBlockingQueue<Task> queue = new PriorityBlockingQueue();
    // 存在的意义是避免 worker 线程出现忙等的情况
    private Object mailBox = new Object();
    class Worker extends Thread{
        @Override
        public void run() {
            while (true) {
                try {
                    Task task = queue.take();
                    long curTime = System.currentTimeMillis();
                    if (task.time > curTime) {
// 时间还没到, 就把任务再塞回去
                        queue.put(task);
                        synchronized (mailBox) {
// 指定等待时间 wait
                            mailBox.wait(task.time - curTime);
                        }
                    } else {
// 时间到了, 可以执行任务
                        task.run();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    break;
                }
            }
        }
    }
    public Timer() {
// 启动 worker 线程
        Worker worker = new Worker();
        worker.start();
    }
    // schedule 原意为 "安排"
    public void schedule(Runnable command, long after) {
        Task task = new Task(command, after);
        queue.offer(task);
        synchronized (mailBox) {
            mailBox.notify();
        }
    }
    public static void main(String[] args) {
        Timer timer = new Timer();
        Runnable command = new Runnable() {
            @Override
            public void run() {
                System.out.println("我来了");
                timer.schedule(this, 3000);
                //这里和上面timer中的schedule方法中互相调用,
                // 实现了循环执行该run方法,如果删去该行代码,
                // 将构不成循环,就只会执行一次run方法
            }
        };
        timer.schedule(command, 3000);
    }
}