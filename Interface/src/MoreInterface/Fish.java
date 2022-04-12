package MoreInterface;

/**
 * Created with IntelliJ IDEA.
 * Description: Hello,I would appreciate your comments~
 * User:
 * Date: -04-12
 * Destination:
 */
public class Fish extends Animal implements ISwimming{
    public Fish(String name){
     super(name);
    }

    @Override
    public void swim() {
        System.out.println("小鱼"+this.name+"正在游泳");
    }
}
