package demo2;
import java.util.Objects;
/**
 * Created with IntelliJ IDEA.
 * Description: Hello,I would appreciate your comments~
 * User:
 * Date: -04-13
 * Destination:
 */
class Student {
    public String name;
    public int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    //用来判断 两个引用 所引用的对象 是不是一样的
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        //暂且理解为 判断类型的
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Student student = (Student) o;

        if( age == student.age &&  this.name.equals(student.name)) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}

interface IShape {
    public void func();
}

class Test implements IShape {

    @Override
    public void func() {
        System.out.println("hello");
    }
}
public class TestDemo2 {

    public static void main(String[] args) {
        IShape shape = new Test();
        //接口给Object
        Object o = shape;
        //o.func();//

        //互相转换
        IShape shape1 = (IShape)o;
        shape1.func();

    }

    public static void main2(String[] args) {
        // Object接收数组对象，向上转型
        Object obj = new int[]{1,2,3,4,5,6} ;

        Object obj2 = new Double[]{1.0,2.5};


        // 向下转型，需要强转
        int[] data = (int[]) obj ;

        for(int i :data){
            System.out.println(i+"、");
        }

    }

    public static void main1(String[] args) {
        Student student1 = new Student("gaobo",18);
        //Student student2 = student1;
        Student student2 = new Student("gaobo",18);

        System.out.println(student1.equals(student2));
        //System.out.println(student2);

        System.out.println("=========对象的位置。在hashmap当中 会使用到=======");
        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());

    }
}