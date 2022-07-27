package thread;

/**
 * @author Gremmie102
 * @date 2022/7/27 11:08
 * @purpose : 单例模式
 */
//单例,饿汉的方式
    //按照现在的代码,当Singleton类被加载的时候
    //就会执行到此处的实例化操作
class Singleton{
    //类属性就长在类对象上,而类对象在类中只有一份
    private static Singleton instance = new Singleton();

    public static  Singleton getInstance() {
        return instance;
        //后续如果需要使用这个示例,统一基于getInstance方法来获取咱们的实例
    }

    //我们把构造方法设为私有,其他的类想来new就不行了
    //堵住了new创建新实例的口子
    private Singleton(){

    }
}

//首次调用getInstance才会创建实例
class SingletonLazy {
    private static SingletonLazy instance = null;

    public static  SingletonLazy getInstance() {
        //当线程已经安全了之后,再尝试这样加锁,其实就非常影响效率了
        //该加锁的地方要加,不该加锁的地方不能乱写
        //我们再加上一层if判定就好了
        if (instance == null){
            //外层if判定当前是否已经初始化好
            //如果未初始化好,就尝试加锁,如果已经初始化好,那么就继续往下走
            synchronized (SingletonLazy.class){
                //加锁可能涉及到阻塞,前面的if和后面的if中间的间隔,可能是沧海桑田
                if (instance == null){
                    /**
                     * 这个在再多个线程尝试初始化,产生了锁竞争,
                     * 这些参与竞争的线程,拿到锁之后,再进一步确认,是否真的要初始化
                     * ----------------------------
                     * 不要以为这里的两个if判断是多余的
                     * 不能用单线程的理解方式来看待多线程代码
                     * 如果是单线程,连续两个一样的if判定确实无意义
                     * 但是多线程就不是了,尤其是中间隔了个加锁的操作
                     */

                    instance = new SingletonLazy();
                }
            }
        }


        return instance;
    }
    private SingletonLazy() {

    }
}

public class Demo19 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2);//返回true
    }
}
