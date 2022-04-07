package AnimalTest;

/**
 * Created with IntelliJ IDEA.
 * Description: Hello,I would appreciate your comments~
 * User:
 * Date: -04-07
 * Destination:
 */
public class Dog extends Animal{
    public static int a =1;
    private static int b =1;
    //注意观察上面两个的访问限定修饰符
    public Dog(String name, int age) {
        super(name, age);
    }
    @Override
    public void eat() {
        super.eat();
    }
    public static void main(String[] args) {
        Dog.a = 2;
        Dog.b = 2;
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
}
