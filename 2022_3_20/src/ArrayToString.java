/**
 * Created with IntelliJ IDEA.
 * Description: Hello,I would appreciate your comments~
 * User:
 * Date: -03-20
 * Destination:实现一个方法 toString,
 * 把一个整型数组转换成字符串. 例如数组 {1, 2, 3} ,
 * 返回的字符串为 "[1, 2, 3]",
 * 注意 逗号 的位置和数量.
 */
public class ArrayToString {
    public static void main(String[] args) {
        int[] array = {1,2,3};
        System.out.println(toString(array));
    }
    public static String toString(int[] array){
        String str="[";
        for(int i =0;i<array.length;i++){
            str+=array[i]+"";
            if (i<array.length-1){
                str+=",";
            }
        }
        str+="]";
        return str;
    }
}
