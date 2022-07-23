package thread;

/**
 * @author Gremmie102
 * @date 2022/7/23 10:36
 * @purpose :
 */
public class Demo10 {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> {
            while (!Thread.currentThread().isInterrupted()){
                //这里的currentThread()为获取到当前线程的实例(Thread对象)
                //这个方法总是会有一个线程调用它.
                //线程1调用这个方法,就能返回线程1的Thread的对象
                //线程2调用这个方法,就能返回线程2的Thread的对象
                //isInterrupted()为线程的标志位
                System.out.println("线程运行中");
                try {
                    Thread.sleep(1000);
                    //sleep就是典型造成阻塞的方法
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    //1.立即退出
                    // break;

                    System.out.println("新线程即将退出");
                    //2.稍后推出,此处的sleep可换成其他收尾操作
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                    break;
                }
            }
        });
        t.start();

        Thread.sleep(5000);
        System.out.println("控制线程退出");
        t.interrupt();
    }
    //程序运行后会出现异常,但异常出现,线程还是会在继续运行,这里的原因是try-catch那里什么都没有交代
    //注意理解interrupt方法的行为:
    //1.如果t线程没有处在阻塞状态,此时interrupt就会修改内置的标志位
    //2.如果t线程正在处于阻塞状态,此时interrupt就会触发一个interruptException
    //正是这样的try-catch捕获操作,程序员就可以自行控制线程的退出行为了
    //1.可以立即退出 2.可以等一会退出 3.不退出
}
