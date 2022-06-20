package Map;
import java.util.*;
/**
 * @author Gremmie102
 * @date 2022/6/20 14:17
 * @purpose :
 */
public class Test1 {
    public static void main(String[] args) {
        //创建HashMap
        Map<String,String> map = new HashMap<>();
        //存放元素
        map.put("齐天大圣", "葛玉礼");
        map.put("齐天大圣","Gremmie");
        map.put("天蓬元帅","韩宇航");
        //取出元素
        String str1 = map.get("齐天大圣");
        String str2 = map.get("天蓬元帅");
        System.out.println(str1+" "+str2);
        //获取map的长度
        int size = map.size();
        System.out.println(size);
        //判断是否包含指定key
        boolean b1 = map.containsKey("齐天大圣");
        boolean b2 = map.containsValue("Gremmie");
        System.out.println(b1+" "+b2);
        System.out.println(map);

    }
}
