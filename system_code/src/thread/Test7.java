package thread;

public class Test7 {
    public static void main(String[] args) throws InterruptedException {
        Runnable target = () -> {
          for (int i=0;i<3;i++){
              System.out.println(Thread.currentThread().getName()
              +":我在工作中~");
              try {
                  Thread.sleep(1000);
              } catch (InterruptedException e) {
                  e.printStackTrace();
              }
          }
            System.out.println(Thread.currentThread().getName()
            +":我运行结束了");
        };
        Thread thread1 = new Thread(target,"何二傻");
        Thread thread2 = new Thread(target,"葛玉米");
        System.out.println(Thread.currentThread().getName()+
                ":何二傻先开始工作");
        thread1.start();
        thread1.join();
        System.out.println(Thread.currentThread().getName()
                +":何二傻工作结束了,换葛玉米上来干活");
        thread2.start();
        thread2.join();
        System.out.println(Thread.currentThread().getName()
                +":葛玉米工作结束");
    }
}
