import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description: Hello,I would appreciate your comments~
 * User:
 * Date: -03-21
 * Destination:打印菱形
 */
public class javaHomework3_21 {


    public static void main(String[] args) {
        for(int line=1;line<=3;line++) {
            for(int z=(2*line-1);z<=5;z++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void main1(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (int i =0;i<5;i++){
            if (i<3){
                for (int j=0;j<2-i;j++){
                    System.out.print(" ");
                }
                for (int j=0;j<2*i+1;j++){
                    System.out.print("*");
                }
                for (int j=0;j<2-i;j++){
                    System.out.print(" ");
                }
            }else if(i>=3){
                for (int j=0;j<i-2;j++){
                    System.out.print(" ");
                }
                for(int j=0;j<9-2*i;j++){//5-2*(i-3)==5-2*i+6
                    System.out.print("*");
                }
                for (int j=0;j<i-2;j++){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void print(int i) {
        if (i<3){
            for (int j=0;j<2-i;j++){
                System.out.print(" ");
            }
            for (int j=0;j<2*i+1;i++){
                System.out.print("*");
            }
            for (int j=0;j<2-i;j++){
                System.out.print(" ");
            }
        }else if(i>3){
            for (int j=0;j<i-3;j++){
                System.out.print(" ");
            }
            for(int j=0;j<11-2*i;j++){//5-2*(i-3)==5-2*i+6
                System.out.print("*");
            }
            for (int j=0;j<i-3;j++){
                System.out.print(" ");
            }
        }
    }
}
