package ProtectTest2;

/**
 * Created with IntelliJ IDEA.
 * Description: Hello,I would appreciate your comments~
 * User:
 * Date: -04-05
 * Destination:
 */
//ProtectedTest2的包中
//不同包中的子类
public class TestC {
    public static void main(String[] args) {
        C c = new C();
        c.method();

        //System.out.println(c.a);
        //这里编译会报错，父类中private成员在不同包其他类中不可见

        //System.out.println(c.b);
        //这里也会报错，父类中protected成员在不同包其他不是继承的类中不能直接访问

        System.out.println(c.c);
        //父类中public成员在不同包其他类中可以直接访问

        //System.out.println(c.d);
        //父类中默认访问权限修饰的成员在不同包其他类中不能直接访问
    }
}
