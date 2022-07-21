package thread;

/**
 * @author Gremmie102
 * @date 2022/7/21 11:41
 * @purpose :
 */
public class Demo6 {
    //1.单个线程,串行的,完成10亿次自增.
    //2.两个线程,并发的,完成10亿次自增
    private static final long COUNT = 20_0000_0000;
    private static void serial(){
        //需要把方法执行的时间给记录下来

        //记录当前的毫秒级时间戳
        long beg = System.currentTimeMillis();
        int a = 0;
        for (long i=0;i<COUNT;i++){
            a++;
        }
        a = 0;
        for (long i = 0;i < COUNT;i++){
            a++;
        }

        long end = System.currentTimeMillis();
        System.out.println("单线程消耗时间:"+(end-beg)+"ms");
    }

    private static void concurrency(){//并发
        long beg = System.currentTimeMillis();
        Thread t1 = new Thread(()->{
            int a = 0;
            for (long i =0;i<COUNT;i++){
                a++;
            }
        });
        Thread t2 = new Thread(()->{
            int a = 0;
            for (long i =0;i<COUNT;i++){
                a++;
            }
        });
        t1.start();
        t2.start();

        try{
            t1.join();//这里的join是等待线程结束,等待线程把自己的run方法执行完
            //在主线程中调用t1.join,意思就是让main线程等t1执行完
            t2.join();
            //t1 t2是会开始执行,同时不等t1 t2执行玩,main线程就往下走了,于是就结束计时
            //此处的即使,是为了衡量t1和t2的执行时间,正确的做法应该是等到t1和t2都执行完再计时
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        long end = System.currentTimeMillis();
        System.out.println("单线程消耗时间:"+(end-beg)+"ms");
    }

    public static void main(String[] args) {
//        serial();
        concurrency();
    }
}
