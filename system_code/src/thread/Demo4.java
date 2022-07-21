package thread;

/**
 * @author Gremmie102
 * @date 2022/7/21 11:14
 * @purpose :
 */
public class Demo4 {
    public static void main(String[] args) {
//        Runnable runnable = new Runnable(){
//            @Override
//            public void run() {
//                while (true){
//                    System.out.println("hello thread");
//                    try{
//                        Thread.sleep(1000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//            }
//        };
//        Thread t = new Thread(runnable);
//        t.start();
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
        });
        t.start();

    }
}
