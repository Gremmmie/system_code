package laptop;

/**
 * Created with IntelliJ IDEA.
 * Description: Hello,I would appreciate your comments~
 * User:
 * Date: -04-12
 * Destination:
 */
//键盘类，实现USB接口
public class KeyBoard implements USB {
    @Override
    public void openDevice(){
        System.out.println("打开键盘");
    }

    @Override
    public void closeDevice(){
        System.out.println("关闭键盘");
    }

    public void inPut(){
        System.out.println("键盘输入");
    }
}

