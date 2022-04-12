package MoreInterface;

import static MoreInterface.TestDemo1.walk;

/**
 * Created with IntelliJ IDEA.
 * Description: Hello,I would appreciate your comments~
 * User:葛玉礼
 * Date: -04-12
 * Destination:机器人实现跑的接口
 */
public class Robot implements IRunning{
    private String name;
    public Robot(String name){
        this.name = name;
    }
    @Override
    public void run() {
        System.out.println(this.name+"正在用轮子跑");
    }

    public static void main(String[] args) {
        Robot robot = new Robot("机器人");
        walk(robot);
    }
}
