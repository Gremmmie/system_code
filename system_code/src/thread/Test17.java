package thread;

public class Test17 {
    volatile static boolean flag = true;
    static int count = 0;
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            for (int i=0;i<10000;i++){
                if (i==9999) flag = false;
            }
        });
        Thread thread2 = new Thread(() -> {
           while (flag){
                count++;
           }
            System.out.println("满10000啦,循环次数为:"+count);
        });
        thread1.start();
        thread2.start();
    }
}
