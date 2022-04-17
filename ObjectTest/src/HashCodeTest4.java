import java.util.Objects;

/**
 * @author Gremmie102
 * @date 2022/4/17 11:51
 * @purpose :重写hashCode()方法
 */
class Human{
    public String name;
    public int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,age);
    }
}

public class HashCodeTest4 {
    public static void main(String[] args) {
        Human human1 = new Human("Gremmie",19);
        Human human2 = new Human("Gremmie",19);

        System.out.println(human1.hashCode());
        System.out.println(human2.hashCode());
    }
}
/**
 * 运行结果
 * E:\develop\Java\jdk-11\bin\java.exe "-javaagent:E:\IDEA\IntelliJ IDEA Community Edition 2021.3.2\lib\idea_rt.jar=51508:E:\IDEA\IntelliJ IDEA Community Edition 2021.3.2\bin" -Dfile.encoding=UTF-8 -classpath E:\JAVAcode\gyljava\ObjectTest\out\production\ObjectTest HashCodeTest4
 * 277247006
 * 277247006
 *
 * Process finished with exit code 0
 */