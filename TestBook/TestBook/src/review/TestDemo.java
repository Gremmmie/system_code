package review;

import java.util.Comparator;
import java.util.Objects;

/**
 * @Author 12629
 * @Date 2022/4/12 18:54
 * @Description：
 */
class Student implements Comparable<Student>{
    public String name;
    public int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }



    @Override
    public int compareTo(Student o) {
        //return this.age-o.age;
        return this.name.compareTo(o.name);
    }
}

class AgeComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.age-o2.age;
    }
}

class NameComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.name.compareTo(o2.name);
    }
}


public class TestDemo {

    public static void main(String[] args) {
        Student student1 = new Student("bbc",19);

        Student student2 = new Student("bbc",19);

        System.out.println(student1.equals(student2));


    }
    public static void main2(String[] args) {
        Student student1 = new Student("ait",19);

        Student student2 = new Student("bbc",9);

        AgeComparator ageComparator = new AgeComparator();

        NameComparator nameComparator = new NameComparator();
        //提出问题   这两个对象 要进行大小的比较？？？请问你怎么比较？？ 年龄判断
        if( nameComparator.compare(student1,student2) > 0) {
            System.out.println("student1 > student2");
        }else {
            System.out.println("student1 <= student2");
        }

    }
    public static void main1(String[] args) {
        Student student1 = new Student("ait",19);

        Student student2 = new Student("bbc",9);

        //提出问题   这两个对象 要进行大小的比较？？？请问你怎么比较？？ 年龄判断
        if(student1.compareTo(student2) > 0) {
            System.out.println("student1 > student2");
        }else {
            System.out.println("student1 <= student2");
        }

    }
}
