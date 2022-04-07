package AnimalTest;

/**
 * Created with IntelliJ IDEA.
 * Description: Hello,I would appreciate your comments~
 * User:
 * Date: -04-07
 * Destination:
 */
public class Cat extends Animal{

    public Cat(String name, int age) {
        super(name, age);
    }
    @Override
    public void eat() {
        System.out.println(name+"吃鱼");
    }
    public static void main(String[] args) {
     Dog.a = 3;
    }
}
