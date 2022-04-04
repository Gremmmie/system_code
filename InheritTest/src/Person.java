import jdk.swing.interop.SwingInterOpUtils;

/**
 * Created with IntelliJ IDEA.
 * Description: Hello,I would appreciate your comments~
 * User:
 * Date: -04-05
 * Destination:
 */
public class Person{
    public String name;
    public int age;
    public Person(String name,int age){
        this.name = name;
        this.age = age;
        System.out.println("Person类的构造方法开始执行了");
    }
    {
        System.out.println("Person类的实例代码块执行了！");
    }
    static {
        System.out.println("Person类的静态代码块执行了！");
    }
}
class Student extends Person{

    public Student(String name, int age) {
        super(name, age);
        System.out.println("Student的构造方法被调用了！");
    }
    {
        System.out.println("Student的实例代码块被调用了！");
    }
    static {
        System.out.println("Student的静态代码块被调用了！");
    }

    public static void main(String[] args) {
        Student student1 = new Student("葛玉礼",19);
        System.out.println("=======================");
        Student student2 = new Student("Gremmie",18);
    }

    public static void main1(String[] args) {
        Person person1 = new Person("葛玉礼",19);
        System.out.println("======分割线=======");
        Person person2 = new Person("小红",19);
    }
}



//public class Person {
//    public String name;
//    public int age;
//    public Person(String name,int age){
//        this.name = name;
//        this.age = age;
//        System.out.println("构造方法被调用了！");
//    }
//    {
//        System.out.println("实例代码块被调用了！");
//    }
//    static {
//        System.out.println("静态代码块被调用了！");
//    }
//
//    public static void main(String[] args) {
//        Person p1 = new Person("葛玉礼",19);
//        System.out.println("======分割线=======");
//        Person p2 = new Person("小红",19);
//    }
//}
