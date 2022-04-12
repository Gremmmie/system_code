package MoreInterface;

/**
 * Created with IntelliJ IDEA.
 * Description: Hello,I would appreciate your comments~
 * User:
 * Date: -04-12
 * Destination:
 */
public class TestDemo1 {
    public static void walk(IRunning iRunning){
        System.out.println("我带着小伙伴去散步");
        iRunning.run();
    }

    public static void main(String[] args) {
        Cat cat = new Cat("小猫");
        walk(cat);

        Frog frog = new Frog("小青蛙");
        walk(frog);
    }
}
