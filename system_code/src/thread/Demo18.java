package thread;

import java.util.Scanner;

/**
 * @author Gremmie102
 * @date 2022/7/27 9:36
 * @purpose :
 */
//创建两个线程,一个线程调用wait,一个线程调用notify
public class Demo18 {

    //这个对象用来当作锁对象
    public static Object locker = new Object();
    public static void main(String[] args) {
        //用来取等待
        Thread waitTask = new Thread(() -> {
            synchronized (locker){

                try {
                    System.out.println("wait 开始");
                    locker.wait();
                    System.out.println("wait 结束");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        waitTask.start();

        //创建一个用来通知/唤醒的代码
        Thread notifyTask = new Thread(() -> {
            //让用户控制~ 用户输入个内容之后,再执行通知
            Scanner scanner = new Scanner(System.in);
            System.out.println("输入任意内容,开始通知:");
            //next会阻塞,查到用户真正输入内容以后
            scanner.next();

            synchronized (locker){
                System.out.println("notify 开始");
                locker.notify();
                System.out.println("notify 结束");
            }
        });
        notifyTask.start();

    }
}
