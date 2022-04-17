import java.util.Objects;

/**
 * @author Gremmie102
 * @date 2022/4/17 10:33
 * @purpose :未重写equals的Person类
 */
public class Person {
    private String name;
    private int age;
    public Person(String name,int age){
        this.age = age;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        Person p1 = new Person("Gremmie",19);
        Person p2 = new Person("Gremmie",19);

        System.out.println(a==b);
        System.out.println(p1==p2);
        System.out.println(p1.equals(p2));
    }
}
/**
 * 运行结果
 * E:\develop\Java\jdk-11\bin\java.exe "-javaagent:E:\IDEA\IntelliJ IDEA Community Edition 2021.3.2\lib\idea_rt.jar=51109:E:\IDEA\IntelliJ IDEA Community Edition 2021.3.2\bin" -Dfile.encoding=UTF-8 -classpath E:\JAVAcode\gyljava\ObjectTest\out\production\ObjectTest Person
 * true
 * false
 * false
 *
 * Process finished with exit code 0
 */