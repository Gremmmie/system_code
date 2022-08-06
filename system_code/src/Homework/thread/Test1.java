package Homework.thread;

import java.util.Arrays;
import java.util.Scanner;

public class Test1 {
    static int sum1 = 0;
    static int sum2 = 0;
    public static void main(String[] args) throws InterruptedException {
        int[] array = new int[1000_0000];
        int i = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入小于1000w个1-100的整数");
        String string = scanner.nextLine();
//        for (int j = 0;j<string.length();j++){
//            array[j] = string.toCharArray()[j];
//        }
        Scanner scanner1 = new Scanner(string);
        while (scanner1.hasNext()){
            array[i]=scanner1.nextInt();
            i++;
        }

        Object object = new Object();
        Thread thread1 = new Thread(() -> {
            synchronized (object){
                for (int j=0;j<array.length;j+=2){
                    sum1 += array[j];
                }
            }

        },"thread1");

        Thread thread2 = new Thread(() -> {
            synchronized (object){
                for (int j=1;j<array.length;j+=2){
                    sum2 += array[j];
                }
            }
        },"thread2");
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println("两个数组相加之和为:"+sum1+sum2);
    }
}
