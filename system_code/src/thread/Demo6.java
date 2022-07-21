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

    public static void main(String[] args) {
        serial();
    }
}
