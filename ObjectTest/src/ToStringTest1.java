/**
 * @author Gremmie102
 * @date 2022/4/16 23:45
 * @purpose : 用Array的类来调用其父类的toString方法
 */
public class ToStringTest1 {
    public static void main(String[] args) {
        //创建数组
        String[] array = {"葛玉礼","is","假面骑士"};
        System.out.println(array.toString());

        //数组元素值返回一个字符串的表示形式
        //Array继承了Object类，子类可以直接使用父类中的方法
        System.out.println(array[0].toString() +
                           array[1].toString() +
                           array[2].toString() );
        System.out.println( array.toString());
    }
}
