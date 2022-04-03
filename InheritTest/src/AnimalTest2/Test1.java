package AnimalTest2;

/**
 * Created with IntelliJ IDEA.
 * Description: Hello,I would appreciate your comments~
 * User:
 * Date: -04-04
 * Destination:
 */
public class Test1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        //dog类中并没有定义任何成员变量，name和age属性肯定使从父类Animal中继承下来的
        System.out.println(dog.name);
        System.out.println(dog.age);

        //dog访问的eat()和sleep()方法也是从Animal中继承下来的
        dog.eat();
        dog.sleep();
        dog.bark();
    }
}
