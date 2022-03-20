package com.company;

/**
 * Created with IntelliJ IDEA.
 * Description: Hello,I would appreciate your comments~
 * User:
 * Date: -03-20
 * Destination:
 */
public class diguiqiuhe {
    public static void main(String[] args) {
        System.out.println(factorialSum(10));
    }
    public static int factorialSum(int a){
        if (1 == a){
            return 1;
        }
        return a+factorialSum(a-1);
    }
}
