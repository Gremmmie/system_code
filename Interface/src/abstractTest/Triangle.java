package abstractTest;

/**
 * Created with IntelliJ IDEA.
 * Description: Hello,I would appreciate your comments~
 * User:
 * Date: -04-11
 * Destination:
 */
//三角形类
public class Triangle extends Shape{
    private double a;
    private double b;
    private double c;


    @Override
    public void draw() {
        System.out.println("三角形：a="+a+
                " b="+b+
                " c="+c);
    }

    @Override
    public void calcArea() {
        double C = (a + b + c) / 2;//周长的一半
        double S = Math.sqrt(C*(C-a)*(C-b)*(C-c));//面积
        System.out.println("面积为"+area);
    }


//    @Override
//    void calcArea();
// 这里这样写编译会失败，该类抽象方法被继承了之后必须重写
// 或者将三角形类设计为抽象类
}
