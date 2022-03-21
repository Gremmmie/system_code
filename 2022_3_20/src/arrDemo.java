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






    /**第四种拷贝方法
     * array.clone();
     * @param args
     */
    public static void main_copy4(String[] args) {
        int[] array = {1,2,3,4};
        int[] copy = array.clone();
        System.out.println(Arrays.toString(copy));
        System.out.println(array);
        System.out.println(copy);
//        输出的地址不一样，说明新开辟了一个引用变量之后，新new并且指向了一个对象
    }




    /**第三种拷贝方式
     * 利用arraycopy
     * @param args
     */
    public static void main_copy3(String[] args) {

        int[] array = {1,2,3,4};
        int[] copy = new int[array.length];

        System.arraycopy(array,0,copy,array.length,array.length);

        System.out.println(Arrays.toString(copy));
    }




    /**第一种拷贝方法
     * 利用Array类的从copyOf方法来进行拷贝（你要拷贝的数组，返回的数组长度）
     * @param args
     */
    public static void main_copy2(String[] args) {
        int[] array = {1,2,3,4};
        int[] copy = Arrays.copyOf(array,array.length);
        int[] copy2 = Arrays.copyOf(array,2*array.length);
        System.out.println(Arrays.toString(copy));
        System.out.println(Arrays.toString(copy2));
//        其实是扩容
    }

    /**第一种拷贝方法
     * 使用for进行拷贝
     */
    public static void main_copy(){
        int[] array = {1,2,3,4};

        int[] copy = new int[array.length];

        for (int i=0;i<array.length;i++){
            copy[i] = array[i];
        }
        System.out.println(copy);
    }




    /**
     * 题目1：这里写一个函数将一维数组以字符串的形式进行输出[1,2,3,4]
     * @param array
     * @return
     */
    public static String myToString(int[] array){
        String string="[";
        for(int i =0;i<array.length;i++){
            string+=array[i]+"";
            if(i!=array.length-1){
                string +=",";
            }
        }
        string+="]";
        return string;
    }
    public static void main_myToString(String[] args) {
        int[] array = {1,2,3,4};
        String ret = myToString(array);
        System.out.println(ret);
    }


    public static void main(String[] args) {
        int[] arr = {1,2,3};
        func(arr);
        System.out.println("arr[0] = " + arr[0]);
    }
    public static void func(int[] a) {
        a[0] = 10;
        System.out.println("a[0] = " + a[0]);
    }










    public static void func2(int[] array){//在栈上新分配一块array引用变量的空间，也指向main_func2中的{1，2，3，4}
        array = new int[]{11,12,13,14};//这里在堆上新new了一块数组对象{11，12，13，14}，array指向该对象
    }
//这里有个重要的概念，在Java中，都是按值传递，地址也是值
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
        int a = 10;
        int b = 20;
        int[] arr = new int[]{1,2,3};

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
//        既然引用变量为null了，那么就不能用array.length以及其他类似的用法了，会报错

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
        System.out.println(Arrays.toString(array));
    }

    public static void main4_1(String[] args) {
        int[] array = new int[]{10,20,30,40,50};
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
    }


    public static void main3_4(String[] args) {
        int[] array = {1,2,3};
        System.out.println(array[3]);
    }



    public static void main3_3(String[] args) {
        int[] array = new int[]{10,20,30,40,50};
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);

//        也可以通过[]对数组中的元素进行修改
        array[0] = 100;
        System.out.println(array[0]);
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
