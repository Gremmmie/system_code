package operation;

import book.Book;
import book.BookList;

/**
 * @Author 12629
 * @Date 2022/4/10 11:57
 * @Description：
 */
public class ExitOperation implements IOPeration{

    public void work(BookList bookList) {

        //有可能  需要销毁，或者使用到 这个数组当中的所有的数据
        System.out.println("退出系统！");
        /*int currentSize = bookList.getUsedSize();
        for (int i = 0; i < currentSize; i++) {
            bookList.setBooks(i,null);
        }*/
        System.exit(0);
    }

}
