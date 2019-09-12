/**
 * demo
 */
import java.util.*;
public class equalsdemo {

    public static void main(String[] args) {
        ArrayList list = new ArrayList<>();
        ArrayList list2 = new ArrayList<>();
        list.add("java1");
        list.add("java2");
        list.add("java3");
        list.add("java4");

       /* list2.add("java1");
        list2.add("java2");
        list2.add("java3");
        list2.add("java4");
        */
        
        sop(list);
        for(Iterator t=list.iterator();t.hasNext();) {
            sop(t.next());
            
        }
        //sop(list.equals(list2));
    }
    public static void sop(Object obj) {
        System.out.println(obj);
        
    }
}