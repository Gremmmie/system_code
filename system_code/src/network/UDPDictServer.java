package network;

import java.io.IOException;
import java.net.SocketException;
import java.util.HashMap;
import java.util.Map;

/**
 * 字典服务器/翻译服务器
 * 希望实现一个英译汉的效果
 * 请求是一个英文单词,响应是对应的中文翻译
 */
public class UDPDictServer extends UDPEchoServer{
    private Map<String, String> dict = new HashMap<>();

    public UDPDictServer(int port) throws SocketException {
        super(port);

        /**
         * 这里可以无限地构造下去
         * 即使是有道词典这种,也是按照类似地方法实现(打表)
         */
        dict.put("cat","小猫");
        dict.put("dog","小狗");
    }

    @Override
    public String process(String req) {
        return dict.getOrDefault(req,"这个词俺也不会");
    }

    public static void main(String[] args) throws IOException {
        UDPDictServer server = new UDPDictServer(8000);//8000这个端口相当于被我们占用了
        server.start();//启动服务器
    }
}
