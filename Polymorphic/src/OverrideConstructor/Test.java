package OverrideConstructor;

/**
 * Created with IntelliJ IDEA.
 * Description: Hello,I would appreciate your comments~
 * User:
 * Date: -04-07
 * Destination:
 */
class B{
    public B(){
        func();
    }
    public void func(){
        System.out.println("B.func()");
    }
}
class D extends B{
    private int num = 1;
    public void func(){
        System.out.println("D.func()"+num);
    }
}
public class Test {
    public static void main(String[] args){
        D d = new D();
    }
}
