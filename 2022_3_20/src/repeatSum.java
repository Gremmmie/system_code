/**
 * Created with IntelliJ IDEA.
 * Description: Hello,I would appreciate your comments~
 * User:
 * Date: -03-20
 * Destination:在同一个类中,分别定义求两个整数的方法 和 三个小数之和的方法。
 * 并执行代码，求出结果
 */
public class repeatSum {
    public static void main(String[] args) {
        int a=1,b=2;
        double c=1.0,d=2.0;
        String e="e",f="f";
        System.out.println(add(a,b));
        System.out.println(add(c,d));
        System.out.println(add(e,f));
    }
    public static int add(int a,int b){
        return a+b;
    }
    public static double add(double c,double d){
        return  c+d;
    }
    public static String add(String e,String f){
        return e+f;
    }
}
