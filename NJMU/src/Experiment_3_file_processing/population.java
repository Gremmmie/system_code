package Experiment_3_file_processing;

import java.io.*;
import java.util.*;
public class population {

    public static void main(String[] args)throws FileNotFoundException {
        Scanner console=new Scanner(System.in);
        System.out.println("name?");
//      先用户输入姓名
        Scanner babyName=new Scanner(new File("E:\\Text.txt"));
//      从文件中读取姓名
        judge(console,babyName);
//      判别文件中第一行的姓名与用户输入的姓名是否一致
        babyName.close();
//      清空scanner流
    }

    public static void judge(Scanner console,Scanner babyName) {
        String names=console.nextLine();
//        用name接受console的流，console置为空
        while(babyName.hasNextLine()) {
            String data=babyName.nextLine();
            Scanner again=new Scanner(data);
            if(again.next().equalsIgnoreCase(names)) {
                while(again.hasNextInt()) {
                    int num=again.nextInt();
                    System.out.println(num);
                }
            }
        }
    }
}
