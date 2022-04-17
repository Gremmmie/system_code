/**
 * @author Gremmie102
 * @date 2022/4/17 11:39
 * @purpose :演示了 hashCode() 方法的使用
 */
public class HashCodeTest1 {
    public static void main(String[] args) {

        // Object 使用 hashCode()
        Object obj1 = new Object();
        System.out.println(obj1.hashCode());

        Object obj2 = new Object();
        System.out.println(obj2.hashCode());

        Object obj3 = new Object();
        System.out.println(obj3.hashCode());
    }
}
/**
 * 运行结果
 * E:\develop\Java\jdk-11\bin\java.exe "-javaagent:E:\IDEA\IntelliJ IDEA Community Edition 2021.3.2\lib\idea_rt.jar=51403:E:\IDEA\IntelliJ IDEA Community Edition 2021.3.2\bin" -Dfile.encoding=UTF-8 -classpath E:\JAVAcode\gyljava\ObjectTest\out\production\ObjectTest HashCodeTest1
 * 2003749087
 * 1324119927
 * 990368553
 *
 * Process finished with exit code 0
 */