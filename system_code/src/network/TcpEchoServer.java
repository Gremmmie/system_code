package network;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TcpEchoServer {
    private ServerSocket serverSocket = null;

    public TcpEchoServer(int port) throws IOException {
        serverSocket = new ServerSocket(port);
    }

    public void start() throws IOException {
        System.out.println("服务器启动!");
        while (true){
            //如果当前没有客户端来建立连接,就会阻塞等待!!
            Socket clientSocket = serverSocket.accept();
            processConnect(clientSocket);
        }
    }

    /**
     * 通过这个方法,给当前连上的这个客户端,提供服务!!
     * 一个连接过来了,服务方式可能有两种:
     * 1.一个连接只进行一次数据交互(一个请求+一个响应)短连接 一次交互
     * 2.一个连接进行多次数据交互(N个请求+N个响应)长连接 多次交互
     * 这里我们来写长连接的版本
     * @param clientSocket
     */
    public void processConnect(Socket clientSocket) throws IOException {
        System.out.printf("[%s:%d] 建立连接!\n",clientSocket.getInetAddress().toString(),
                clientSocket.getPort());
        try(InputStream inputStream = clientSocket.getInputStream();//接收数据
        OutputStream outputStream = clientSocket.getOutputStream();){//发送数据
            Scanner scanner = new Scanner(inputStream);
            PrintWriter printWriter = new PrintWriter(outputStream);

            //这里是长连接的写法,需要通过循环来获取到多次交互情况
            while (true){
                //如果阻塞大概率阻塞在这里
                if (!scanner.hasNext()){
                    //连接断开,当客户端断开连接的时候,此时hasNext就会返回false
                    break;
                }
                //1.读取请求并解析
                String request = scanner.next();
                //2.根据请求计算响应
                String response = process(request);
                //3.把响应写回客户端
                printWriter.println(response);
                //4.刷新一下缓冲区,避免数据没有真的发出去
                printWriter.flush();
                System.out.printf("[%s:%d] request: %s; response: %s\n",clientSocket.getInetAddress().toString(),
                        clientSocket.getPort(),request,response);
            }
        }
    }

    public String process(String req){
        return req;
    }

    public static void main(String[] args) throws IOException {
        TcpEchoServer server = new TcpEchoServer(8000);
        server.start();
    }
}
