/**
 * Created with IntelliJ IDEA.
 * Description: Hello,I would appreciate your comments~
 * User:
 * Date: -03-20
 * Destination:实现一个方法 avg, 以数组为参数, 求数组中所有元素的平均值(注意方法的返回值类型).
 */
public class ArrayAverage {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4};
        double average = avg(array1);
        System.out.println(average);
    }
    public static double avg(int[] array){
        int sum=0;
        for(int i =0;i<array.length;i++){
            sum+=array[i];
        }
        return sum*1.0/array.length;
    }
}
