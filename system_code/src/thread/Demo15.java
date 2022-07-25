package thread;

/**
 * @author Gremmie102
 * @date 2022/7/25 10:40
 * @purpose :
 */
public class Demo15 {
    public static Object locker1 = new Object();
    public static Object locker2 = new Object();

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            synchronized (locker1){
                System.out.println("t1 start");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("t1 finish");
            }
        });
        t1.start();
        //即使先t1start,也不一定是t1先执行

        Thread t2 = new Thread(() -> {
            synchronized (locker1){
                System.out.println("t2 start");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("t2 finish");
            }
        });
        t2.start();
    }
}
