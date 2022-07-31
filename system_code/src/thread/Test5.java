package thread;

public class Test5 {
    private static class MyRunnable implements Runnable {

        @Override
        public void run() {
            for (int i = 0;i<5;i++){
                System.out.println(Thread.interrupted());
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public static void main(String[] args) {
        MyRunnable target = new MyRunnable();
        Thread thread = new Thread(target,"葛玉米");
        thread.start();
//        thread.interrupt();
    }
}
