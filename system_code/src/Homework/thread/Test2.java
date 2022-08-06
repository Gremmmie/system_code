package Homework.thread;



class Thread1 extends Thread {
    public void run(){
        System.out.println("我是线程1");
    }
}
class Thread2 implements Runnable{

    @Override
    public void run() {
        System.out.println("我是线程2");
    }

    public void start() {
        run();
    }
}
public class Test2 {

    public static void main(String[] args) {
        Thread thread3 = new Thread(){
            public void run(){
                System.out.println("我是匿名内部类实现,继承Thread的线程3");
            }
        };
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("我是用匿名内部类实现Runnable接口的runnable,我将被线程4调用");
            }
        };
        Thread thread4 = new Thread(runnable);

        Thread thread5 = new Thread(() -> {
            System.out.println("我是线程5,我是语法糖实现的,使用了lambda表达式");
        },"thread5");
        Thread1 thread1 = new Thread1();
        Thread2 thread2 = new Thread2();
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
    }
}
