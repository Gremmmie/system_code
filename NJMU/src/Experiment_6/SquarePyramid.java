package Experiment_6;

/**
 * @author Gremmie102
 * @date 2022/5/8 13:38
 * @purpose :
 */
public class SquarePyramid implements Shape3D{
    int 边长;
    int 高;
    public SquarePyramid(){
        this.边长 = 1;
        this.高 = 1;
    }
    public SquarePyramid(int 边长, int 高) {
        this.边长 = 边长;
        this.高 = 高;
    }

    public int get边长() {
        return 边长;
    }

    public void set边长(int 边长) {
        this.边长 = 边长;
    }

    public int get高() {
        return 高;
    }

    public void set高(int 高) {
        this.高 = 高;
    }

    @Override
    public double V() {
        return Math.pow(边长,2)*高/2;
    }

    @Override
    public double S() {
        double 底面积 = Math.pow(边长,2);
        double 侧面积 = 2*边长*Math.sqrt(Math.pow(边长,2)/4+Math.pow(高,2));
        return 底面积+侧面积;
    }
}
