package Experiment_3_file_processing;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description: Hello,I would appreciate your comments~
 * User:
 * Date: -04-14
 * Destination:
 * 编写一个程序用来统计一个文本文件中的字数、行数、字符数（不计空格）
 * 和文件中所有的单词的平均长度
 * 假设单词之间由空格或“换行符”分隔
 * 输入：用户输入需要统计的文件名
 */
public class TitleStatistics {
    public static void main(String[] args)throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What file do you want me to examine?\n" +
                "（输入文件名，绝对路径或相对路径）");
        String file1_name = scanner.next();
        File file1 = new File(file1_name);
        System.out.println("是否为文件？"+file1.isFile());
        if (!file1.exists()){
            System.out.println("你所输入的文件名并不存在，退出");
            return;
        }
        Scanner infile = new Scanner(file1);
        examineFile(infile);
        scanner.close();
        infile.close();
//        try(InputStream is = new FileInputStream(file1)){
//            int len;
//            byte[] buf = new byte[100];
//            while(true){
//                len = is.read(buf);
//                if(len==-1){
//                    break;
//                }
//            }
//            System.out.println(Arrays.toString(buf));
//        }

    }
    public static void examineFile(Scanner infile) {
        int lines =0;
        int words=0;
        int chars =0;
        while(infile.hasNextLine()) {
            String line = infile.nextLine();
            lines++;
            Scanner data=new Scanner(line);
            while(data.hasNext()) {
                String word=data.next();
                words++;
                chars+=word.length();
            }
        }
        System.out.println("Total lines ="+ lines);
        System.out.println("Total words = "+words);
        System.out.println("Total chars ="+chars);
        System.out.println("Word length ="+(double)chars/words);
    }
}
