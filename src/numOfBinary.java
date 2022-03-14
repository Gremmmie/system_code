import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description: Hello,I would appreciate your comments~
 * User:
 * Date: -03-12
 * Destination:求一个整数，在内存当中存储时，二进制1的个数。
 */
public class numOfBinary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("求一个整数，在内存当中存储时，二进制1的个数,输入这个整数：");
        int a = scan.nextInt();
        int num=0;
        String b = Integer.toBinaryString(a);
        for(int i=0;i< b.length();i++){
            if('1'==b.charAt(i)){
                num++;
            }
        }
        System.out.println("二进制中1的个数为"+num);
    }
}
