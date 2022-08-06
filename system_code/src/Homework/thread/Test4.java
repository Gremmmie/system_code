package Homework.thread;

public class Test4 {
    static int count=0;
    public static void main(String[] args) throws InterruptedException {

        Object object = new Object();
        Thread thread1 = new Thread(() -> {
           synchronized (object) {
               for (int i = 0; i < 10000; i++) {
                   count++;
               }
           }
        });
        Thread thread2 = new Thread(() -> {
            synchronized (object) {
                for (int i = 0; i < 10000; i++) {
                    count++;
                }
            }
        });
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(count);
    }
}
