package Experiment_6;

/**
 * @author Gremmie102
 * @date 2022/5/8 13:10
 * @purpose :
 */
public class RectangularPrism implements Shape3D{
    int 长;
    int 宽;
    int 高;
    public RectangularPrism(int 长,int 宽,int 高){
        this.长 = 长;
        this.宽 = 宽;
        this.高 = 高;
    }

    public int get长() {
        return 长;
    }

    public void set长(int 长) {
        this.长 = 长;
    }

    public int get宽() {
        return 宽;
    }

    public void set宽(int 宽) {
        this.宽 = 宽;
    }

    public int get高() {
        return 高;
    }

    public void set高(int 高) {
        this.高 = 高;
    }

    @Override
    public double V() {
        return 长*宽*高;
    }

    @Override
    public double S() {
        return 长*宽*2+长*高*2+宽*高*2;
    }
}
