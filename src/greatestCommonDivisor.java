import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description: Hello,I would appreciate your comments~
 * User: Gremmie
 * Date: 2022-03-12
 * Destination:
 */
public class greatestCommonDivisor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入两个正整数：");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int i,num=1;
        for(i=1;i<=(a<b?a:b);i++){
            if(0==a%i&&0==b%i&&i>num){
                num=i;
            }
        }
        System.out.println("最大公约数为："+num);
    }
}
