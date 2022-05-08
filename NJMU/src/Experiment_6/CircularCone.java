package Experiment_6;

/**
 * @author Gremmie102
 * @date 2022/5/8 10:23
 * @purpose :
 */
public class CircularCone extends CircularShapeWithHeight{
    int R;
    int H;
    double l=Math.sqrt(Math.pow(R,2)+Math.pow(H,2));//母线
    public CircularCone(int R,int H){
        this.H = H;
        this.R = R;
    }

    public int getR() {
        return R;
    }

    public void setR(int r) {
        R = r;
    }

    public int getH() {
        return H;
    }

    public void setH(int h) {
        H = h;
    }

    public double getL() {
        return l;
    }

    public void setL(double l) {
        this.l = l;
    }

    @Override
    public double V() {
        double 底面积 = Math.PI*Math.pow(R,2);
        return (底面积*H)/3;
    }

    @Override
    public double S() {
        double 底面积 = Math.PI*Math.pow(R,2);
        double 侧面积 = Math.PI*R*l;
        return 底面积+侧面积;
    }
}
