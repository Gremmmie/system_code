package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

/**
 * @Author 12629
 * @Date 2022/4/10 11:56
 * @Description：
 */
public class BorrowOperation implements IOPeration {

    public void work(BookList bookList) {
        System.out.println("借阅图书！");

        System.out.println("请输入你要借阅图书的名字:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        int currentSize = bookList.getUsedSize();
        int i = 0;
        for (; i < currentSize; i++) {
            Book book = bookList.getPos(i);
            if(book.getName().equals(name)) {
                //找到这本书了
                book.setBorrowed(true);
                System.out.println("借阅成功！");
                return;
            }
        }
        System.out.println("没有你要借阅的图书！");
    }

}
