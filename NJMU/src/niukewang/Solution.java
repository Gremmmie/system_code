package niukewang;

import java.util.Scanner;

/**
 * @author Gremmie102
 * @date 2022/7/14 0:07
 * @purpose :
 */
public class Solution {
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
