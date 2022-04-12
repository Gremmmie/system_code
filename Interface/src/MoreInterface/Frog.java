package MoreInterface;

/**
 * Created with IntelliJ IDEA.
 * Description: Hello,I would appreciate your comments~
 * User:
 * Date: -04-12
 * Destination:
 */
public class Frog extends Animal implements IRunning,ISwimming{
    public Frog(String name){
        super(name);
    }

    @Override
    public void run() {
        System.out.println("青蛙"+this.name+"正在跑");
    }

    @Override
    public void swim() {
        System.out.println("青蛙"+this.name+"正在游泳");
    }
}
