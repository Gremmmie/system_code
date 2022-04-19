package operation;
import book.BookList;
import book.Book;
import java.util.Scanner;
/**
 * Created with IntelliJ IDEA.
 * Description: Hello,I would appreciate your comments~
 * User:
 * Date: -04-12
 * Destination:还书
 */
public class ReturnOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("归还书籍!");
        System.out.println("请输入要归还书籍的id: ");
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();
        int i = 0;
        for ( ; i < bookList.getUsedSize(); i++) {
            Book book = bookList.getPos(i);
            if (book.getId()!=id) {
                continue;
            }
            if (!book.isBorrowed()) {
                System.out.println("这本书未借出去,归还失败!");
            }
            book.setBorrowed(false);
        }
    }
}

