/**
 * @author Gremmie102
 * @date 2022/4/17 10:27
 * @purpose :介绍Object中的equals方法
 */
public class EqualsTest1 {
    public static void main(String[] args) {

        // Object 类使用 equals() 方法
        // 创建两个对象
        Object object1 = new Object();
        Object object2 = new Object();

        // 判断 obj1 与 obj2 是否相等
        // 不同对象，内存地址不同，不相等，返回 false
        System.out.println(object1.equals(object2)); // false

        // obj1 赋值给 obj3
        // String 重写了 equals() 方法
        // 对象引用，内存地址相同，相等，返回 true
        Object object3 = object1;
        System.out.println(object1.equals(object3)); // true
    }
}
/**
 * 运行结果：
 * E:\develop\Java\jdk-11\bin\java.exe "-javaagent:E:\IDEA\IntelliJ IDEA Community Edition 2021.3.2\lib\idea_rt.jar=51082:E:\IDEA\IntelliJ IDEA Community Edition 2021.3.2\bin" -Dfile.encoding=UTF-8 -classpath E:\JAVAcode\gyljava\ObjectTest\out\production\ObjectTest EqualsTest1
 * false
 * true
 *
 * Process finished with exit code 0
 */