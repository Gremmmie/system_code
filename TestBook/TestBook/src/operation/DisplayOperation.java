package operation;

import book.Book;
import book.BookList;

/**
 * @Author 12629
 * @Date 2022/4/10 11:57
 * @Description：
 */
public class DisplayOperation implements IOPeration{
    public void work(BookList bookList) {
        System.out.println("显示图书！");

        int currentSize = bookList.getUsedSize();

        for (int i = 0; i < currentSize; i++) {
            Book book = bookList.getPos(i);
            System.out.println(book);
        }
    }
}
