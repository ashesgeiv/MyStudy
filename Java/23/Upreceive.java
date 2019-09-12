import java.net.*;

/**
 * Upreceive
 */
public class Upreceive {

    public static void main(String[] args) throws Exception {
        // ����UDP���������ܶ�
        var dSocket = new DatagramSocket(10000);
        // �������ݰ��Խ������� ��receive����

        var buf = new byte[1024];
        var dPacket = new DatagramPacket(buf, buf.length);

        dSocket.receive(dPacket);
        // �����ݰ��ķ�����ȡ����
        var ip = dPacket.getAddress().getHostAddress();
        var data = new String(dPacket.getData(), 0, dPacket.getLength());
        var ipont = dPacket.getPort();

        System.out.println("ip--" + ip + "--data--" + data + "port" + ipont);
        dSocket.close();

    }
}