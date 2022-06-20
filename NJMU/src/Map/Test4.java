package Map;

import java.util.*;
/**
 * @author Gremmie102
 * @date 2022/6/20 15:16
 * @purpose :
 */
public class Test4 {
    public static void main(String[] args) {

            //创建HashMap
            Map<String, Integer> map = new HashMap<>();
            //存放元素
            map.put("大哥", 1);
            map.put("二哥", 2);
            map.put("三哥", 3);
            map.put("四哥", 4);
            map.put("五哥", 5);
            //获取values，values是map所有值的集合，可以直接通过遍历values并输出
            for (Integer integer : map.values()) {
                System.out.println(integer);
            }
        }

}