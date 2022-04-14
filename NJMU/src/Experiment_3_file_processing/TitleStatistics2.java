package Experiment_3_file_processing;
import java.io.*;
import java.util.*;
/**
 * Created with IntelliJ IDEA.
 * Description: Hello,I would appreciate your comments~
 * User:
 * Date: -04-14
 * Destination:
 */
public class TitleStatistics2 {

    public static void main(String[] args)
            throws FileNotFoundException{
        System.out.println("This program statistics about a file.");
        System.out.println();
        Scanner console = new Scanner(System.in);
        System.out.println("What file do you want me to examine?");
        String filename=console.nextLine();
        Scanner infile=new Scanner(new File(filename),"UTF-8");
        examineFile(infile);
        console.close();

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

