package thread;

public class Test3 {
    private static class MyRunnable implements Runnable{
        public volatile boolean isQuit = false;
        //浅浅定义一个状态来确定是否停下来了

        @Override
        public void run() {
            while(!isQuit) {//这里就用到啦
                System.out.println(Thread.currentThread().getName()
                        + "说:我在转账!嗨嗨嗨!");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName()
                    + "说:哎呀,差点误了大事");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MyRunnable target = new MyRunnable();
        Thread thread = new Thread(target,"李四");
        System.out.println(Thread.currentThread().getName()
                + "开始运行,李四开始转账");
        thread.start();
        Thread.sleep(10000);
        System.out.println(Thread.currentThread().getName()
                + ":有新情况,得赶紧通知李四对方是个大骗子");
        target.isQuit = true;
    }
}
