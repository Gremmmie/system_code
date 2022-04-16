import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description: Hello,I would appreciate your comments~
 * User:
 * Date: -04-16
 * Destination:
 */
public class LastStringLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
//        while(scanner.hasNextLine()){
//            String str = scanner.nextLine();
//            int index = str.lastIndexOf(" ");
//            String ret = str.substring(index+1);
//            System.out.println(ret.length());
//        }

        String[] s1 = s.split(" |@");
        System.out.println(s1[s1.length-1].length());
    }
}
