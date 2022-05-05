package OtherClass;

import java.util.Random;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description: Hello,I would appreciate your comments~
 * User:
 * Date: -03-14
 * Destination:这是一个石头剪刀布的游戏
 */
public class RockGame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        int num=1;
        String chose;
        do{
            int PC = random.nextInt(3);
            String a;
            if(PC>=0&&PC<1){
                a = "R";//Rock石头
            }else if(PC>=1&&PC<2){
                a = "P";//Paper布
            }else {
                a = "S";//Scissors剪刀
            }
            System.out.println("Game "+num+":");
            System.out.print("Choose your weapon?");
            String I = scan.next();
            System.out.print("I chose the weapon:"+a);
            if(I.equals("R")){
                if(a.equals("R")){
                    System.out.println("Tie!");
                }else if(a.equals("S")){
                    System.out.println("You win!");
                }else {
                    System.out.println("You lose!");
                }
            }else if(I.equals("P")){
                if(a.equals("R")){
                    System.out.println("You win!");
                }else if(a.equals("S")){
                    System.out.println("You lose!");
                }else {
                    System.out.println("Tie!");
                }
            }else if (I.equals("S")){
                if(a.equals("R")){
                    System.out.println("You lose!");
                }else if(a.equals("S")){
                    System.out.println("Tie!");
                }else {
                    System.out.println("You win!");
                }
            }
            System.out.println("Do you want to play again?");
            System.out.println("是就输入Y,否就输入N");
            chose = scan.next();
            num++;
        }while(chose.equals("Y"));
        scan.close();
    }
}
