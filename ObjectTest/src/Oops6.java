import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author Gremmie102
 * @date 2022/4/17 17:06
 * @purpose :
 */
public class Oops6 {
 public static void main1(String[] args) throws FileNotFoundException {
//         String exePath = System.getProperty("user.dir");
//         System.out.println(exePath);
         Scanner in = new Scanner(new File("E:/JAVAcode/gyljava/ObjectTest/src/example.txt"));
         countWords(in);
     }
   // Counts total lines and words in the input scanner.
   public static void countWords(Scanner input){
        int lineCount = 0;
        int wordCount = 0;
        while(input.hasNextLine()){
            String line = input.nextLine(); //read one line
            lineCount++;
            Scanner input1 = new Scanner(line);
            while (input1.hasNext()){
                String word = input1.next();
                wordCount++;
            }
            System.out.println("有"+lineCount+" 行 "+wordCount+" 个词");
        }
     }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("E:/JAVAcode/gyljava/ObjectTest/src/example.txt"));
        int count = 0;
        while(input.hasNextLine()){
            System.out.println("input: " + input.nextLine());
            count++;
        }
        System.out.println(count + " total");
    }
 }