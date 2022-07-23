package thread;

/**
 * @author Gremmie102
 * @date 2022/7/23 9:31
 * @purpose :
 */
public class Demo7 {
    public static void main(String[] args) {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    System.out.println("hello thread");
                    try{
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        },"我的线程");
        t.start();

        while (true){
            System.out.println("hello thread");
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
