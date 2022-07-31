package thread;

public class Test10 {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            for (int i = 0;i<10;i++){
            }
        },"葛玉米");
        System.out.println(thread.getName()+":"+thread.getState());
        thread.start();
        while(thread.isAlive()){
            System.out.println(thread.getName()+":"+thread.getState());
        }
        System.out.println(thread.getName()+":"+thread.getState());
    }
}
