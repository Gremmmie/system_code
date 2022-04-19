package operation;

import book.Book;
import book.BookList;

/**
 * Created with IntelliJ IDEA.
 * Description: Hello,I would appreciate your comments~
 * User:
 * Date: -04-12
 * Destination: 查看所有图书
 */
public class DisplayOperation implements IOperation {
    public void work(BookList bookList) {
        System.out.println("显示图书！");

        int currentSize = bookList.getUsedSize();

        for (int i = 0; i < currentSize; i++) {
            Book book = bookList.getPos(i);
            System.out.println(book);
        }
    }
}