
/**
 * ListDemo
 */
import java.util.*;

public class ListDemo {

    public static void main(String[] args) {
        ArrayList list = new ArrayList<>();
        ArrayList list2 = new ArrayList<>();

        list2.add("event0");
        list2.add("event1");
        list2.add("event2");
        list2.add("event3");

        list.add("start");
        list.add("java02");
        list.add("java01");
        list.add("java02");
        list.add("end");

        sop(list);
        // 增
        // list.add(2,"java000" );
        // list.addAll(2, list2);

        // 删
        // list.remove(2);

        // 改
        // list.set(2, 5);

        // 查
        // sop(list.get(2));
        // sop(list.subList(2, 4));
        // sop(list.indexOf("java02"));
        // sop(list.lastIndexOf("java02"));

        // 迭代器
        ListIterator l = list.listIterator();
        while (l.hasNext()) {
            sop(l.next());
        }
        while (l.hasPrevious()) {
            sop(l.previous());
        }
         sop(list);
    }

    public static void sop(Object obj) {
        System.out.println(obj);
    }
}