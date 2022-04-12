package laptop;

/**
 * Created with IntelliJ IDEA.
 * Description: Hello,I would appreciate your comments~
 * User:
 * Date: -04-12
 * Destination:
 */
//测试类：
public class TestUSB{
    public static void main(String[] args){
        Computer computer = new Computer();
        computer.powerOn();

        //使用鼠标设备
        computer.useDevice(new Mouse());

        //使用键盘设备
        computer.useDevice(new KeyBoard());

        computer.powerOff();
    }
}