package ProtectedTest;

/**
 * Created with IntelliJ IDEA.
 * Description: Hello,I would appreciate your comments~
 * User:
 * Date: -04-05
 * Destination:
 */
//ProtectedTest包中
//同一个包中的子类
public class D extends B{
    public void method(){
        //super.a = 10;这里编译会报错，父类private成员在相同包的子类中不可见
        super.b = 20;//父类中protected成员在相同包子类中可以直接访问
        super.c = 30;//父类中public成员在相同包子类中可以直接访问
        super.d = 40;
    }
}
