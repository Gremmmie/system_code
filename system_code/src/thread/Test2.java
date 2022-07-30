package thread;

public class Test2 {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            for (int i = 0;i<10;i++){
                System.out.println(Thread.currentThread().getName()+"还活着");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName()+"即将死去");
        });
        System.out.println(Thread.currentThread().getName()
                +"的ID:"+thread.getId());
        System.out.println(Thread.currentThread().getName()
                +"的状态:"+thread.getState());
        System.out.println(Thread.currentThread().getName()
                +"的优先级:"+thread.getPriority());
        System.out.println(Thread.currentThread().getName()
                +"的后台线程:"+thread.isDaemon());
        System.out.println(Thread.currentThread().getName()
                +"的存活状态:"+thread.isAlive());
        System.out.println(Thread.currentThread().getName()
                +"是否被中断:"+thread.isInterrupted());
        thread.start();
        while(thread.isAlive()){
            System.out.println(Thread.currentThread().getName()
                    +"的状态:"+thread.getState());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
