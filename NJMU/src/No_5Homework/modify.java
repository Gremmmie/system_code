package No_5Homework;

/**
 * Created with IntelliJ IDEA.
 * Description: Hello,I would appreciate your comments~
 * User:
 * Date: -04-07
 * Destination:
 */
public class modify {
        public static void main(String[] args){
            System.out.print(0);
            int fib0=0;
            int fib1=1;
            int fib2 = fib0 + fib1;
            while(fib2 < 100){
                fib0 = fib1;
                fib1 = fib2;
                fib2 = fib1 + fib0;
                System.out.print("," + fib1);
            }
        }
//        int output=10;
//        boolean b1 = false;
//        if((b1=true) && ((output+=10)==20)){
//            System.out.println("We are equal "+output);
//        }else{
//            System.out.println("Not equal! "+output);
//        }
//        boolean b1 = true, b2=false;
//        System.out.println(! b1 && b2 ||b2);
//        System.out.println(!b1&&b2);

    public void modify(){
        int I,j,k=0;
        I = 100;
        while(I>0) {
            j = I*2;
            System.out.println("The value of j is"+j);
            k = k+1;
            I--;
        }
    }
}
