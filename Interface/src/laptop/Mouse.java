package laptop;

/**
 * Created with IntelliJ IDEA.
 * Description: Hello,I would appreciate your comments~
 * User:
 * Date: -04-12
 * Destination:
 */
//鼠标类，实现USB接口
public class Mouse implements USB{
    @Override
    public void openDevice(){
        System.out.println("打开鼠标");
    }

    @Override
    public void closeDevice(){
        System.out.println("关闭鼠标");
    }
    public void click(){
        System.out.println("鼠标点击");
    }
}
