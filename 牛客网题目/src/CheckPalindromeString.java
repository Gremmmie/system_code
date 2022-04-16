/**
 * Created with IntelliJ IDEA.
 * Description: Hello,I would appreciate your comments~
 * User:
 * Date: -04-16
 * Destination:
 */
public class CheckPalindromeString {
    private boolean isCharacter(char ch){
        if (ch >= 'a'&&ch <= 'z'|| ch >= '0'&&ch <='9'){
            return true;
        }
        return false;
    }
    public boolean isPalindrome(String s){
        int i = 0;
        int j = s.length()-1;
        while(i<j){
            while(i<j && isCharacter(s.charAt(i))){
                i++;
            }
            //i对应的元素就是一个合法的数组字符或字母
            while(i<j && isCharacter(s.charAt(j))){
                j++;
            }
            //j对应的元素就是一个合法的数组字符或字母
            if (s.charAt(i)!=s.charAt(j)){
                return false;
            }else {
                return true;
            }
        }
        return false;
    }
}
