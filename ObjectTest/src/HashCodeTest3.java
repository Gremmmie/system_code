/**
 * @author Gremmie102
 * @date 2022/4/17 11:45
 * @purpose :引用变量指向一个对象情况下，它们调用hashCode方法
 */
public class HashCodeTest3 {
    public static void main(String[] args) {

        // Object 使用 hashCode()
        Object obj1 = new Object();

        // obj1 赋值给 obj2
        Object obj2 = obj1;

        // 判断两个对象是否相等
        System.out.println(obj1.equals(obj2)); // true

        // 获取 obj1 与 obj2 的哈希值
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());

    }
}
/**
 * 运行结果
 * E:\develop\Java\jdk-11\bin\java.exe "-javaagent:E:\IDEA\IntelliJ IDEA Community Edition 2021.3.2\lib\idea_rt.jar=51415:E:\IDEA\IntelliJ IDEA Community Edition 2021.3.2\bin" -Dfile.encoding=UTF-8 -classpath E:\JAVAcode\gyljava\ObjectTest\out\production\ObjectTest HashCodeTest3
 * true
 * 2003749087
 * 2003749087
 *
 * Process finished with exit code 0
 */