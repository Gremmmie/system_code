package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

/**
 * @Author 12629
 * @Date 2022/4/10 11:58
 * @Description：
 */
public class FindOperation implements IOPeration{

    public void work(BookList bookList) {
        System.out.println("查找图书！");
        System.out.println("请输入你要查找图书的名字:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        int currentSize = bookList.getUsedSize();
        for (int i = 0; i < currentSize; i++) {
            Book book = bookList.getPos(i);
            if(book.getName().equals(name)) {
                System.out.println("找到这本书了，信息如下：");
                System.out.println(book);
                return;
            }
        }
        System.out.println("没有这本书！");
    }
}
