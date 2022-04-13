package ClassArray;
import java.util.Arrays;
import java.util.Comparator;
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


    public static void sort(Comparable[] array){
//        这里要注意，虽然接口不能实例化对象，
//        但是接口类型的引用变量可以指向它的实现类对象
//        这里的实现类对象就是实现了这个接口的对象
//        例如Comparable[] comparable = new Student[3];
//        所以这里的参数就可以用Comparable[] array来接收
        for (int bound = 0;bound<array.length;bound++){
            for (int cur = array.length-1;cur>bound;cur--){
                if (array[cur-1].compareTo(array[cur])>0){
                    //这里就说明顺序不符合要求，交换两个变量的位置
                    Comparable tmp = array[cur-1];
                    array[cur-1] = array[cur];
                    array[cur] = tmp;
                }
            }
    }
}
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
    }

    public static void main(String[] args) {
        Student[] students = new Student[]{
                new Student("A",95),
                new Student("B",91),
                new Student("C",97),
                new Student("D",95),
        };
        System.out.println("sort前："+Arrays.toString(students));
        sort(students);
        System.out.println("sort后："+Arrays.toString(students));
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