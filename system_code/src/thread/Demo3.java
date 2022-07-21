package thread;

/**
 * @author Gremmie102
 * @date 2022/7/21 11:06
 * @purpose :创建多线程的第三种方法 匿名内部类
 */
public class Demo3 {
    public static void main(String[] args) {
        Thread t = new Thread(){//此处就是在创建了一个匿名的内部类(没有名字)
            //这个匿名内部类是Thread的子类
            //同时前面new关键字,就给这个匿名内部类创建出了一个实例.
            //一条龙:1.继承 2.方法重写 3.实例化
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
        };//到这里线程知识准备好了,并没有被真正创建出来
        //执行了start方法,才真正在操作系统中创建了线程!
        //Thread实例是Java对于线程的表示
        //实际上要想真的跑起来,还是需要操作系统里面的线程
        //创建好Thread,此时系统里面还没有线程
        //直到调用start方法,系统才真正开始创建线程.
        //1.创建PCB 2.把PCB加入到链表中
        t.start();
    }
}
