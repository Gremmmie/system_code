package thread;

public class Test13 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                while(true){
                    System.out.println("t1线程正在执行");
                    Thread.yield();
                }
            }
        },"t1");
        t1.start();

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                while(true){
                    System.out.println("t2线程正在执行");
                }
            }
        },"t2");
        t2.start();
    }
}
