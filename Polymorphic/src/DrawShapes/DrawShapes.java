package DrawShapes;


import java.awt.*;

/**
 * Created with IntelliJ IDEA.
 * Description: Hello,I would appreciate your comments~
 * User:
 * Date: -04-07
 * Destination:
 */
public class DrawShapes {
    Rect rect = new Rect();
    Cycle cycle = new Cycle();
    Flower flower = new Flower();
    String[] shapes = {"cycle","rect","cycle","rect","flowers"};

//    public static void drawShapes(){
//        Shapes[] shapes = {new Cycle(),new Rect(),new Cycle(),
//                           new Rect(),new Flower()};
//        for(Shapes shape = shapes){
//            shape.draw();
//        }
//    }

    public static void main(String[] args) {
        Rect rect = new Rect();
        Cycle cycle = new Cycle();
        Flower flower = new Flower();
        String[] shapes = {"cycle","rect","cycle","rect","flower"};
        for(String shape:shapes){
            if(shape.equals("cycle")){
                cycle.draw();
            }else if(shape.equals("rect")){
                rect.draw();
            }else if(shape.equals("flower")){
                flower.draw();
            }
        }
    }
}
class Shapes{
    void draw(){
        System.out.println("图形");
    }
}
class Rect extends Shapes{
     void draw(){
        System.out.println("长方形▭");
    }
}
class Cycle extends Shapes{
    void draw(){
        System.out.println("圆⚪");
    }
}
class Flower extends Shapes{
    void draw(){
        System.out.println("花❀");
    }
}