/**
 * @author Gremmie102
 * @date 2022/4/17 9:53
 * @purpose :重写Object中的toString中的方法
 */
public class Student {
    String name;
    int age;
    double score;

    public Student() {
    }

    public Student(String name, int age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public void study(){
        System.out.println(name+" is studying");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }

    public static void main(String[] args) {
        Student student = new Student("Gremmie",19,95);
        System.out.println(student);
    }
}
