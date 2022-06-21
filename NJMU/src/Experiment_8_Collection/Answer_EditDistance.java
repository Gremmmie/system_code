package Experiment_8_Collection;
import java.util.*;
import java.io.*;
/**
 * @author Gremmie102
 * @date 2022/6/21 15:34
 * @purpose :
 */
public class Answer_EditDistance {

    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        System.out.println("Please input the length of the array you want to create:");
        int n=console.nextInt();
        writeSequence(n); }
    public static void writeSequence(int n){
        if (n<1) {
            throw new IllegalArgumentException();
        } else if (n==1) {
            System.out.print(1);
        } else if (n==2) {
            System.out.print("1 1");
        } else {
        int number = (n+1)/2;
        System.out.print(number+ " ");           //打印一头一尾
        writeSequence(n-2);        //在对中间的数字段进行操作
        System.out.print(" "+number);
        }
    }
}