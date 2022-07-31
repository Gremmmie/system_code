package thread;

public class Test8 {
    public static void main(String[] args) {
        myThread mt = new myThread();
        new Thread(mt).start();
        new Thread(mt, "Name1").start();
        new Thread(mt, "Name2").start();

        System.out.println(Thread.currentThread().getName()); // main主方法
        //      System.out.println(this.getName());     // this获取不到线程对象
    }
    static class myThread extends Thread {
        @Override public void run() {
            try {
                Thread.sleep(3000);
                Thread t = Thread.currentThread();
                System.out.println("当前线程名字：" + t.getName() + " 当前线程的优先级别为：" + t.getPriority() + " ID:" + t.getId());
                //           System.out.println("当前线程名字：" + this.getName() + " 当前线程的优先级别为：" + this.getPriority() + " ID:"+ this.getId());
            } catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

