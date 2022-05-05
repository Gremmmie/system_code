package OtherClass;

/**
 * Created with IntelliJ IDEA.
 * Description: Hello,I would appreciate your comments~
 * User:
 * Date: -04-11
 * Destination:
 */
public class Base {
    public Base(){
        System.out.println("父类Base的构造函数");
    }
}
//class Derived extends OtherClass.Base{
//    public Derived(){
//        //super();//注意子类构造方法中默认会调用基类的无参构造方法：super();
//        //用户没有写super();给父类初始化的时候，编译器会自动添加，
//        // 而且super();必须是子类构造方法中的第一条语句
//        //并且只能出现一次
//        System.out.println("子类Derived的构造函数被调用了");
//    }
//
//    public static void main(String[] args) {
//        Derived d =new Derived();
//    }
//}
