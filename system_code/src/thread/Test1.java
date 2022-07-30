package thread;

import java.io.IOException;

/**
 * @author Gremmie102
 * @date 2022/7/29 16:43
 * @purpose :
 */
public class Test1 {

    public static void main(String[] args) throws IOException {
        Test1 test1 = new Test1();
        MyThread thread = test1.new MyThread();
        Thread thread1 = new Thread(() -> {
           while (true){
               System.out.println("这里是thread1");
               try {
                   Thread.sleep(10000);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
           }
        });
        thread1.start();
        thread.start();
        while(true){
            System.out.println("这里是主线程中断");
            try {
                Thread.currentThread().sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            thread.interrupt();
        }


//        thread1.interrupt();
    }

    class MyThread extends Thread{
        @Override
        public void run() {
            while(true){
                System.out.println("thread while循环");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}