package thread;

public class Test9 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(System.currentTimeMillis());
        Thread.sleep(3000);
        System.out.println(System.currentTimeMillis());
    }
}
