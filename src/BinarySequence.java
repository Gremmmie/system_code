import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description: Hello,I would appreciate your comments~
 * User: Gremmie
 * Date: 2022-03-12
 * Destination:
 */
public class BinarySequence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入您的数：");
        int a = scan.nextInt();
        String b = Integer.toBinaryString(a);
        System.out.print("偶数位：");
        for(int i=1;i<b.length();i+=2){

            System.out.print(b.charAt(i)+" ");
        }
        System.out.println();
        System.out.print("奇数位：");
        for(int i=0;i<b.length();i+=2){
            System.out.print(b.charAt(i)+" ");
        }

    }
}

