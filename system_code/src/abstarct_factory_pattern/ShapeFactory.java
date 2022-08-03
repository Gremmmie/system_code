package abstarct_factory_pattern;

public class ShapeFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("circle")){
            return new Circle();
        } else if(shapeType.equalsIgnoreCase("rectangle")){
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("square")){
            return new Square();
        }
        return null;
    }

    @Override
    public Color getColor(String color) {
        if (color.equalsIgnoreCase("绿色")){
            return new Green();
        }else if (color.equalsIgnoreCase("蓝色")){
            return new Blue();
        }
        return null;
    }
}