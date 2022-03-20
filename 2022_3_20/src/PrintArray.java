/**
 * Created with IntelliJ IDEA.
 * Description: Hello,I would appreciate your comments~
 * User:
 * Date: -03-20
 * Destination:实现一个方法 printArray,
 * 以数组为参数,
 * 循环访问数组中的每个元素,
 * 打印每个元素的值.
 */
public class PrintArray {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        printArray(array);
    }
    public static void printArray(int[] array){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]);
        }
    }
}
