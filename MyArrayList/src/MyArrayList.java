import java.util.ArrayList;
import java.util.List;

/**
 * @author Gremmie102
 * @date 2022/4/25 19:22
 * @purpose :
 */
public class MyArrayList {
    public static List<Character> func(String s1,String s2){
//        String str = "welcome to bit";
//        char[] chars1 = str.toCharArray();
//        char[] chars2 = {'c','o','m','e'};
        List<Character> ret = new ArrayList<>();
        for (int i=0;i<s1.length();i++){
            char ch = s1.charAt(i);
            if (!s2.contains(ch+"")){
                ret.add(ch);
            }
        }
        return ret;
    }
}
//    public void remove(int key){
//        int[] elem = new int[]{1,2,3,4,5};
//        for (int i =0;i<usedSize;i++){
//            if (elem[i].equals(key)){
//
//            }
//        }
//        if (elem[key].isEmpty){
//            throw new IndexIsEmptyException();
//        }
//
//    }