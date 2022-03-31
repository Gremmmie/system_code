/**
 * Created with IntelliJ IDEA.
 * Description: Hello,I would appreciate your comments~
 * User:
 * Date: -03-31
 * Destination:
 */
public class Computer {
    private String cpu;
//    CPU
    private String memory;
//    内存
    public String screen;
//    屏幕
    String brand;
//    品牌-----》default属性
public Computer(String brand,String cpu,String memory,String screen){
    this.brand = brand;
    this.cpu = cpu;
    this.memory = memory;
    this.screen = screen;

}
    public void Boot(){
        System.out.println("开机~~~~");
    }
    public void PowerOff(){
        System.out.println("关机~~~~");
    }
    public void SurfInternet(){
        System.out.println("网上冲浪！！");
    }
}

class TestComputer{
    public static void main(String[] args){
        Computer p = new Computer("HW","i7","8G","13*14");
        System.out.println(p.brand);
//        default属性：只能被本报中类访问
        System.out.println(p.screen);
//        public属性：可以任何其他类访问
        //System.out.println(p.cpu);
//        private属性：只能在Computer类中访问，不能被其他类访问
    }

}
