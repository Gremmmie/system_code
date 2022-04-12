package MoreInterface;

/**
 * Created with IntelliJ IDEA.
 * Description: Hello,I would appreciate your comments~
 * User:
 * Date: -04-12
 * Destination:
 */
public class Cat extends Animal implements IRunning{
    public Cat(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("小猫"+this.name+"正在跑");
    }
}
