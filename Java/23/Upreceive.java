import java.net.*;

/**
 * Upreceive
 */
public class Upreceive {

    public static void main(String[] args) throws Exception {
        // 建立UDP服务建立接受端
        var dSocket = new DatagramSocket(10000);
        // 建立数据包以接受数据 用receive方法

        var buf = new byte[1024];
        var dPacket = new DatagramPacket(buf, buf.length);

        dSocket.receive(dPacket);
        // 用数据包的方法获取数据
        var ip = dPacket.getAddress().getHostAddress();
        var data = new String(dPacket.getData(), 0, dPacket.getLength());
        var ipont = dPacket.getPort();

        System.out.println("ip--" + ip + "--data--" + data + "port" + ipont);
        dSocket.close();

    }
}