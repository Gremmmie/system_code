import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description: Hello,I would appreciate your comments~
 * User: Gremmie
 * Date: 2022-03-12
 * Destination:
 */
public class primeNum2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int i,b=1;
        for(i=2;i<(a/2.0);i++){
            if(0==a%i){
                System.out.println("不是");
                b=0;
                break;
            }else {
                continue;
            }
        }
        if(2==a||1==b){
            System.out.println("是");
        }
    }
}
