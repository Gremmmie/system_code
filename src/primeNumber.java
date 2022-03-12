/**
 * Created with IntelliJ IDEA.
 * Description: Hello,I would appreciate your comments~
 * User: Gremmie
 * Date: 2022-03-12
 * Destination:
 */
public class primeNumber {
    public static void main(String[] args) {
        int i,j,a;
        for(i=3;i<=100;i++){
            a=1;
            for(j=2;j<i;j++){
                if(i%j==0) {
                    a = 0;
                    break;
                }
            }
            if(a==1){
                System.out.println(i);
            }
        }
    }
}
