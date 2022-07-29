package user;

import book.BookList;
import operation.IOPeration;

/**
 * @Author 12629
 * @Date 2022/4/10 12:04
 * @Description：
 */
public abstract class User {
    protected String name;
    //.....罗列更多的属性

    public IOPeration[] ioPerations;//这里不初始化 接口数组

    public User(String name) {
        this.name = name;
    }

    public abstract int menu();

    public void doOperation(int choice,BookList bookList) {
        ioPerations[choice].work(bookList);
    }

}
