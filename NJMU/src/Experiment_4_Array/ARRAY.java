package Experiment_4_Array;
import java.io.*;
import java.util.*;
public class ARRAY {
    public static final int MAX=25;
    public static void main(String[] args)throws FileNotFoundException {
        Scanner console=new Scanner("C:\\Users\\86187\\eclipse-workspace\\NUM\\src\\sum.txt");
        getarray(console);
    }


    public static void getarray(Scanner console) {//先取出每一行的数
        int lines=0;
        while(console.hasNextLine()) {
            String eachline=console.nextLine();
            Scanner num=new Scanner(eachline);
            calculate(num);
            lines++;
        }
        System.out.println();
        System.out.println("TOTAL:"+lines);
    }

    public static void calculate(Scanner num) {//将每一行构建一个数组来计算
        int[]resultarray=new int[MAX];//构建一个数组1
        String data=num.next();
        doarray(data,resultarray);
        System.out.print(data);
        while(num.hasNext()) {
            String date=num.next();
            int[]number=new int[MAX];//还有数就再构建一个数组
            doarray(date,number);//两个数组
            addto(resultarray,number);
            System.out.print("+"+data);
        }
        System.out.print(" = ");
        print(resultarray);
        System.out.println();
    }

    public static void doarray(String data,int[]array) {
        int i=data.length()-1;
        int j=MAX-1;
        while(i>=0) {
            array[j]= data.charAt(i);
            i--;
            j--;
        }
    }
    public static void addto(int[]array1,int[]array2) {

        int carry=0;//表示进制
        for(int i=MAX-1;i>=0;i--) {
            int next =array1[i]+array2[i]+carry;
            array1[i]=next%10;
            carry=next/10;
        }
        if (carry>0) {//抛出异常！！！！！
            throw new RuntimeException("overflow");
        }
    }


    public static void print(int[]array1) {

        int find =0;//得出来得数组是前面可能有很多0，因此要找到起始数的位置
        while(find<MAX-1 && array1[find]==0) {
            find++;
        }
        for(int i =find;i<MAX; i++) {
            System.out.print(array1[i]);
        }
    }

}