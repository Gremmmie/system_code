package thread;

public class Test6 {
    private static class MyRunnable implements Runnable {

        @Override
        public void run() {
            for (int i = 0;i<5;i++){
                System.out.println(Thread.currentThread().getName()
                        +"的标志位:"+Thread.currentThread().isInterrupted());
//
//                问:为何加上这段try-catch之后,标志位就改成了false呢?
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                    System.out.println(Thread.currentThread().getName()+":被中断啦!");
//                }
            }
        }
    }

    public static void main(String[] args) {
        MyRunnable target = new MyRunnable();
        Thread thread = new Thread(target,"葛玉米");
        thread.start();
        thread.interrupt();
    }
}
