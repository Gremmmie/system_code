import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description: Hello,I would appreciate your comments~
 * User:
 * Date: -03-12
 * Destination:输出n*n的乘法口诀表，n由用户输入。
 */
public class MultiplicationFormulaTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入n（nn乘法口诀表）");
        int n = scan.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+"×"+i+"="+(j*i)+" ");
            }
            System.out.println();
        }
    }
}
