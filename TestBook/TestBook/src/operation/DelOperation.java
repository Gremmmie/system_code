package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

/**
 * @Author 12629
 * @Date 2022/4/10 11:56
 * @Description：
 */
public class DelOperation implements IOPeration{

    public void work(BookList bookList) {
        System.out.println("删除图书！");

        System.out.println("请输入你要删除图书的名字:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        int index = 0;
        int currentSize = bookList.getUsedSize();
        int i = 0;
        for (; i < currentSize; i++) {
            Book book = bookList.getPos(i);
            if(book.getName().equals(name)) {
                index = i;
                break;
            }
        }
        //1、遇到了break  2、没有找到 结束了for循环
        if(i == currentSize) {
            System.out.println("没有你要删除的图书！");
            return;
        }

        for (int j = index; j < currentSize-1; j++) {
            //bookList[j] = bookList[j+1];
            Book book = bookList.getPos(j+1);

            bookList.setBooks(j,book);
        }

        bookList.setBooks(currentSize-1,null);

        bookList.setUsedSize(currentSize-1);

        System.out.println("删除结束");

    }
}
