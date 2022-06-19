package HashSet;

/**
 * @author Gremmie102
 * @date 2022/6/19 10:02
 * @purpose :
 */
// 引入 HashSet 类
import java.util.HashSet;

public class Test2 {
    public static void main(String[] args) {
        HashSet<String> sites = new HashSet<String>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Zhihu");
        sites.add("Runoob");     // 重复的元素不会被添加
        sites.remove("Taobao");  // 删除元素，删除成功返回 true，否则为 false
        System.out.println(sites);
    }
}