package ClassArray;

/**
 * Created with IntelliJ IDEA.
 * Description: Hello,I would appreciate your comments~
 * User:
 * Date: -04-13
 * Destination:
 */
public class Student implements Comparable<Student>{
    private String name;
    private int score;

    Student[] students = new Student[]{
            new Student("A",95),
            new Student("B",91),
            new Student("C",97),
            new Student("D",95),
    };

    public Student(String name,int score){
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        if (this.score>o.score){
            return -1;
//      如果当前对象应排在参数对象之前，则返回小于0的数字
        } else if(this.score<o.score){
            return 1;
//      如果当前对象应排在参数对象之后，则返回大于0的数字
        } else{
            return 0;
//      如果当前对象和参数对象不分先后，则返回0
        }

//        public static void sort(Comparable[] array){
//            for (int bound = 0;bound<array.)
//        }
    }
}
//    public static void main(String[] args) {
//        Student[] students = new Student[]{
//                new Student("A",95),
//                new Student("B",91),
//                new Student("C",97),
//                new Student("D",95),
//        };
//    }