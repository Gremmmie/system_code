/**
 * Created with IntelliJ IDEA.
 * Description: Hello,I would appreciate your comments~
 * User:
 * Date: -04-16
 * Destination:
 */

class daguaishou {
    String name;
    int height;
    int weight;

    void miaoshu() {
        System.out.println("我只有" + weight + "是苗条的小怪兽");
    }

    void speak() {
        System.out.println("我是超级无敌大怪兽" + name + "啊");
    }

    void high() {
        System.out.println("天哪，我有" + height+"也太高了吧！");
    }
}
public class test2 {
        public static void main(String[] args) {
            daguaishou tesila = new daguaishou();
            tesila.height = 185;
            tesila.weight = 110;
            tesila.name = "特斯拉";
            tesila.miaoshu();
            tesila.speak();
            tesila.high();

        }

    }