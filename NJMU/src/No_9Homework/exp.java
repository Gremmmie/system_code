package No_9Homework;

/**
 * @author Gremmie102
 * @date 2022/5/31 9:14
 * @purpose :
 */
class C {

    void test(){

        System.out.println ("Love programming!");

    }

}



class D extends C {

    void test() {

        super.test();

        System.out.println("Love learning!");

    }

}



public class exp{

    public static void main (String[] args) {

        C a = new D();

        D b = new D();

        a.test();

        b.test();

    }

}