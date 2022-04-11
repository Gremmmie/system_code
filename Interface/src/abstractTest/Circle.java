package abstractTest;

/**
 * Created with IntelliJ IDEA.
 * Description: Hello,I would appreciate your comments~
 * User:
 * Date: -04-11
 * Destination:
 */
//圆类
public class Circle extends Shape{
    private double r;
    final private static double PI = 3.14;
    public Circle(double r){
        this.r = r;
    }

    @Override
    public void draw() {
        System.out.println("圆：r ="+r);
    }

    @Override
    void calcArea() {
        area = PI*r*r;
        System.out.println("面积为"+area);
    }
}
