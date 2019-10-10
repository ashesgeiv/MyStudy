import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
  public static void main(String[] args) {
    List<>
    Map<String, String> map = new HashMap<>();
    map.put("you", "aaaa","mark up");
    map.put("HTML", "mark up");
    map.put("Oracle", "database");
    map.put("XML", "data");

    // Get  the   set of  keys
    Set<String> keys  = map.keySet();

    // Print all keys  using the   forEach()  method.
    keys.forEach(System.out::println);
  }
}