package Experiment_3_file_processing;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description: Hello,I would appreciate your comments~
 * User:
 * Date: -04-15
 * Destination:
 */
public class Main {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         int[] a = new int[7];
         for (int i=0;i<7;i++){
             a[i] = scanner.nextInt();
             scanner.nextLine();
         }
         System.out.println(Arrays.toString(a));
    }
}
