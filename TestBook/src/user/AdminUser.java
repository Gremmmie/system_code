package user;

import book.BookList;
import operation.*;

import java.util.Scanner;

/**
 * @ Author 12629
 * @ Date 2022/4/10 12:05
 * @ Description：
 */
public class AdminUser extends User{

    public AdminUser(String name) {
        super(name);

        this.ioPerations = new IOPeration[] {
                new ExitOperation(),
                new FindOperation(),
                new AddOperation(),
                new DelOperation(),
                new DisplayOperation()
        };
    }

    public int menu() {
        System.out.println("hello "+this.name+" 欢迎来到图书小练习");
        System.out.println("1.查找图书");
        System.out.println("2.新增图书");
        System.out.println("3.删除图书");
        System.out.println("4.显示图书");
        System.out.println("0.退出系统");
        System.out.println("请输入你的操作：");
        Scanner sca = new Scanner(System.in);
        int choice = sca.nextInt();
        return choice;

    }
}