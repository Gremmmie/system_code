/**
 * Created with IntelliJ IDEA.
 * Description: Hello,I would appreciate your comments~
 * User:
 * Date: -03-31
 * Destination:
 */
import static java.lang.Math.*;
public class Test {
    public static void main(String[] args) {
        double x = 30;
        double y = 40;

        //静态导入的方式写起来更方便
        //double result = Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
        double result = sqrt(pow(x,2)+pow(y,2));
        System.out.println(result);
    }










//    public static void main(String[] args) {
//        java.util.Date date = new java.util.Date();
//        System.out.println(date.getTime());
//    }
}
