package thread;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * @author Gremmie102
 * @date 2022/7/28 10:30
 * @purpose :
 */
public class Demo20 {
    public static void main(String[] args) {
        BlockingDeque<Integer> queue = new LinkedBlockingDeque<>();

        Thread customer = new Thread(() -> {
           while (true){
               try {
                   int value = queue.take();
                   System.out.println("消费元素:"+value);

               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
           }
        });
        customer.start();

        Thread producer = new Thread(() -> {
            int n = 0;
            while (true){
                try {
                    System.out.println("生产元素:"+n);
                    queue.put(n);
                    n++;
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        producer.start();

    }
}
