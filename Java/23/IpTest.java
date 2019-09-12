import java.net.*;/**
 * IpTest
 */
public class IpTest {

    public static void main(String[] args) throws Exception {
        InetAddress[] i = InetAddress.getAllByName("www.baidu.com");
        System.out.println("name    "+i.length);
        for (int x = 0; x < i.length; x++) {
            sop(i[x].getHostAddress());
        }
        for (InetAddress var : i) {
            sop(var.getHostAddress());
        }
    }
    public static void sop(Object obj) {
        System.out.println(obj);
    }
}