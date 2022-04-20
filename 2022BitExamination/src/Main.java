import java.util.Scanner;

public class Main {
    public static String func(String str){
        int[] array1 = new int[127];
        StringBuilder sb = new StringBuilder();
        for (int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
            if (array1[ch]==0){
                sb.append(ch);
                array1[ch]=1;
            }
        }
        str = sb.toString();
        return str;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//循环输入-》处理的是多组输入
        while (scan.hasNextLine()) {
            String str = scan.nextLine();
            String ret = func(str);
            System.out.println(ret);
        }
    }
}
