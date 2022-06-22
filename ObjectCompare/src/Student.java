/**
 * @author Gremmie102
 * @date 2022/6/22 19:53
 * @purpose :
 */
public class Student implements Comparable<Student>{
    int score;
    public Student(int score){
        this.score = score;
    }
    @Override
    public int compareTo(Student o) {
        return this.score-o.score;
    }

    public static void main(String[] args) {
        Student 小红 = new Student(99);
        Student 小明 = new Student(98);
        System.out.println(小红.compareTo(小明));
    }
}
