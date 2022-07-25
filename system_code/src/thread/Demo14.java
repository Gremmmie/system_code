package thread;

/**
 * @author Gremmie102
 * @date 2022/7/24 18:43
 * @purpose :
 */
//创建两个线程,让这两个线程同时并发的对一个变量,自增5w次,最终预期能够一共自增10w次
class  Counter{
    //用来保存计数的变量
    public int count;

     public void increase(){
         //多个线程去调用Increase方法,其实就是在针对这个counter对象来枷锁
         //此时如果一个线程获取到锁了,另外的线程就要阻塞等待
         //但是如果多个线程是尝试对不同的对象加锁,则互相之间不会产生互斥的情况
         //在Java里,任何一个对象,都可以用来作为锁对象,
         // (都可以放在synchronized的括号中)
         //每个对象,内存空间中有一个特殊的区域:对象头(JVM自带的,对象的一些特殊信息)
         synchronized(this){
             count++;
         }

    }
}
public class Demo14 {
    //这个实例用来进行累加
    public static Counter counter = new Counter();

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for (int i=0;i<50000;i++){
                counter.increase();
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i=0;i<50000;i++){
                counter.increase();
            }
        });
        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("count:"+counter.count);

    }
}
