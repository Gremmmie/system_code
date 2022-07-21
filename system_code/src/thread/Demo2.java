package thread;

/**
 * @author Gremmie102
 * @date 2022/7/21 10:48
 * @purpose :创建线程的第二种方法
 */
class MyRunnable implements  Runnable {

    @Override
    public void run() {
        while(true){
            System.out.println("hello thread");
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
public class Demo2 {
    public static void main(String[] args) {
        //创建线程
        Runnable runnable = new MyRunnable();
        Thread t = new Thread(runnable);
        //两个写法不要糅合在一起
        t.start();
        //此处创建的Runnable,相当于是定义了一个任务(代码要干嘛)
        //还是需要Thread示例,把任务交给Thread
        //还是Thread.start来创建具体的线程
        //这个写法,线程和任务是分离开的
        //(为了更好的解耦合)
        //模块/代码之间,关联关系越紧密,就认为耦合性越高
        //关联关系越不紧密,认为耦合性越低
        //写代码的时候要追求"低耦合""高内聚"
        //代码有很多模块,希望每个模块和模块之间的耦合性能尽量低

    }

}
