import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description: Hello,I would appreciate your comments~
 * User:
 * Date: -03-22
 * Destination:
 */
public class TestDemo {


    public static void main(String[] args) {
        int[] array = {1,2,3,14,5};
        System.out.println("排序之前的数组："+Arrays.toString(array));
        Arrays.sort(array);//默认升序
        System.out.println("排完序之后的数组"+Arrays.toString(array));
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

    public static int search(int[] array,int key){
        for(int i=0;i<array.length;i++){
            if(array[i]==key){
                return i;
            }
        }
//        如果代码走到这里，说明推出了for循环
        return  -1;//因为数组没有负数下标
    }
    public static void main_search(String[] args) {
        int[] array = {1,2,3,4,5};
        int index = search(array,4);
        if(index == -1){
            System.out.println("没有你要找的关键字！");
        }else {
            System.out.println("找到了你要的关键字，下标是："+ index);
        }
    }


//    求平均值
    public static double avg(int[] array) {
        int sum = 0;
        for (int i = 0;i<array.length;i++){
            sum = sum +array[i];
        }
        return sum*1.0/array.length;
//        不能 return sum/array.length
    }


    public static void main1(String[] args) {
        int[] array = {1,2,3,4,5};
        int[] ret = {1,2,3};
        ret =Arrays.copyOfRange(array,1,3);
        System.out.println(Arrays.toString(ret));
//        这里输出为[2,3]
//        因为从1下标拷贝到3下标，这里都是左闭右开的[1,3)
    }
}
