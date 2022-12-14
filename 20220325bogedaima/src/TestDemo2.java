/**
 * Created with IntelliJ IDEA.
 * Description: Hello,I would appreciate your comments~
 * User:
 * Date: -03-25
 * Destination:
 */
class Person {
    public String name;
    public int age;

    //构造方法：
    //名字与类名相同，且没有返回值类型，void也不行
    //一般情况下使用public修饰
    //在创建对象的时候由编译器自动调用，并且在对象的声明周期内只调用一次
    public Person(){
        this.name = "haha";
        this.age = 18;
        System.out.println("构造方法被调用了");
    }
    public Person(String name,int age){
        this.name = name;
        this.age = age;
        System.out.println("构造方法被调用了");
    }
    public void eat() {
        System.out.println("吃饭！");
    }

    public void sleep() {
        System.out.println("睡觉！");
    }
    public static void main(String[] args){
        //在此处创建了一个Date类型的对象，并没有显式调用构造函数
        Person p = new Person("xiaohong",18);
        p.eat();
    }
}


class MyGirlFired {
    public String name;
    public int age;
    public String eyes;

    public MyGirlFired(){
        this.name = "xiaohong";
        this.age = 18;
    }
    public MyGirlFired(String name,int age){
        this.name = name;
        this.age = age;
    }
    public void eat() {
        System.out.println("吃火锅！");
    }

    public static void main22(String[] args) {
        //如果编译器会生成，则生成的构造方法一定是无参数的
        //则此处创建对象是可以通过编译的
        //但实际上会报错
        MyGirlFired xHong = new MyGirlFired("xiaohong",18);
    }
}


class Student {
    //属性：成员变量-》类的内部  方法的外部的
    public String name;
    public int age;
    public double score ;
    public String sex;


    public Student() {
        //调用本类中   带有2个参数的构造方法，第一个参数的类型是String，第2个参数的类型是int
        this("yumi",18);
        //this("bit3",99,98.9,"女");
        System.out.println("这个是不带参数的构造方法！");
    }

    public Student(String name,int age) {
        //this();
        this.age = age;
        this.name = name;
        System.out.println("这个是带2个参数的构造方法！");
    }

    public Student(String name, int age, double score, String sex) {
        this.name = name;
        this.age = age;
        this.score = score;
        this.sex = sex;
        System.out.println("带4个参数的构造方法！");
    }

    public void doClass() {
        System.out.println(name+"正在上课！");
        //this.doHomeWork();
    }
    public void doHomeWork(){
        System.out.println(name+"正在写作业");
    }

    public void show() {
        System.out.println("姓名："+name+" 年龄："+age+" 学分："+score+" 性别："+sex);
    }
}
//重构的时候
public class TestDemo2 {

    public static void main5(String[] args) {
        Student student = new Student();
        student.show();
    }

    public static void main6(String[] args) {
        Student student = new Student("gaobo",29);
        student.show();

        Student student2 = new Student("gaobo2",29,89.9,"女");
        student2.show();

       /* student.age = 10;
        student.name = "bit2";
        student.score = 10.9;
        student.sex = "男";
        student.show();*/


    }


    public static void main4(String[] args) {
        Student student = new Student();
        student.age = 10;
        student.name = "bit";
        student.score = 10.9;
        student.sex = "男";

    }


    public static void main3(String[] args) {
        //类名  变量 = new 类名()    实例化对象、 创建一个对象
        Student student = new Student();
        student.age = 10;
        student.name = "bit";
        student.score = 10.9;
        student.sex = "男";
        student.doClass();
        student.doHomeWork();
        student.show();
        System.out.println("=================");

        Student student2 = new Student();
        student2.name = "gaobo";
        student2.age = 19;
        student2.score = 99.9;
        student2.sex = "男";
        student2.doClass();
        student2.doHomeWork();
        student2.show();

        System.out.println("=============");
        Student student5 = new Student();
        student5.show();

//        int a;
//        System.out.println(a);




        Student student3 = null;

        Student student4 = new Student();
        student3 = student4;

        Student student6 = new Student();

    }

    public static void main2(String[] args) {
        //通过new关键字 实例化多个对象
        Student student1 = new Student();//学生 对象/实体
        Student student2 = new Student();//学生 对象/实体
        Student student3 = new Student();//学生 对象/实体
        Student student4 = new Student();//学生 对象/实体
        Student student5 = new Student();//学生 对象/实体

        //new 关键字
        MyGirlFired myGirlFired = new MyGirlFired();//女朋友对象了

    }
    public static void main1(String[] args) {
        int a = 10;
        //实例化一个对象【通过new关键字来创建了一个对象】
        Person person = new Person();
    }
}