/**
 * Created with IntelliJ IDEA.
 * Description: Hello,I would appreciate your comments~
 * User:
 * Date: -03-27
 * Destination:
 */
class Test {
    public static void hello() {
        System.out.println("hello");
    }
}
public class MyApplication {



    public static void main1(String[] args) {
        // TODO Auto-generated method stub
        Test.hello();
    }
}
class Test2 {
    public int aMethod(){
    int i = 0;
        i++;
        return i;
    }
    public static void main(String args[]){
        Test2 test = new Test2();
        test.aMethod();
        int j = test.aMethod();
        System.out.println(j);
    }
}