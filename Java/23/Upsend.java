import java.net.*;

/**
 * Upsend
 */
public class Upsend {

    public static void main(String[] args) throws Exception {
        // ����UDP����ͨ��DatagramSocket���������Ͷ�
        DatagramSocket dS = new DatagramSocket(2222);

        // ȷ�����ݣ�����װ�����ݰ� DatagramPacket(byte[] buf, int length, InetAddress address, int
        // port��
        byte[] buf = "�״�ʹ��UDP".getBytes();
        // ͨ��socket�������ݱ�������ȥ ��send����
        DatagramPacket dPacket = new DatagramPacket(buf, buf.length, InetAddress.getByName("127.0.0.1"), 10000);
        dS.send(dPacket);
        // �ر���Դ
        dS.close();
    }
}