/**
 * @author Gremmie102
 * @date 2022/4/17 11:43
 * @purpose :String 和 ArrayList 类使用 hashCode() 方法
 */
import java.util.ArrayList;

public class HashCodeTest2 {
    public static void main(String[] args) {

        // String 使用 hashCode()
        String str = new String();
        System.out.println(str.hashCode()); // 0

        // ArrayList 使用 hashCode()
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list.hashCode()); // 1
    }
}