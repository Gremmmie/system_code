package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

/**
 * @ Author 12629
 * @ Date 2022/4/10 11:56
 * @ Description：
 */
public class BorrowOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("借阅书籍!");
        System.out.println("请输入要借阅的书籍的id: ");
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();

        for (int i = 0; i < bookList.getUsedSize(); i++) {
            Book book = bookList.getPos(i);
            if (!(id == book.getId())) {
                continue;
            }
            if (book.isBorrowed()) {
                System.out.println("此书已经被借走了!");
                break;
            }
            book.setBorrowed(true);
            System.out.println("借阅成功");
        }
    }
}

