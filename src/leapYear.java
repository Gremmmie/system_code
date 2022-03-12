import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description: Hello,I would appreciate your comments~
 * User: Gremmie
 * Date: 2022-03-12
 * Destination:
 */
public class leapYear {
    public static void main(String[] args) {
        int i;
        for(i = 1000;i<=2000;i++){
            if(i%4==0){
                if(i%400==0){
                    System.out.println(i);
                    continue;
                }else if(i%100==0){
                    continue;
                }else {
                    System.out.println(i);
                    continue;
                }
            }
        }


    }
}
