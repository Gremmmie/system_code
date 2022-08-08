package thread;

public class Test18 {
    public volatile int a = 0;

    public void increase() {
        a++;
    }

    public static void main(String[] args) {
        final Test18 test18 = new Test18();
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(() -> {
                for (int j = 0; j < 1000; j++) {
                    test18.increase();
                }
            });
            thread.start();
            while (Thread.activeCount() > 1) {
                Thread.yield();
            }
            System.out.println(test18.a);
        }
    }
}
