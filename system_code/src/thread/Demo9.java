package thread;

/**
 * @author Gremmie102
 * @date 2022/7/23 10:30
 * @purpose :
 */
public class Demo9 {
    //用一个布尔变量表示线程是否要结束
    //这个变量是一个成员变量
    private static boolean isQuit = false;
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> {
            while(!isQuit){
                System.out.println("线程运行中");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("新线程执行结束");
        });

        t.start();

        Thread.sleep(5000);
        System.out.println("控制线程退出");
        isQuit = true;
    }
}
