/**
 * Created with IntelliJ IDEA.
 * Description: Hello,I would appreciate your comments~
 * User:
 * Date: -03-25
 * Destination:
 */

class Person {//相当于一个图纸
    public String name;
    public int age;

    public void eat(){
        System.out.println("吃饭");
    }
    public void sleep(){
        System.out.println("睡觉");
    }
}

public class TestDemo {
    public static void main(String[] args) {
        int a = 10;
//        实例化一个对象【通过new关键字来创建了一个对象】
        Person person = new Person();
//        用类（相当于图纸）来实例化对象
    }
}
