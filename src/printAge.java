import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description: Hello,I would appreciate your comments~
 * User:
 * Date: 2022-03-12
 * Destination:
 */
public class printAge {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        if(a>=0||a<=18){
            System.out.println("少年");
        }else if(a>=19||a<=28) {
            System.out.println("青年");
        }else if(a>=29||a<=55){
            System.out.println("中年");
        }else if(a>=56){
            System.out.println("老年");
        }else {
            System.out.println("请输入正确的年龄");
        }
        scan.close();
    }
}
