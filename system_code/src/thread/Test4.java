package thread;

public class Test4 {
    private static class MyRunnable implements Runnable {

        @Override
        public void run() {
            //while里面放这两个都可以
            while(!Thread.interrupted()){
            //while(!Thread.currentThread.isInterrupted(){
                System.out.println(Thread.currentThread().getName()
                        + ":转账咯,嗨嗨嗨!");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    System.out.println(Thread.currentThread().getName()
                            +":不好,有内鬼!终止交易!");
                    //注意此处要有break;
                    break;
                }
            }
            System.out.println(Thread.currentThread().getName()
                    +":还好还好,差点钱全都转过去了");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MyRunnable target = new MyRunnable();
        Thread thread = new Thread(target,"葛玉米");
        System.out.println(Thread.currentThread().getName()
                +":让葛玉米开始转账");
        thread.start();
        Thread.sleep(8000);
        System.out.println(Thread.currentThread().getName()
                +":坏了!得赶紧通知葛玉米对方是电信诈骗");
        thread.interrupt();
    }
}
