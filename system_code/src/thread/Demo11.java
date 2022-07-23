package thread;

/**
 * @author Gremmie102
 * @date 2022/7/23 12:08
 * @purpose :
 */
public class Demo11 {
    private static  Thread t1 = null;
    private static  Thread t2 = null;
    public static void main(String[] args) {
        t1 = new Thread(() -> {
            System.out.println("t1 begin");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        });
    }
}
