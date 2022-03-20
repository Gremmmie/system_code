import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description: Hello,I would appreciate your comments~
 * User:
 * Date: -03-20
 * Destination:创建一个 int 类型的数组,
 * 元素个数为 100,
 * 并把每个元素依次设置为 1 - 100
 */
public class ArrayTest1 {
    public static void main(String[] args) {
        int[] array = new int[100];
        for (int i=0;i<100;i++){
            array[i]=i+1;
        }
        System.out.println(Arrays.toString(array));
    }
}
