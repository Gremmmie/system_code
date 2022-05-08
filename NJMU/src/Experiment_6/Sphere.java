package Experiment_6;

/**
 * @author Gremmie102
 * @date 2022/5/8 13:34
 * @purpose :
 */
public class Sphere implements Shape3D{
    int r;
    public Sphere(){
        r=1;
    }
    public Sphere(int r){
        this.r=r;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    @Override
    public double V() {
        return 4*(Math.PI*Math.pow(r,3))/3;
    }

    @Override
    public double S() {
        return 4*(Math.PI*Math.pow(r,2));
    }
}
