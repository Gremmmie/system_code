import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description: Hello,I would appreciate your comments~
 * User:
 * Date: -03-23
 * Destination:给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 */
public class TestDemo1 {


    public static void main(String[] args) {
        int[] array = {1,2,7,53,2,67};
        System.out.println("排序前:"+ Arrays.toString(array));
        BubbleSort(array);
        System.out.println("排序后:"+ Arrays.toString(array));
    }
    public static void BubbleSort(int[] array){
        for (int i =0;i<array.length-1;i++){
            boolean flag = false;
            for(int j=0;j<array.length-i-1;j++){
                if (array[j]>array[j+1]){
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                    flag = true;
                }
            }
            if (flag == false){
                break;
            }
        }
    }










    public static void main_Ordinary(String[] args) {
        int[] array = {1,2,3,7,4,3};
        System.out.println(Ordinary(array));
    }
    public static String Ordinary(int[] array){
        String str = "right";
        for (int i=0;i<array.length-1;i++){
            if (array[i]<=array[i+1]){
                continue;
            }else {
                str="No";
                return str;
            }
        }
        return str;
    }







    public static void main_binarySearch(String[] args) {
        int[] array = {1,2,3,4,5};
        System.out.println("下标为:"+binarySearch(array,4));
    }
    //    二分查找，前提是查找的数组有序
    public static int binarySearch(int[] array,int key){
        int left = 0;
        int right = array.length-1;
        while (left<=right){
            int mid = (left + right) /2;
            if (array[mid]<key){
                left = mid + 1;
            }else if(array[mid]==key){
                return mid;
            }else {
                right = mid -1;
            }
        }
//        代码走到这里说明left已经大于right了，所以返回-1
        return -1;//数组没有-1
    }












    public static void main_func(String[] args) {
          int[] array = {1,2,2,1,5,4,5};
        System.out.println(func(array));
    }
    public static int func (int[] array){
        int num=0;
        for(int i=0;i<array.length;i++){
            num^=array[i];
        }
        return num;
    }
}
