/**
 * Created with IntelliJ IDEA.
 * Description: Hello,I would appreciate your comments~
 * User:
 * Date: -03-12
 * Destination:
 */
public class daffodilNum {
    public static void main(String[] args) {
        int i;
        for(i=100;i<=999;i++){
            if(i==Math.pow(i%10,3)+Math.pow((i/10)%10,3)+Math.pow(i/100,3)){
                System.out.println(i);
            }
        }
    }
}
