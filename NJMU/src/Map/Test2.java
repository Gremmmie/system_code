package Map;

import java.util.*;
/**
 * @author Gremmie102
 * @date 2022/6/20 14:31
 * @purpose :
 */
public class Test2 {
    public static void main(String[] args) {
        //创建HashMap
        Map<String,Integer> map = new HashMap<>();
        //有序得创建元素
        map.put("大娃",1);
        map.put("二娃",2);
        map.put("三娃",3);
        map.put("四娃",4);
        map.put("五娃",5);
        map.put("六娃",6);
        map.put("七娃",7);
        map.put("爷爷",8);
        map.put("蛇精",9);
        //输出map
        System.out.println(map);
    }
}
