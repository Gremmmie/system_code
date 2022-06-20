package Map;
import java.util.*;
/**
 * @author Gremmie102
 * @date 2022/6/20 16:07
 * @purpose :
 */
public class 学生信息管理 {
    public static void main(String[] args) {
        Map<String,Integer> 成绩1 = new HashMap<>();
        Map<String,Integer> 成绩2 = new HashMap<>();
        成绩1.put("语文",103);
        成绩1.put("数学",102);
        成绩1.put("英语",101);
        成绩2.put("物理",98);
        成绩2.put("地理",97);
        成绩2.put("化学",96);
        Map<String,Map<String,Integer>> 小葛 = new HashMap<>();
        小葛.put("主三门",成绩1);
        小葛.put("副三门",成绩2);
        System.out.println(小葛);
    }
}
