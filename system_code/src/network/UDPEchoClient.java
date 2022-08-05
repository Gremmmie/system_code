package network;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class UDPEchoClient {
    private DatagramSocket socket = null;

    public UDPEchoClient()throws SocketException {
        //客户端的端口号,一般都是由操作系统自动分配的,虽然手动指定也行,但还是自动分配比较好
        //如果是服务器的端口号一般是指定的,客户端的端口号一般是自动分配的
        //如果服务器自动分配,客户端就不知道服务器的端口是啥了.
        //因此,服务器有固定的端口,客户端才方便访问
        //客户端程序是安装在用户的电脑上的,用户电脑当前运行哪些程序是不可控的
        //如果要是手动指定端口,说不好这个端口就和其他程序的端口冲突了
        //就导致我们的代码无法运行了.
        socket = new DatagramSocket();
    }

    public void start() throws IOException {
        Scanner scanner = new Scanner(System.in);
        while (true){
            //1.让客户端从控制台读取一个请求数据
            System.out.print("> ");
            String request = scanner.next();
            //2.把这个字符串请求发送给服务器,构造DatagramPacket
            //  我们构造的Packet既要包含要传输的数据,又要包含把数据发到哪里
            DatagramPacket requestPacket = new DatagramPacket(request.getBytes(),
                    request.getBytes().length,
                    InetAddress.getByName("127.0.0.1"),8000);
            //3.把数据包发给服务器
            socket.send(requestPacket);
            //4.我们要从服务器中读取响应数据
            //  因为服务器收到数据后会发出响应
            DatagramPacket responsePacket = new DatagramPacket(new byte[4096],4096);
            socket.receive(responsePacket);
            //5.我们再把响应的数据获取出来,转成字符串
            String response = new String(responsePacket
                    .getData(),0,responsePacket.getLength());

            System.out.printf("req: %s;resp: %s\n",request,response);
        }
    }

    public static void main(String[] args) throws IOException {
        UDPEchoClient client = new UDPEchoClient();
        client.start();
    }
}
