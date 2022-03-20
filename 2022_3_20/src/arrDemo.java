/**
 * Created with IntelliJ IDEA.
 * Description: Hello,I would appreciate your comments~
 * User:
 * Date: -03-20
 * Destination:
 */
public class arrDemo {

    public static void main(String[] args) {
        int[] array = {1,2,3};
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]+" ");
        }



//        第二种打印方式为for-each  增强for循环
        for( int x   :  array  ){
            System.out.println(x+" ");
        }
//        这么做会每次循环把array中的数据赋值给x
    }


    public static void main3(String[] args) {
        int[] array ;
//      我们称这样为动态初始化
        array = new int[]{1,2,3,4,5};
        array = new int[]{9,8,7,6,5};
//      这样重新定义是可以的

        int[] array2 = {1,2,3,4,5};
//      我们称这么做为静态初始化
//
//      array2 = {9,8,7,6,5}这样写会报错，因为定义数组的时候整体赋值，只有一次机会
    }

    public static void main2(String[] args) {
        double[] array = new double[10];
        String[] strings = new String[10];
//      此时我们并没有初始化，但静态初始化虽然没有指定数组的长度，编译器会自动帮你确定

    }

    public static void main1(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};

        int ret = array[2];
        System.out.println(ret);
//      下标默认从0开始

        int[] array2 = new int[]{1,2,3,4,5,6,7,8,9,10};
//      两种是一样的,一般用第一种
        int[] array3 = new int[10];
//      不确定里面放什么的话，就用第三种
    }
}
