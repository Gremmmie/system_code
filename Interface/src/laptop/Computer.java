package laptop;

/**
 * Created with IntelliJ IDEA.
 * Description: Hello,I would appreciate your comments~
 * User:
 * Date: -04-12
 * Destination:
 */
//笔记本类：使用USB设备
public class Computer {
    public void powerOn(){
        System.out.println("打开笔记本电脑");
    }

    public void powerOff(){
        System.out.println("关闭笔记本电脑");
    }
    public void useDevice(USB usb){
        usb.openDevice();
        if(usb instanceof Mouse){
            Mouse mouse = (Mouse)usb;
            mouse.click();
        }else if(usb instanceof KeyBoard){
            KeyBoard keyBoard = (KeyBoard)usb;
            keyBoard.inPut();
        }
        usb.closeDevice();
    }
}

