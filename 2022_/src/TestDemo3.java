/**
 * Created with IntelliJ IDEA.
 * Description: Hello,I would appreciate your comments~
 * User:
 * Date: -03-22
 * Destination:
 */
//只能有一个public类
class Person {

    //    1、属性[成员变量]：定义在类当中，方法外面的
    public String name;
    public int age;

    //成员方法
    public void sleep() {
        int a = 10;//局部变量
        System.out.println("睡觉！");
    }

    public void eat(){
        System.out.println("吃饭");
    }
}
//以后尽量一个Java文件只有一个类
public class TestDemo3 {
}
