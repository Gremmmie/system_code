/**
 * Created with IntelliJ IDEA.
 * Description: Hello,I would appreciate your comments~
 * User:
 * Date: -03-20
 * Destination:实现一个方法 sum, 以数组为参数, 求数组所有元素之和.
 */
public class ArraySum {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        System.out.println(sum(array));
    }
    public static int sum(int[] array){
        int sum=0;
        for (int i=0;i<array.length;i++){
            sum+=array[i];
        }
        return sum;
    }
}
