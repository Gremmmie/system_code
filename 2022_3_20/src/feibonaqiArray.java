import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description: Hello,I would appreciate your comments~
 * User:
 * Date: -03-20
 * Destination:递归求斐波那契数列的第 N 项
 */
public class feibonaqiArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(fib1(n));
    }
    public static int fib1(int n){
        if(n==1 || n==2){
            return 1;
        }
        return fib1(n-1)+fib1(n-2);
    }
//    我们可以使用递归的方式去求出斐波那契数列的第N项，但重复运算太多了，用循环更高效
}
