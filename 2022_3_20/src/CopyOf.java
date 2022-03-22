import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description: Hello,I would appreciate your comments~
 * User:
 * Date: -03-20
 * Destination:实现一个方法 copyOf, 对一个整型数组进行拷贝, 得到一个新的数组.
 */
public class CopyOf {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        int[] copy = {7,8,9,10,11};
        copyOf(array,copy);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(copy));
    }
    public static void copyOf(int[] array,int[] copy){
        //这里newArr和arr引用的是同一个数组
        //因此newArr修改空间中内容之后，arr也可以看到修改的结果
    }
}
