/**
 * Created with IntelliJ IDEA.
 * Description: Hello,I would appreciate your comments~
 * User:葛玉礼
 * Date: -04-03
 * Destination:静态内部类
 */
public class OutClass {
    private int a;
    static int b;
    public void methodA(){
        a = 10;
        System.out.println(a);
    }

    public static void methodB(){
        System.out.println(b);
    }

    //静态内部类:被static修饰的成员内部类
    static class InnerClass{
        public void methodInner(){
            //在静态内部类中只能访问外部类的静态成员
            //a = 100;
            //哈哈,这里就会编译失败了,因为a不是类成员变量
            b = 200;
            //methodA();
            //哈哈!这里也会编译失败,因为method没有用static修饰,也不是类成员方法
            methodB();
        }
    }
    public static void main(String[] args){
        //静态内部类对象的创建 以及 成员的访问
        OutClass.InnerClass innerClass = new OutClass.InnerClass();
        innerClass.methodInner();
    }
}
