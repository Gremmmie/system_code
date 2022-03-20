import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description: Hello,I would appreciate your comments~
 * User:
 * Date: -03-20
 * Destination:
 * 1、如何定义数组？
 * 2、如何初始化数组？
 * 2、如何打印输出数组？
 */
public class arrDemo {


    public static void func2(int[] array){//在栈上新分配一块array引用变量的空间，也指向main_func2中的{1，2，3，4}
        array = new int[]{11,12,13,14};//这里在堆上新new了一块数组对象{11，12，13，14}，array指向该对象
    }
//
    public static void main_func2(String[] args) {
        int[] array1={1,2,3,4};
        func2(array1);//这里把array1的地址值传过去了，
        System.out.println(Arrays.toString(array1));
    }
//    输出结果为1 2 3 4



    public static void func3(int[] array){
        array[0]=199;//array指向的下标为0的元素值改为199
    }
    public static void main_func3(String[] args) {
        int[] arr = {100,99,88,77};
        func3(arr);
        System.out.println(Arrays.toString(arr));
    }
//    输出结果为199，99，88，77




    public static void func1(int a) {
        a=20;
    }
    public static void main9(String[] args) {
        int x =10;
        func1(x);
        System.out.println(x);
    }



    public static void main8(String[] args) {
        int [] array1 = {1,2,3,4};
        array1 = new int[]{11,12,13,14};
        array1 = new int[]{6,7,8,9};
    }

//    对象  引用
    public static void main7(String[] args) {
        int[] array1 = {1,2,3,4};
        int[] array2 = array1;
        System.out.println("array1:" + Arrays.toString(array1));
        System.out.println("array2:" + Arrays.toString(array2));

        System.out.println("======================");
        array2[0] = 99;
//        这样用array2改变首元素的值时，我们测试可以发现array1[0]也变了
        System.out.println("array1:" + Arrays.toString(array1));
        System.out.println("array2:" + Arrays.toString(array2));

        int[] array3={1,2,3,4};
        int[] array4={5,6,7,8};
        array3=array4;
//        这个时候{1，2，3，4}这块内存就被JVM的垃圾回收机制回收了
        System.out.println(Arrays.toString(array3));
        System.out.println(Arrays.toString(array4));
    }

    public static void main6(String[] args) {
//        该方法用于了解引用变量
        int[] array = {1,2,3};
        double[] array2 ={1.0,2.0,3.0};
        System.out.println(array);
        System.out.println(array2);
        int[] array3 = null;//代表array这个引用变量不指向任何对象
//        不能用int array3 = 0;来初始化引用变量
//        而且这个时候 System.out.println(array3);的话
//        会显示空指针异常
//  System.out.println(array3[0]);也会显示空指针异常
//        既然引用变量为null了，那么就不能用array.length以及其他类似的用法啊了，会报错

    }

    public static void main5(String[] args) {
        int a = 10;//局部变量=》存放到  栈【虚拟机栈】中
    }


    public static void main4(String[] args) {
//      该main方法解释如何打印输出数组内容
        int[] array = {1,2,3};
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]+" ");
        }
//      第一种，普通for循环
        for( int x : array ){
            System.out.println(x+" ");
        }
//      第二种for-each   for循环的增强版

//      第三种，借助Java本身带有的一些方法来实现数组的打印Array
        String ret = Arrays.toString(array);
//        把参数的数组转化成字符串进行输出
        System.out.println(ret);
//        输出带有中括号是因为方法内部自动帮你包装了一下

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
