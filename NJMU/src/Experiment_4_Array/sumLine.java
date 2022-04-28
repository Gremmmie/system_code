package Experiment_4_Array;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author Gremmie102
 * @date 2022/4/28 14:30
 * @purpose :编写一个能够计算出两个很大（例如25位）的整数相加的方法.
 * 本题中提供了一个文件“sum.txt”，其中每一行都是若干个整数。程序需要
 * 去读取每行的整数，计算它们的和（若一行只有1个整数，则其与0相加），参考
 * 输出示例：
 * 82384 = 82384
 * 204 + 435 = 639
 * 22 + 31 + 12 = 65
 * 999 + 483 = 1482
 * 28350 + 28345 + 39823 + 95689 + 234856 + 3482 + 55328 + 934803 = 1420676
 * 7849323789 + 22398496 + 8940 + 32489 + 859320 = 7872623034
 * 729348690234239 + 542890432323 + 534322343298 = 730425903009860
 */
public class sumLine {
    public static void sumAll(Scanner scanner){
        while(scanner.hasNextLine()){
            String string = scanner.nextLine();
            String[] strings = string.split(" ");
            int[] sum;
            char[][] Chars = new char[strings.length][];
            ArrayList<ArrayList<Integer>> IntArray = new ArrayList<>(strings.length);
            for (int i =0;i<strings.length;i++){
                Chars[i] = strings[i].toCharArray();
                for (int j=0;j<Chars[i].length;i++){
                    IntArray.get(i).add((int)Chars[i][j]);
                }
            }
            print(IntArray);
        }
    }
    private static void print(ArrayList<ArrayList<Integer>> IntArrays){
        int maxLen=0;
        for (int i=0;i<IntArrays.size();i++){
           if (maxLen<IntArrays.get(i).size()){
               maxLen=IntArrays.get(i).size();
           }else {
               continue;
           }
        }
        reverseAll(IntArrays);
        int[] result = new int[maxLen+2];
        addArrays(result,IntArrays,maxLen);
        for (int i=0;i<IntArrays.size();i++){
            if (i==IntArrays.size()-1){
                System.out.print(IntArrays.get(i).toString()+"=");
                System.out.println(Arrays.toString(result));
            }else{
                System.out.print(IntArrays.get(i).toString()+"+");
            }

        }
    }
    private static void addArrays(int[] result,ArrayList<ArrayList<Integer>> IntArrays,int maxLen){
        int carry=0;
        int add=0;
        for (int j=0;j<IntArrays.size();j++){
            for (int i=0;j<maxLen;j++){
                carry+=IntArrays.get(i).get(j);
            }
                result[j]+=carry%10;
                result[j+1]+=carry/10;
                if (result[j]>9){
                    result[j]%=10;
                    result[j+1]++;
                }
        }
    }

    private static void reverseAll(ArrayList<ArrayList<Integer>> IntArray){
        for (int i=0;i<IntArray.size();i++){
            for (int j=0;i<IntArray.get(i).size()/2;i++) {
                int flag = IntArray.get(i).get(j);
                IntArray.get(i).set(j,IntArray.get(i).get(IntArray.get(i).size()-1-j));
//                IntArray.get(i).get(j) = IntArray.get(i).get(IntArray.get(i).size()-1-j);
//                IntArray[i][IntArray[i].length - 1 - j] = flag;
//                IntArray.get(i).get(IntArray.get(i).size()-1-j) = flag;
                IntArray.get(i).set(IntArray.get(i).size()-1-j,flag);
            }
        }
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("E:/JAVAcode/gyljava/NJMU/src/sum.txt"));
        sumAll(scanner);
        scanner.close();
    }

}
