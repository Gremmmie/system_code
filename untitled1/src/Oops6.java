import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author Gremmie102
 * @date 2022/4/21 14:34
 * @purpose :
 */
public class Oops6 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("example.txt"));
        countWords(in);
    }
    public static void countWords(Scanner input){
        int lineCount = 0;
        int wordCount = 0;

        while(input.hasNextLine()){
            String line = input.nextLine();
            lineCount++;
            String[] str = line.split(" ");
            wordCount+= str.length;
        }
        System.out.println("有"+wordCount+"个词，"+lineCount+"句");
    }
}
