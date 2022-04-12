package operation;

import book.BookList;

/**
 * @ Author 12629
 * @ Date 2022/4/10 11:56
 * @ Description：
 */
public class BorrowOperation implements IOPeration {

    public void work(BookList bookList) {
        System.out.println("借阅图书！");
    }

}