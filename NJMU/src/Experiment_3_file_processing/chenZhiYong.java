package Experiment_3_file_processing;

import java.io.*;
import java.util.*;
public class chenZhiYong {
    public static final int Decade = 1;

    public static final int YEAR = 1990;

    public static void main(String[] args) throws FileNotFoundException {
        Scanner console = new Scanner(System.in);
        System.out.println("name?");
        Scanner babyname = new Scanner(new File("C:\\Users\\86187\\eclipse-workspace\\population\\src\\name.txt"));
        judge(console, babyname);


    }


    public static void judge(Scanner console, Scanner babyname) {
        String names = console.nextLine();
        while (babyname.hasNextLine()) {
            String data = babyname.nextLine();
            Scanner again = new Scanner(data);

            if (again.next().equalsIgnoreCase(names)) {
                while (again.hasNextInt()) {

                    int num = again.nextInt();
//					System.out.println(num);


                    for (int i = 0; i < Decade; i++) {
                        System.out.println("  " + (YEAR + 10 * i) + " " + num);
                    }

                }
            }

        }
    }
}