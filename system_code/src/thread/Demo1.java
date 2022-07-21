package thread;

/**
 * @author Gremmie102
 * @date 2022/7/21 9:15
 * @purpose : 关于多线程的一些代码
 */
class MyThread extends Thread{
    public void run(){
        //这个run方法重写的目的,是为了明确,咱们新创建出来的线程要干啥活
        while(true){
            System.out.println("hello thread!");
        }

    }
}
public class Demo1 {
    public static void main(String[] args) {
        //创建一个线程
        //Java中创建线程,离不开一个关键的类.Thread
        //其中一种比较朴素的创建方式,是写一个子类,继承Thread,重写其中的run方法
        //光创建了这个类,还不算创建线程,还得创建实例
        Thread t = new MyThread();//向上转型的写法,可写可不写
        t.start();//这才是真正开始创建线程
        //(在操作系统内核中,创建出对应线程的PCB,然后让这个PCB加入到系统链表中,参与调度)

        //在这个代码中,虽然先启动的线程,后打印的hello main
        //但是实际执行的时候,看到的确实,先打印了hello main ,后打印了hello thread!
        //这是因为:
        // 1.每个线程是独立的执行流,
        //main对应的线程是一个执行流,MyThread是另一个执行流.
        //这两个执行流之间是并发的执行关系(并发+并行)
        //2.此时两个线程执行的先后顺序,取决于操作系统调度器具体实现
        //(程序员可以把这里的调度规则,简单得视为"随机调度")
        //System.out.println("hello main");

        //虽然反复运行了多次,好像结果都是一样的,但我们的顺序仍然是不可确定的
        //当前看到的先打印main,大概率是受到创建县城自身的开销影响的.
        //哪怕连续运行1000次main在前,也不能保证1001次的时候不出现thread在前!
        //*编写多线程代码的时候,一定要注意到!
        //默认情况下,多个线程的执行顺序,是"无序",是"随机调度"的

        //进程的退出码为:exit code 0
        //操作系统中用进程的退出码来表示"进程的运行结果"
        //使用0表示进程执行完毕.结果正确
        //使用非0表示进程执行完毕,结果不正确
        //还有个别情况main还没返回呢,进程就崩溃,此时返回的值很可能是一个随机值

        //我们可以想办法让这个进程别结束得那么快,好看清楚这个进程
        //我们可以搞两个si循环
        while(true){
            System.out.println("hello main");
        }
        //运行之后我们就可以发现,main和thread交替打印
        //每一波打印机个,切换到下一波是什么时候,都是不确定的,都是由调度器控制的

        //在JDK里提供了一个jconsole这样的工具,可以看到Java进程里的线程详情.
        //在jdk/bin/jconsole.exe
        //启动之后先选择我们要看哪个Java进程
        //少数情况打开jconsle时,可能不显示这里的进程列表.
        //这个时候退出,然后右键管理员运行.
        //在标签页中选择线程,往下翻,在左下角部分可以查询到当前Java进程中的线程信息了
    }
}
