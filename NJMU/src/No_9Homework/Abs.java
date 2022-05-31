package No_9Homework;

/**
 * @author Gremmie102
 * @date 2022/5/31 9:09
 * @purpose :
 */
abstract class Base{

    abstract public void myfunc();

    public void another(){
        System.out.println("Another method");
    }

}

public class Abs extends Base{

    public void myfunc(){
        System.out.println("My func");
    }

    public void amethod(){
        myfunc();
    }

    public static void main(String argv[]) {
        Abs a = new Abs();
        a.amethod();
    }

}