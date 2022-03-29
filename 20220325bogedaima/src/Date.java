/**
 * Created with IntelliJ IDEA.
 * Description: Hello,I would appreciate your comments~
 * User:
 * Date: -03-29
 * Destination:
 */
public class Date {
    public int year;
    public int month;
    public int day;

    public Date(){
        System.out.println(this.year);
        System.out.println(this.month);
        System.out.println(this.day);
    }
    public Date(int year,int month,int day){
        //成员变量在定义之前，并没有给出初始值，那为什么就可以使用呢？
        System.out.println(this.year);
        System.out.println(this.month);
        System.out.println(this.day);
    }

    public static void main(String[] args) {
        //此处a并没有初始化，编译器报错；
        //Error：（24，28）Java：可能尚未初始化变量a
        //int a;
        //System.out.println(a);
        Date d1 = new Date(2022,3,29);
        Date d2 = new Date();
    }
}
