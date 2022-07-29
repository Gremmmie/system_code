import book.BookList;
import user.AdminUser;
import user.NormalUser;
import user.User;

import java.util.Scanner;

/**
 * @Author 12629
 * @Date 2022/4/10 11:38
 * @Description：
 */
public class Main {

    public static User login() {
        System.out.println("请输入姓名：");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.println("请输入你的身份：1-》管理员，0-》普通用户");
        int choice = scan.nextInt();
        if(choice == 1) {
            return new AdminUser(name);
        }else {
            return new NormalUser(name);
        }
    }

    public static void main(String[] args) {
        //准备好了书
        BookList bookList = new BookList();
        User user = login();//user到底引用哪个对象 需要看
        while (true) {
            int choice = user.menu();
            //user引用哪个对象？
            // 选择了1之后，调用的是user引用的对象的具体操作，这个怎么做？？
            user.doOperation(choice,bookList);
        }
    }
}
