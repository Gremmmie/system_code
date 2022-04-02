/**
 * Created with IntelliJ IDEA.
 * Description: Hello,I would appreciate your comments~
 * User:
 * Date: -04-03
 * Destination:普通块代码块
 */
public class TestDemo1 {
    public static void main(String[] args) {
        {//普通代码块直接用{}定义，
            int x =10;
            System.out.println("x1 = "+x);
        }
        int x = 200;
        System.out.println("x2 = "+x);
        {
            int y = 300;
            System.out.println("y = "+y);
        }
    }
}
