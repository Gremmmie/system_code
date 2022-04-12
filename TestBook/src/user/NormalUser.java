package user;

import operation.*;

import java.util.Scanner;

/**
 * @ Author 12629
 * @ Date 2022/4/10 12:05
 * @ Description：
 */
public class NormalUser extends User {

    public NormalUser(String name) {
        super(name);
        this.ioPerations = new IOPeration[] {
                new ExitOperation(),
                new FindOperation(),
                new BorrowOperation(),
                new ReturnOperation()
        };
    }

    public int menu() {
        System.out.println("hello "+this.name+" 欢迎来到图书小练习");
        System.out.println("1.查找图书");
        System.out.println("2.借阅图书");
        System.out.println("3.归还图书");
        System.out.println("0.退出系统");
        System.out.println("请输入你的操作：");
        Scanner sca = new Scanner(System.in);
        int choice = sca.nextInt();
        return choice;
    }
}