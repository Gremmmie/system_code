package abstractTest;

/**
 * Created with IntelliJ IDEA.
 * Description: Hello,I would appreciate your comments~
 * User:
 * Date: -04-11
 * Destination:
 */
//抽象类
public abstract class Shape{
    //抽象方法：被abstract修饰的方法，没有方法体
    abstract public void draw();
    abstract void calcArea();

//    abstract final void methodA();
//    abstract public static void methodB();

//    abstract private void draw();
    //抽象类也是类，也可以增加普通方法和属性
    public double getArea(){
        return area;
    }

    protected double area;//面积

//    public static void main(String[] args) {
//        Shape shape = new Shape() {
//            @Override
//            public void draw() {
//
//            }
//            @Override
//            void calcArea() {
//
//            }
//        };
//    }
}
