package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/**
 * @author Gremmie102
 * @date 2022/6/20 15:43
 * @purpose :
 */
public class Test5 {
    public static void main(String[] args) {
        //创建HashMap
        Map<String,Integer> map = new HashMap<>();
        //存放元素
        map.put("大哥",1);
        map.put("二哥",2);
        map.put("三哥",3);
        map.put("四哥",4);
        map.put("五哥",5);
        //获取entrySet，entrySet是所有entry的集合，可以通过遍历entrySet的方式获取key和value并输出
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        for (Map.Entry<String, Integer> entry : entrySet) {
            System.out.println(entry.getKey() + "==>" + entry.getValue());
        }
    }
}
