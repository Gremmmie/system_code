import java.util.Random;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description: Hello,I would appreciate your comments~
 * User:葛玉礼
 * Date: 2022-03-11
 * Destination:3月11号上课的内容
 */
public class Both3And5 {
    public static void main(String[] args) {

    }


    public static void main5(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();//括号中可以添加种子
        //空的话就是按照时间戳生成随机数
        int randNum = random.nextInt(100)+1;//没有加一是[0,100)
        //加一之后是[1,101)
        while(true){
            System.out.println("请输入你要猜的数字（范围是1-100）：");
            int num = scan.nextInt();
            if(num<randNum) {
                System.out.println("猜小了！");
            }else if(num== randNum) {
                System.out.println("猜对了！");
                break;
            }else {
                System.out.println("猜大了！");
            }
        }
    }



    public static void main4(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            int i = scan.nextInt();
            System.out.println(i);
        }
    }//Ctrl+D结束程序进行




    public static void main3(String[] args) {
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
