import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description: Hello,I would appreciate your comments~
 * User:
 * Date: -03-23
 * Destination:给定一个有序整型数组, 实现二分查找
 */
public class TestDemo {






    public static void main_BubbleSort(String[] args) {
        int[] a = {1,2,55,32,78};
        System.out.println("排序前:" + Arrays.toString(a));
        BubbleSort(a);
        System.out.println("排序后" + Arrays.toString(a));
    }
    public static void BubbleSort(int[] array){
        for(int i = 0;i<array.length-1;i++){
            boolean flag = true;
            for(int j =0;j<array.length-i-1;j++){

                if (array[j]>array[j+1]){
                    int tmp = array[j];
                    array[j]=array[j+1];
                    array[j+1]=tmp;
                    flag=false;
                }
            }
            if (flag==true){
                break;
            }
        }
    }



    public static void main_Orderly(String[] args) {
        int[] a = new int[]{1,23,3,4,5};
        System.out.println(Orderly(a));
    }
    public static boolean Orderly(int[] array){
        for (int i=0;i<array.length-1;i++){
            if(array[i]<=array[i+1]){
                continue;
            }else {
                return false;
            }
        }
        return true;
    }




    public static void main_BinarySearch(String[] args) {
        int[] array = {1,2,3,4,5};
        int index=BinarySearch(array,4);
        System.out.println(index);
    }
    public static int BinarySearch(int[] array,int key){
        int left,right;
        left = 0;
        right = array.length-1;
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
        return -1;//数组下标没有-1
    }

}
