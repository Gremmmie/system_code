package Experiment_3_file_processing;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**
 * @author Gremmie102
 * @date 2022/4/24 15:48
 * @purpose :统计文本中出现的字数，行数，字符数（不计空格），和文件所有单词的平均长度
 */
public class TM1_MyWordsCount {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("What file do you want me to examine?");
        String fileName = scanner1.next();
        Scanner scanner2 = new Scanner(new File(fileName));
        examine(scanner2);
        scanner1.close();
        scanner2.close();
    }
    public static void examine(Scanner scanner){
        int lines=0;
        int words=0;
        int chars=0;
        double wordLength=0;
        while(scanner.hasNextLine()){
            String str = scanner.nextLine();
            char[] charArray = str.toCharArray();
            words += str.split(" ").length;
            for (int i=0;i<charArray.length;i++){
                if (charArray[i]!=' '){
                    chars++;
                }
            }
            lines++;
        }
        wordLength = chars/words;
        System.out.println("Total lines = "+lines);
        System.out.println("Total words = "+words);
        System.out.println("Total chars = "+chars);
        System.out.println("Word length = "+wordLength);
    }
}
