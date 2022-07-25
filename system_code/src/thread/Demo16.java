package thread;

import java.util.Scanner;

/**
 * @author Gremmie102
 * @date 2022/7/25 11:00
 * @purpose :
 */
public class Demo16 {
    //写一个内部类,此时这个内部类就处在Demo16的内容
    //与包中重复的Counter类没有影响
    static class Counter{
        //volatile操作相当于显式地禁止了编译器进行上述优化,
        //是给这个对应的变量加上了"内存屏障",
        //JVM在读取这个变量的时候,因为内存屏障的存在,就知道要每次都重新读取这个内存的内容
        //而不是进行草率的优化
        //频繁读内存,速度是慢了,但是数据算对了
        volatile public int flag = 0;

    }
    public static void main(String[] args) {
        Counter counter = new Counter();
        Thread t1 = new Thread(() -> {
            while (counter.flag==0){
//                加一个sleep也行
//                try{
                    //编译器的优化,是根据代码的实际情况来进行的
                    //上个版本里面循环体时空,所以循环转速极快,
                    // 导致了都内存操作非常频繁
                    //所以就触发了优化.
                    //这个版本里加了sleep,让循环转速一下就满了,都内存操作就不怎么频繁了,
                    //就不处罚优化了
                    //虽然没写volatile,也能正常运行了
//                    Thread.sleep(100);
//                }catch (InterruptedException e){
//                    e.printStackTrace();
//                }
                //执行循环,但是此处循环啥都不做
            }
            System.out.println("t1结束");
        });
        t1.start();
        //t1做的工作:LOAD都内存的数据到CPU寄存器
        //TEST检测CPU寄存器的值是否和预期的一样
        //反复进行多次
        //都内存比读CPU寄存器慢几千倍上万倍
        //意味着当前的t1的操作主要就是慢在LOAD上
        //编译器一看,干LOAD,每次LOAD的结果又没啥变化,所以它直接进行了优化
        //那就相当于只从内存中读取一次数据然后 后续就直接从寄存器里反复TEST就好了


        //内存可见性问题,按理说这里输入1的话,上面的while循环就会停止,
        //但结果是循环一直在进行
        //编译器看到这个线程也没做修改,所以就进行了优化
        //但是t2线程对这个变量修改了,t1线程没从内存中看到

        Thread t2 = new Thread(() -> {
            //让用户输入一个数字,赋值给flag
            Scanner s = new Scanner(System.in);
            System.out.println("请输入一个整数:");
            counter.flag = s.nextInt();
        });
        t2.start();
    }
}
