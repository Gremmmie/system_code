package thread;
public class Test14 {
    static class Counter{
        int count = 0;
        void increase(){
            count++;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        final Counter counter = new Counter();
        Thread t1 = new Thread(() -> {
            for (int i=0;i<5000;i++){
                counter.increase();
            }
        },"t1");
        Thread t2 = new Thread(() -> {
            for (int i=0;i<5000;i++){
                counter.increase();
            }
        },"t2");
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(counter.count);
    }
}
