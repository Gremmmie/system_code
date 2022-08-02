package file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo8 {
    //对于文本文件,还有更简单的写法
    public static void main(String[] args) throws IOException {
        InputStream inputStream = new FileInputStream("test2.txt");
        Scanner scanner = new Scanner(inputStream);
        String s = scanner.nextLine();
        System.out.println(s);
        inputStream.close();
    }
}
