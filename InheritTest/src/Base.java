/**
 * Created with IntelliJ IDEA.
 * Description: Hello,I would appreciate your comments~
 * User:
 * Date: -04-04
 * Destination:
 */
public class Base {
    public Base(){
        System.out.println("父类Base的构造函数");
    }
}
class Derived extends Base{
    public Derived(){
        //super();//注意子类构造方法中默认会调用基类的无参构造方法：super();
        //用户没有写super();给父类初始化的时候，编译器会自动添加，
        // 而且super();必须是子类构造方法中的第一条语句
        //并且只能出现一次
        System.out.println("子类Derived的构造函数被调用了");
    }

    public static void main(String[] args) {
        Derived d =new Derived();
    }
}



//public class Base{
//    int a;
//    int b;
//    public void methodA(){
//        System.out.println("Base中的methodA");
//    }
//    public void methodB(){
//        System.out.println("Base中的methodB");
//    }
//}
//
//class Derived extends Base{
//    int a;//与父类中成员变量同名且类型相同
//    char b;//与父类中成员变量同名但类型不同
//
//    //与父类中的methodA构成重载
//    public void methodA(int a){
//        System.out.println("Derived中的method方法");
//    }
//
//    //与基类中methodB构成重写
//    public void method(){
//        System.out.println("Derived中的methodB方法");
//    }
//    public void methodC(){
//        //对于同名的成员变量，直接访问时，访问的都是子类的
//        a = 100;//等价于：this.a = 100
//        b = 101;//等价于：this.b = 101
//        //注意：this是当前对象的引用
//
//        //访问父类的成员变量的时候，需要借助super关键字
//        //super是获取到子类对象中从基类继承下来的父类部分
//        super.a = 200;
//        super.b = 201;
//
//        //父类和子类中构成了重载的方法，直接可以通过参数列表区分清楚访问父类还是子类
//        methodA();//没有传参，访问父类中的methodA
//        methodA(20);//传递int参数，访问子类中的methodA(int)
//
//        //如果在子类中要访问重写的父类方法，则需要借助super关键字
//        methodB();//直接访问，则永远访问的是子类中的methodA，基类的无法访问到
//        super.methodB();//访问父类的methodB方法
//    }
//
//    public static void main(String[] args) {
//        Derived derived = new Derived();
//        derived.methodC();
//    }
//}
//public class Base {
//    public void methodA(){
//        System.out.println("Base中的methodA");
//    }
//    public void methodB(){
//        System.out.println("Base中的methodB");
//    }
//}
//class Derived extends Base{
//    public void methodA(int a){
//        System.out.println("Derived中的method（int）方法");
//    }
//    public void methodB(){
//        System.out.println("Derived中的methodB方法");
//    }
//    public void methodC(){
//        methodA();//这里没有传参，访问的是父类中的methodA
//        methodA(20);//传递了int参数，访问子类中的methodA(int)
//        methodB();//直接访问，则永远访问到的都是子类中的methodB(),基类的无法访问到
//    }
//
//    public static void main(String[] args) {
//        Derived derived = new Derived();
//        derived.methodC();
//    }
//}
//







//public class Base{
//    public void methodA(){
//        System.out.println("Base中methodA()");
//    }
//}
//class Derived extends Base {
//    public void methodB() {
//        System.out.println("Derived中的methodB方法");
//    }
//    public void methodC(){
//        methodB();//访问子类自己的methodB()
//        methodA();//访问父类继承的methodA()
//        //methodD();这里会编译失败，在整个继承体系中没有发现方法methodD()
//    }
//}


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
