import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description: Hello,I would appreciate your comments~
 * User:
 * Date: -03-20
 * Destination:写一个递归方法，输入一个非负整数，返回组成它的数字之和
 */
public class zuchengshuziSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        System.out.println(factorialSum(x));
    }
    public static int factorialSum(int a){
        if(a>9){
            return a%10+factorialSum(a/10);
        }else {
            return a;
        }
    }
}
