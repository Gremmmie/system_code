/**
 * Created with IntelliJ IDEA.
 * Description: Hello,I would appreciate your comments~
 * User:
 * Date: 2022-03-11
 * Destination:
 */
public class Both3And5 {
    public static void main(String[] args) {
        int sum1 = 0,sum2=0;
        int i,j;
        for(i=1;i<=100;i++){
            if(i%2==1){
                sum1 += i;
            }else {
                sum2 += i;
            }
        }
        System.out.println(sum1+" "+sum2);
    }


    public static void main1(String[] args) {
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
