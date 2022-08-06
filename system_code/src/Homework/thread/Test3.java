package Homework.thread;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test3 {
    static ExecutorService executorService = Executors.newSingleThreadExecutor();
    public static void main(String[] args) throws InterruptedException {
        Thread thread0 = new Thread(() -> {
            System.out.print("0 ");
        });
        Thread thread1 = new Thread(() -> {
            System.out.print("1 ");
        });
        Thread thread2 = new Thread(() -> {
            System.out.print("2 ");
        });
        Thread thread3 = new Thread(() -> {
            System.out.print("3 ");
        });
        Thread thread4 = new Thread(() -> {
            System.out.print("4 ");
        });
        Thread thread5 = new Thread(() -> {
            System.out.print("5 ");
        });
        Thread thread6 = new Thread(() -> {
            System.out.print("6 ");
        });
        Thread thread7 = new Thread(() -> {
            System.out.print("7 ");
        });
        Thread thread8 = new Thread(() -> {
            System.out.print("8 ");
        });
        Thread thread9 = new Thread(() -> {
            System.out.print("9 ");
        });
        Thread thread10 = new Thread(() -> {
            System.out.print("10 ");
        });
        Thread thread11 = new Thread(() -> {
            System.out.print("11 ");
        });
        Thread thread12 = new Thread(() -> {
            System.out.print("12 ");
        });
        Thread thread13 = new Thread(() -> {
            System.out.print("13 ");
        });
        Thread thread14 = new Thread(() -> {
            System.out.print("14 ");
        });
        Thread thread15 = new Thread(() -> {
            System.out.print("15 ");
        });
        Thread thread16 = new Thread(() -> {
            System.out.print("16 ");
        });
        Thread thread17 = new Thread(() -> {
            System.out.print("17 ");
        });
        Thread thread18 = new Thread(() -> {
            System.out.print("18 ");
        });
        Thread thread19 = new Thread(() -> {
            System.out.print("19 ");
        });
//        thread.start();
//        thread.join();
        executorService.submit(thread0);
        executorService.submit(thread1);
        executorService.submit(thread2);
        executorService.submit(thread3);
        executorService.submit(thread4);
        executorService.submit(thread5);
        executorService.submit(thread6);
        executorService.submit(thread7);
        executorService.submit(thread8);
        executorService.submit(thread9);
        executorService.submit(thread10);
        executorService.submit(thread11);
        executorService.submit(thread12);
        executorService.submit(thread13);
        executorService.submit(thread14);
        executorService.submit(thread15);
        executorService.submit(thread16);
        executorService.submit(thread17);
        executorService.submit(thread18);
        executorService.submit(thread19);
        executorService.shutdown();

    }
}
