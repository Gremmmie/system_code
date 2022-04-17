/**
 * @author Gremmie102
 * @date 2022/4/17 12:30
 * @purpose :接收数组对象
 */
public class ObjectTest1 {
    public static void main(String[] args) {
        //Object接收数组对象，向上转型
        Object obj = new int[]{1,2,3,4,5,6};

        //向下转型，需要强制转换
        int[] data = (int[])obj;
        for (int i :data) {
            System.out.print(i+" ");
        }
    }
}
/**
 * 运行结果
 * E:\develop\Java\jdk-11\bin\java.exe "-javaagent:E:\IDEA\IntelliJ IDEA Community Edition 2021.3.2\lib\idea_rt.jar=52075:E:\IDEA\IntelliJ IDEA Community Edition 2021.3.2\bin" -Dfile.encoding=UTF-8 -classpath E:\JAVAcode\gyljava\ObjectTest\out\production\ObjectTest ObjectTest1
 * 1 2 3 4 5 6
 * Process finished with exit code 0
 */
