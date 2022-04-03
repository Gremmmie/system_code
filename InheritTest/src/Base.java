/**
 * Created with IntelliJ IDEA.
 * Description: Hello,I would appreciate your comments~
 * User:
 * Date: -04-04
 * Destination:
 */
public class Base{
    public void methodA(){
        System.out.println("Base中methodA()");
    }
}
class Derived extends Base {
    public void methodB() {
        System.out.println("Derived中的methodB方法");
    }
    public void methodC(){
        methodB();//访问子类自己的methodB()
        methodA();//访问父类继承的methodA()
        //methodD();这里会编译失败，在整个继承体系中没有发现方法methodD()
    }
}


//public class Base {
//    int a=10;
//    int b=101;
//    int c=100;
//}
//class Derived extends Base{
//    int a;  //这里与父类中成员a同名，且类型是相同的
//    char b; //与父类中成员b同名，但类型不同
//
//    public void method(){
//        a = 100;//访问父类继承的a，还是子类自己新增的a？
//        b = 101;//访问父类继承的b,还是子类自己新增的b？
//        c = 102;//子类中没有c，访问的肯定是从父类中继承下来的c
//        //d=103;//这里编译会失败，因为父类和子类都没有定义成员变量d
//    }
//
//    public static void main(String[] args) {
//        Derived derived = new Derived();
//        derived.method();
//        System.out.println(derived.a);
//        System.out.println(derived.b);
//        System.out.println(derived.c);
//    }
//}
