/**
 * Created with IntelliJ IDEA.
 * Description: Hello,I would appreciate your comments~
 * User: Gremmie
 * Date: 2022-03-11
 * Destination:提示用户输入两人的生日( 只要月和日)，以及今天的月和日信息。该
 * 程序将计算出距离每个人生日的天数，以及谁会先过下一个生日
 */
import java.lang.*;
import java.util.Scanner;
public class BirthdayDistance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入今天的日期（几月份几日)");
        int month = scan.nextInt();
        int day = scan.nextInt();
        System.out.print("请输入你的生日：");
        int BirthMonth = scan.nextInt();
        int BirthDay = scan.nextInt();
        int BirthDays = BirthDay;
        int BirthMonth2 = BirthMonth-1;
        int days=day;
        int day3=0;
        int month2 = month-1;
        for(int i = 1; i<=month-1; i++){
            if (i==1||i==3||i==5||i==7||i==8||i==10||i==12){
                month2--;
                days+=31;
            } else if (i==2) {
                month2--;
                days+=29;
            } else if (i==4||i==6||i==9||i==11){
                month2--;
                days+=30;
            }

        }
        for(int i = 1; i<=BirthMonth-1; i++){
            if (i==1||i==3||i==5||i==7||i==8||i==10||i==12){
                BirthMonth2--;
                BirthDays+=31;
            } else if (i==2) {
                BirthMonth2--;
                BirthDays+=29;
            } else if (i==4||i==6||i==9||i==11){
                BirthMonth2--;
                BirthDays+=30;
            }
            day3 = BirthDays - days;

        } System.out.println("还有"+day3+"天过生日");

    }
}
