package Experiment_3_file_processing;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author Gremmie102
 * @date 2022/4/24 16:09
 * @purpose : 通过文件读入一个人的名字在一个年代的流行指数
 */
public class TM2_NamePopulation {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("输入你的文件名或完整路径");
        String fileName = scanner1.next();
        Scanner scanner2 = new Scanner(new File(fileName));
        System.out.println("请输入你要查找的名字");
        String name = scanner1.next();
        searchNamePopulation(scanner2,name);
        scanner1.close();
        scanner2.close();
    }
    public static void searchNamePopulation(Scanner scanner,String name){
            String line = scanner.nextLine();
            String[] message = line.split(" ");
            if (message[0]!=name){
                System.out.println("\""+name+"\" "+"not found");
            }else{
                for (int i =1;i< message.length;i++){
                    System.out.println("    "+(1900+(i-1)*10)+" "+message[i]);
                }
            }
    }
}
