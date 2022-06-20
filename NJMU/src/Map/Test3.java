package Map;

import java.util.Map;
import java.util.Set;
import java.util.HashMap;
/**
 * @author Gremmie102
 * @date 2022/6/20 15:11
 * @purpose :
 */
public class Test3 {

    public static void main(String[] args) {
        //创建HashMap
        Map<String, Integer> map = new HashMap<>();
        //存放元素
        map.put("大哥", 1);
        map.put("二哥", 2);
        map.put("三哥", 3);
        map.put("四哥", 4);
        map.put("五哥", 5);
        //获取keySet，keySet是map集合中所有key的集合，我们可以通过遍历keySet的方法取出所有的value；
        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            System.out.println(map.get(key));
        }
    }
}
