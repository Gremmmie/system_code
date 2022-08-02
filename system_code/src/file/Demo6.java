package file;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Demo6 {
    public static void main (String[] args) throws IOException {
        //使用一下InputStream

        //1. 打开文件
        InputStream inputStream = new FileInputStream("test2.txt");
        //2.读取文件
//        while (true){
//            int b = inputStream.read();
//            if (b == -1){
//                //文件读完了
//                break;
//            }
//            System.out.println(b);
//        }
        byte[] b = new byte[1024];
        int len = inputStream.read(b);
        System.out.println(len);
        for (int i =0;i<len;i++){
            System.out.println(b[i]);
        }
        //3.关闭文件
        inputStream.close();
    }
}
