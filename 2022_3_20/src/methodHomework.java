/**
 * Created with IntelliJ IDEA.
 * Description: Hello,I would appreciate your comments~
 * User:
 * Date: -03-20
 * Destination:
 */
public class methodHomework {
    public static void main(String[] args) {
        System.out.println(factorial(4));

    }
    public static int factorial(int n){
        if(1 == n){
            return 1;
        }
        return n*factorial(n-1);
    }
}
