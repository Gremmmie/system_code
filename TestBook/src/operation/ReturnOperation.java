package operation;
import book.BookList;
/**
 * Created with IntelliJ IDEA.
 * Description: Hello,I would appreciate your comments~
 * User:
 * Date: -04-12
 * Destination:
 */
public class ReturnOperation implements IOPeration{

    public void work(BookList bookList) {
        System.out.println("归还图书！");
    }

}