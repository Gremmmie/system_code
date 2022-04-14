package Shape3D;

/**
 * Created with IntelliJ IDEA.
 * Description: Hello,I would appreciate your comments~
 * User:
 * Date: -04-14
 * Destination:
 */
public class Sphere implements Shape3D {
    private double r;//半径

    public Sphere(double a) {
        this.r=a;
    }

    public double Volume() {
        double V=4.0/3*Math.PI*r*r*r;
        return V;
    }

    public double Superficial() {
        double S=4*Math.PI*r*r;
        return S;
    }

    public double getR() {
        return r;
    }
}