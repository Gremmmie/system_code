package OtherClass;

/**
 * Created with IntelliJ IDEA.
 * Description: Hello,I would appreciate your comments~
 * User:
 * Date: -03-17
 * Destination:
 */
public class drawStairs {
    public static final  int  TOTAL_STAIRS=4;

    public static void main(String[] args) {
        for(int stairs=1;stairs<=TOTAL_STAIRS;stairs++) {
            for(int i=1;i<=5*TOTAL_STAIRS-5*stairs;i++) {
                System.out.print(" ");
            }
            System.out.print("  O  ******");
            for(int i =1;i<=stairs*5-5;i++) {
                System.out.print(" ");
            }
            System.out.println("*");
            for (int i=1;i<=5*TOTAL_STAIRS-5*stairs;i++) {
                System.out.print(" ");
            }
            System.out.print(" /|\\ *     ");
            for(int i=1;i<=stairs*5-5;i++) {
                System.out.print(" ");
            }
            System.out.println("*");
            for(int i=1;i<=5*TOTAL_STAIRS-5*stairs;i++) {
                System.out.print(" ");
            }
            System.out.print(" / \\ *     ");
            for (int i=1;i<=stairs*5-5;i++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        for(int i=1;i<=5*TOTAL_STAIRS+7;i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
