package thread;
/**
 * 这里我们引入对象锁的应用
 */
public class Test12 {
    public static void main(String[] args) {
        final Object object = new Object();
        //先定义一个final修饰的object类,这样才能用进thread的lambda表达式中
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (object){
                    try {
                        System.out.println("我是t1,我开始等待");
                        object.wait();
                        System.out.println("我是t1,我结束等待");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
//                    while(true){
//                        try {
//                            Thread.sleep(1000);
//                            object.wait();
////                            Thread.currentThread().wait();
////                            System.out.println(Thread.currentThread().getName()
////                                    +"的状态:"+Thread.currentThread().getState());
//                        } catch (InterruptedException e) {
//                            e.printStackTrace();
//                        }
//                    }
                }
            }
        },"t1");
        t1.start();

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
//                System.out.println(Thread.currentThread().getName()
//                        +"的状态:"+Thread.currentThread().getState());
                synchronized (object){
                    System.out.println("我是t2,我在执行中");
                    object.notify();
                }

            }
        },"t2");
        t2.start();
    }
}

