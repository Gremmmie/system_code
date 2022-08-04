package blockingqueue;

import java.util.Formattable;
import java.util.concurrent.PriorityBlockingQueue;

public class PriorityBlockingQueueTest {
    public static class Student implements Comparable<Student> {
        private String name;
        private int age;
        public Student(String name,int age){
            this.name = name;
            this.age = age;
        }
        public String getName(){
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public int compareTo(Student o) {
            return this.age > o.getAge() ? 1 : this.age <o.getAge() ? -1 : 0;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

    public static void main(String[] args) throws InterruptedException {
        PriorityBlockingQueue<Student> queue = new PriorityBlockingQueue<Student>();
        queue.put(new Student("小A",18));
        queue.put(new Student("小B",17));
        queue.put(new Student("小C",19));
        queue.put(new Student("小D",20));

        while (true){
            System.out.println(queue.take().toString());
        }
    }
}
