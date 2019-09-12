import java.net.*;

/**
 * Upsend
 */
public class Upsend {

    public static void main(String[] args) throws Exception {
        // 建立UDP服务。通过DatagramSocket对象建立发送端
        DatagramSocket dS = new DatagramSocket(2222);

        // 确定数据，并封装成数据包 DatagramPacket(byte[] buf, int length, InetAddress address, int
        // port）
        byte[] buf = "首次使用UDP".getBytes();
        // 通过socket服务将数据报包发出去 用send方法
        DatagramPacket dPacket = new DatagramPacket(buf, buf.length, InetAddress.getByName("127.0.0.1"), 10000);
        dS.send(dPacket);
        // 关闭资源
        dS.close();
    }
}