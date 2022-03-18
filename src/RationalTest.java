/**
 * Created with IntelliJ IDEA.
 * Description: Hello,I would appreciate your comments~
 * User: 葛玉礼
 * Date: 2022-03-19
 * Destination:这是一个利用有理数方法来解释依赖概念的类
 */
public class RationalTest {
//    我们进一步利用有理数的类中的方法来解释我们的概念
    public static void main(String[] args) {
        RationalNumber r1 = new RationalNumber(6,8);
        RationalNumber r2 = new RationalNumber(1,3);
        RationalNumber r3, r4, r5 ,r6, r7;
        System.out.println("First rational number:" + r1);
        System.out.println("Second rational number:" + r2);
        if(r1.isLike(r2)){
            System.out.println("r1 and r2 are equal.");
        }else {
            System.out.println("r1 and r2 are not equal.");
            r3 = r1.reciprocal();
            r4 = r1.add(r2);
            r5 = r1.subtract(r2);
            r6 = r1.multiply(r2);
            r7 = r1.divide(r2);
            System.out.println("r1 + r2 = " + r4);
            System.out.println("r1 - r2 = " + r5);
            System.out.println("r1 * r2 = " + r6);
            System.out.println("r1 / r2 = " + r7);
        }
    }
}
