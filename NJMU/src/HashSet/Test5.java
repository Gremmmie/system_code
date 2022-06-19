package HashSet;

import java.util.HashSet;

/**
 * @author Gremmie102
 * @date 2022/6/19 10:12
 * @purpose :
 */
public class Test5 {
    public static void main(String[] args) {
        HashSet<String> sites = new HashSet<String>();
        sites.add("birds");
        sites.add("cat");
        sites.add("dog");
        sites.add("birds");//重复的元素不能被添加
        for (String i : sites){
            System.out.println(i);
        }
    }
}
