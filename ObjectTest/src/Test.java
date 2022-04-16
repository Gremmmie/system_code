/**
 * @author Gremmie
 * @date 2022/4/16 23:14
 * @purpose:
 */
class Person{}
class Student{}
public class Test {
    public static void main(String[] args){
        func(new Person());
        func(new Student());
    }
    public static void func(Object obj){
        System.out.println(obj);
    }
}

