package thread;

/**
 * @author Gremmie102
 * @date 2022/7/21 11:18
 * @purpose :第五种使用lambda表达式,其实是更简单也更推荐的写法
 */
public class Demo5 {
    //lambda表达式本质上就仅仅是一个"匿名函数"
    public static void main(String[] args) {
        Thread t = new Thread(() ->{
            while (true){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t.start();
    }
}
