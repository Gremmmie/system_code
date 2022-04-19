package operation;
import book.Book;
import book.BookList;
/**
 * Created with IntelliJ IDEA.
 * Description: Hello,I would appreciate your comments~
 * User:
 * Date: -04-12
 * Destination: 删除书籍
 */
import java.util.Scanner;

public class DelOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("删除书籍!");
        System.out.println("请输入您想要删除书籍的id: ");
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();
        int i = 0;
        for (; i < bookList.getUsedSize(); i++) {
            Book book = bookList.getPos(i);
            if (book.getId()==id) {
                break;
            }
        }
        if (i >= bookList.getUsedSize()) {
            System.out.println("未找到要找的书籍!");
            return;
        }

        Book lastBook = bookList.getPos(bookList.getUsedSize() - 1);
        bookList.setBooks(i, lastBook);
        bookList.setUsedSize(bookList.getUsedSize() - 1);
        System.out.println("删除成功!");
    }
}

