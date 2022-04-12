package MoreInterface;

/**
 * Created with IntelliJ IDEA.
 * Description: Hello,I would appreciate your comments~
 * User:
 * Date: -04-12
 * Destination:
 */
//鹅
public class Goose extends Animal implements IRunning,ISwimming,IFlying{
    public Goose(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println(this.name+"正在飞");
    }

    @Override
    public void run() {
        System.out.println(this.name+"正在跑");
    }

    @Override
    public void swim() {
        System.out.println(this.name+"正在漂在水上");
    }
}
