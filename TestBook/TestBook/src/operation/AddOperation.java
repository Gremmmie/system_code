package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

/**
 * @Author 12629
 * @Date 2022/4/10 11:54
 * @Description：
 */
public class AddOperation implements IOPeration{

    @Override
    public void work(BookList bookList) {
        System.out.println("新增图书！");
        System.out.println("请输入图书的名字:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("请输入图书的作者:");
        String author = scanner.nextLine();
        System.out.println("请输入图书的类型:");
        String type = scanner.nextLine();
        System.out.println("请输入图书的价格:");
        int price = scanner.nextInt();

        Book book = new Book(name,author,price,type);

        int currentSize = bookList.getUsedSize();
        bookList.setBooks(currentSize,book);

        bookList.setUsedSize(currentSize+1);

        System.out.println("新增成功！");

    }

}
