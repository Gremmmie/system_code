/**
 * Created with IntelliJ IDEA.
 * Description: Hello,I would appreciate your comments~
 * User:
 * Date: -03-20
 * Destination:
 */
public class diguidayin {
    public static void main(String[] args) {
        factorialPrint(1234);
    }
    public static void factorialPrint(int a){
        if(a>9){
            factorialPrint(a/10);
        }
        System.out.print(a%10+" ");
    }
}

