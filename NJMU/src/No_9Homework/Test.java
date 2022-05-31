package No_9Homework;

/**
 * @author Gremmie102
 * @date 2022/5/31 9:12
 * @purpose :
 */
class A {

    double f(double x, double y) {
        return x * y;
    }

}

class B extends A {

    double f(double x, double y) {
        return x + y;
    }

}

public class Test {

    public static void main(String args[]) {
        B obj = new B();
        System.out.println("The program output is " + obj.f(4, 6));
    }

}