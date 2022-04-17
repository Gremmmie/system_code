/**
 * @author Gremmie102
 * @date 2022/4/17 12:35
 * @purpose :用Object接收接口对象
 */
interface IMessage {
    String getMessage();
}
class Message implements IMessage {
    String str = "我爱Java";
    @Override
    public String toString() {
        return "Life is not satisfactory";
    }
    @Override
    public String getMessage() {
        return str;
    }
}
public class ObjectTest2 {
    public static void main(String[] args) {
        IMessage message = new Message();
//        子类向父接口转型
        Object object = message;
//        接口向Object转型
        System.out.println(object);
        IMessage temp = (IMessage) object;
        System.out.println(temp.getMessage());
    }
}
/**
 *运行结果
 * E:\develop\Java\jdk-11\bin\java.exe "-javaagent:E:\IDEA\IntelliJ IDEA Community Edition 2021.3.2\lib\idea_rt.jar=52215:E:\IDEA\IntelliJ IDEA Community Edition 2021.3.2\bin" -Dfile.encoding=UTF-8 -classpath E:\JAVAcode\gyljava\ObjectTest\out\production\ObjectTest ObjectTest2
 * Life is not satisfactory
 * 我爱Java
 * Process finished with exit code 0
 */