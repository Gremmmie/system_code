import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description: Hello,I would appreciate your comments~
 * User:
 * Date: 2022-03-11
 * Destination:
 */
public class Both3And5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入你的姓名");
        String name = scan.next();//读取直到空格
        System.out.println("姓名："+name);
        System.out.println("请输入你的生日，带空格");
        scan.nextLine();//用于清除输入缓冲区的\n
        String haveSpace = scan.nextLine();
        System.out.println("生日："+haveSpace);//会读取空格
        scan.close();
    }



    public static void main2(String[] args) {
        int sum1 = 0,sum2=0;
        int i,j;
        for(i=1;i<=100;i++){
            if(i%2==1){
                sum1 += i;
            }else {
                sum2 += i;
            }
        }
        System.out.println(sum1+" "+sum2);
    }


    public static void main1(String[] args) {
        int i=1;
        while(i<=100){
            if(i%15==0){
                System.out.println(i);
                i++;
                continue;
            }
            i++;
        }
    }
}
