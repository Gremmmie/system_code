import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description: Hello,I would appreciate your comments~
 * User:
 * Date: -03-20
 * Destination:实现一个方法 transform,
 * 以数组为参数, 循环将数组中的每个元素 乘以 2 ,
 * 并设置到对应的数组元素上. 例如 原数组为 {1, 2, 3},
 * 修改之后为 {2, 4, 6}
 */
public class TransForm {
    public static void main(String[] args) {
        int[] array = {1,2,3};
        transForm(array);
        System.out.println(Arrays.toString(array));
    }
    public static void transForm(int[] array1){
        for(int i = 0;i<array1.length;i++){
            array1[i]*=2;
        }
    }
}
