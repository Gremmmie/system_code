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
//        int[][] array = {{1,2},{4,5,6}};是可以这样定义的
        int[][] array2=new int[2][];//这里编译器只知道这里有两行，还没给出列
        array2[0] = new int[2];
        array2[1] = new int[4];
//        这叫不规则数组
        for (int i = 0;i<array2.length;i++){//代表我们的行
            for (int j =0;j<array2[i].length;j++){//代表我们的列
                System.out.println(array2[i][j]);
            }
        }
//        这里没有array2[0] = new int[2];
//               array2[1] = new int[4];
//               会显示空指针异常，
//        PS:这里区别于C语言，不能再使用array+1来表示数组地址了
    }

    public static void main_1(String[] args){
//      二维数组不能这么写  int[][] array = {1,2,3,4,5,6};
        int[][] array = {{1,2,3},{4,5,6}};
        int[][] array2 = new int [][]{{1,2,3},{4,5,6}};

        for (int i = 0;i<2;i++){//代表我们的行
            for (int j =0;j<3;j++){//代表我们的列
                System.out.println(array[i][j]);
            }
        }
//        优化一下
        for (int i = 0;i<array.length;i++){//代表我们的行
            for (int j =0;j<array[i].length;j++){//代表我们的列
                System.out.println(array[i][j]);
            }
        }
        System.out.println("使用for-each来进行打印");
        for (int[] tmp:array){
            for(int x:tmp){
                System.out.println(x+" ");
            }
        }

        System.out.println("使用toString进行打印");
        System.out.println(Arrays.deepToString(array));
//
    }

    public static void reverse(int[] arr) {
        int left = 0;
        int right = arr.length-1;
        int tmp = 0;
        while (left<right){
            tmp = arr[left];
            arr[right] = tmp;
            left++;
            right--;
        }

    }
    public static void bubbleSort(int[] array) {
        //[0----len-1)i代表趟数
        for (int i = 0;i<array.length-1;i++){
            boolean flg = false;
            //j<4在这里可以不减i    减i说明是进行了优化
            for(int j=0;j<array.length-1-i;j++){
                if (array[j] > array[j+1]) {
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                    flg = true;
                }
            }
            if (flg == false) {
//                这里是判断上一次有没有进行交换，flg有没有变成true
                break;
            }
        }
//        这里还可以进一步优化，我们可以进一步添加检查，
//        检查是否发生了简化，如果没有，说明有序了，就不需要进行第三趟，第四趟...
    }


    public static void main_ArrayEqualsAndFill(String[] args) {
        int[] array1 = {1,2,3,4,5};
        int[] array2 = {1,2,3,4,5};
        boolean equal = Arrays.equals(array1,array2);
        System.out.println(equal);
        System.out.println("==============");
        int[] array = new int[10];
        System.out.println("填充之前的数组"+Arrays.toString(array));
//        结果都是0
        Arrays.fill(array,1);
        System.out.println("填充之后的数组"+Arrays.toString(array));
//        结果都是1
        Arrays.fill(array,4,10,29);
//        从[4,10)填充29

    }

    public static void main_Array(String[] args) {
        int[] array = {1,2,3,14,5};
        System.out.println("排序之前的数组："+Arrays.toString(array));
        Arrays.sort(array);//默认升序
        System.out.println("排完序之后的数组"+Arrays.toString(array));

//index:下标，索引
        int index = Arrays.binarySearch(array,14);
        if (index == -1){
            System.out.println("没有");
        }else {
            System.out.println("下表为"+index);
        }
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
