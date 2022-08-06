package Homework.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test5 {
    static ExecutorService executorService = Executors.newSingleThreadExecutor();
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            System.out.print("a ");
        });
        Thread thread2 = new Thread(() -> {
            System.out.print("b ");
        });
        Thread thread3 = new Thread(() -> {
            System.out.print("c ");
        });
        executorService.submit(thread3);
        executorService.submit(thread2);
        executorService.submit(thread1);
        executorService.shutdown();
    }
}
