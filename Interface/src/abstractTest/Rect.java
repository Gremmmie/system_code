package abstractTest;

/**
 * Created with IntelliJ IDEA.
 * Description: Hello,I would appreciate your comments~
 * User:
 * Date: -04-11
 * Destination:
 */
//矩形
public class Rect extends Shape{
    private double length;
    private double width;

    Rect(double length,double width){
        this.length = length;
        this.width = width;
    }

    @Override
    public void draw() {
        System.out.println("矩形：length="+length+"width="+width);
    }

    @Override
    void calcArea() {
        area = length*width;
        System.out.println("面积为"+area);
    }
}

