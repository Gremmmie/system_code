package thread;

/**
 * @author Gremmie102
 * @date 2022/7/27 9:26
 * @purpose :
 */
public class Demo17 {
    public static void main(String[] args) throws InterruptedException {
        Object object = new Object();
        synchronized (object){
            System.out.println("wait 之前");
            object.wait();
            //走到这里,就停下来阻塞等待了
            System.out.println("wait之后");
        }
    }
}
