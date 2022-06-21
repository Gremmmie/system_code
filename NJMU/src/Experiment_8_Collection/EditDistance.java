package Experiment_8_Collection;

import java.util.Scanner;

/**
 * @author Gremmie102
 * @date 2022/6/21 14:52
 * @purpose :
 */
public class EditDistance {
    public static void writeSequence(int n){
        if (n==1){
            System.out.print("1");
            return;
        }
        if (n==2) {
            System.out.print("1 1");
            return;
        }
        int i = (n+1)/2;
        System.out.print(i+" ");
        writeSequence(n-2);
        System.out.print(" "+i);
    }

    public static void main(String[] args) {
        System.out.println("输入你要的递归的数字个数");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        writeSequence(n);
    }
}
