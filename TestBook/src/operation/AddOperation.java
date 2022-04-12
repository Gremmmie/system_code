package operation;
import book.BookList;

/**
 * @ Author 12629
 * @ Date 2022/4/10 11:54
 * @ Description：
 */
public class AddOperation implements IOPeration{

    @Override
    public void work(BookList bookList) {
        System.out.println("新增图书！");
    }

}