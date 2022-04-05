package ProtectTest2;

import ProtectedTest.B;

/**
 * Created with IntelliJ IDEA.
 * Description: Hello,I would appreciate your comments~
 * User:
 * Date: -04-05
 * Destination:
 */
//ProtectedTest2的包中
//不同包中的子类
public class C extends B {
    public void method(){
        //super.a = 10;这里编译报错，父类中private成员在不同包子类中不可见
        super.b = 20;//父类中protected修饰的成员在不同包继承的子类中可以直接访问
        super.c = 30;//父类中public修饰的成员在不同包子类中可以直接访问
        //super.d = 40//父类中默认访问权限修饰的成员在不同包子类中不能直接访问
    }
}


