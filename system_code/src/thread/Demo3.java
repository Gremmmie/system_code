package thread;

/**
 * @author Gremmie102
 * @date 2022/7/21 11:06
 * @purpose :创建多线程的第三种方法 匿名内部类
 */
public class Demo3 {
    public static void main(String[] args) {
        Thread t = new Thread(){
            @Override
            public void run() {
                while(true){
                    System.out.println("he;;p thread");
                    try{
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
    }
}
