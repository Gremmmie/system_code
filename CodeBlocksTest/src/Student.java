/**
 * Created with IntelliJ IDEA.
 * Description: Hello,I would appreciate your comments~
 * User:
 * Date: -04-03
 * Destination:实例代码块和静态代码块
 */
public class Student {
    private String name;
    private String gender;
    private int age;
    private double score;
    private static String classRoom;

//    构造函数
    public Student(){
        System.out.println("Student的构造函数被执行了！");
    }

//    实例代码块
    {
        this.name = "Bonnie";
        this.age = 19;
        this.gender = "女";
        System.out.println("实例代码块初始化了！");
    }

//    静态代码块
    static {
        classRoom = "三年二班";
        System.out.println("静态代码块被调用了！");
    }

    public void show(){
        System.out.println("name:"+name+"age:"+age+"gender:"+gender);
    }


    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        System.out.println(Student.classRoom);
    }
}
