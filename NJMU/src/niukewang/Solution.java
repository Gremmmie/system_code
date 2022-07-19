package niukewang;

import java.util.Scanner;

/**
 * @author Gremmie102
 * @date 2022/7/14 0:07
 * @purpose :
 */
public class Solution {
    public int removeDuplicates(int[] nums) {
        int i=1;
        int j=1;
        for (;j<nums.length-1;j++){
            if (nums[j]>nums[j-1]){
                nums[i]=nums[j];
                i++;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        System.out.println(14^3);


                Integer var1=new Integer(1);
                Integer var2=var1;
                doSomething(var2);
                System.out.print(var1.intValue());
                System.out.print(var1==var2);
            }
            public static void doSomething(Integer integer){
                integer=new Integer(2);


    }
    public static void main2(String[] args) {
        Double o1 = true ? new Integer(1) : new Double(2.0);
        Object o2;
        if(true){
            o2 = new Integer(1);
        }else{
            o2 = new Double(2.0);
        }
        System.out.print(o1);
        System.out.print(" ");
        System.out.print(o2);
    }


    public String truncateSentence(String s, int k) {
        Scanner scanner = new Scanner(s);
        StringBuffer stringBuffer = new StringBuffer();
        while(k>0){
            k--;
            stringBuffer.append(scanner.next());
            stringBuffer.append(" ");
        }
        stringBuffer.deleteCharAt(stringBuffer.length()-1);
        String string = stringBuffer.toString();
        return string;
    }

    public static void main1(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.truncateSentence("What is the solution to this problem",4));
    }
}
