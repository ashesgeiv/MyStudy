import java.util.*;

/**
 * LinkListTest
 */
/**
 * DuiLie
 */
class DuiLie {
    private LinkedList link;

    DuiLie() {
        link =new LinkedList<>();
    }

    public void MyAdd(Object obj) {
        link.addFirst(obj);
    }

    public Object myGet() {
        return link.removeLast();
    }
    public static void isNull() {
        return link.isEmply();

    }
}

public class LinkListTest {

    public static void main(String[] args) {
        DuiLie D = new DuiLie();
        D.MyAdd("java01");
        D.MyAdd("java02");
        D.MyAdd("java03");
        D.MyAdd("java04");

        sop(D.myGet());

    }
    public static void sop(Object obj) {
        System.out.println(obj);
    }
}