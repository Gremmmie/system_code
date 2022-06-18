package Final_Review.实验1;

/**
 * @author Gremmie102
 * @date 2022/6/18 16:42
 * @purpose :
 */
public class printDesign {
    public static void main(String[] args) {
        for (int i=1;i<=5;i++){
            for (int j=1;j<=6-i;j++){
                System.out.print("-");
            }
            for (int j=1;j<=2*i-1;j++){
                System.out.print(2*i-1);
            }
            for (int j=1;j<=6-i;j++){
                System.out.print("-");
            }
            System.out.println();
        }
    }
}
