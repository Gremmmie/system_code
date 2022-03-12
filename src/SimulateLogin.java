import java.util.Scanner;
import static java.lang.System.exit;

/**
 * Created with IntelliJ IDEA.
 * Description: Hello,I would appreciate your comments~
 * User: Gremmie
 * Date: 2022-03-12
 * Destination:
 */
public class SimulateLogin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请初始化您的密码：");
        String a = scan.next();
        int num=0;
        do{
            System.out.println("你的密码是多少呀？");
            String b = scan.next();
            if(b.equals(a)){
                System.out.println("密码正确~");
                break;
            }else {
                System.out.println("密码错误！");

                num++;
                if(3==num){
                    System.out.println("你是假的吧！");
                    exit(0);
                }
                System.out.println("请重新输入您的密码：");
                continue;
            }
        }while(scan.hasNext());
    }
}
