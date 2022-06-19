package HashSet;

/**
 * @author Gremmie102
 * @date 2022/6/19 9:52
 * @purpose :
 */
// 引入 HashSet 类
import java.util.HashSet;

public class RunoobTest {
    public static void main(String[] args) {
        HashSet<String> sites = new HashSet<String>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Zhihu");
        sites.add("Runoob");  // 重复的元素不会被添加
        System.out.println(sites);
    }
}