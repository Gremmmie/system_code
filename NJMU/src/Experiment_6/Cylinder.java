package Experiment_6;

/**
 * @author Gremmie102
 * @date 2022/5/8 12:31
 * @purpose :
 */
public class Cylinder extends CircularShapeWithHeight{
    int 半径;
    int 高;
    public Cylinder(int 半径,int 高){
        this.半径 = 半径;
        this.高 = 高;
    }

    public int get半径() {
        return 半径;
    }

    public void set半径(int 半径) {
        this.半径 = 半径;
    }

    public int get高() {
        return 高;
    }

    public void set高(int 高) {
        this.高 = 高;
    }

    @Override
    public double V() {
        return Math.PI*Math.pow(半径,2)*高;
    }
    @Override
    public double S() {
        double 侧面积 = 2*半径*Math.PI*高;
        double 表面积 = 侧面积+2*Math.PI*Math.pow(半径,2);
        return 表面积;
    }
}
