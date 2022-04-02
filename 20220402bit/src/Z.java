/**
 * Created with IntelliJ IDEA.
 * Description: Hello,I would appreciate your comments~
 * User:
 * Date: -04-03
 * Destination:
 */
class X{
    Y y = new Y();
    public X(){
        System.out.println("X");
    }
}
class Y{
    public Y(){
        System.out.println("Y");
    }
}
public class Z extends X{
    Y y = new Y();
    public Z(){
        System.out.println("Z");
    }

    public static void main(String[] args) {
        new Z();
    }
}
