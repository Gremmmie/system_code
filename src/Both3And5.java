/**
 * Created with IntelliJ IDEA.
 * Description: Hello,I would appreciate your comments~
 * User:
 * Date: 2022-03-11
 * Destination:
 */
public class Both3And5 {
    public static void main(String[] args) {
        int i=1;
        while(i<=100){
            if(i%15==0){
                System.out.println(i);
                i++;
                continue;
            }
            i++;
        }
    }
}
