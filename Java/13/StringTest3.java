/**
 * 获取一个字符在另一个字符串中出现的次数 “ffadgadfsdafdfdsfxa"
 */
public class StringTest3 {

    public static void main(String[] args) {
        String s = "ffadgadfsdafdfdsfxa";
        new sop("count"+getCount(s, "f"));
    }

    public static int getCount(String str, String key) {
        int count = 0, index = 0;

        while ((index = str.indexOf(key, index)) != -1) {
            new sop("index" + index);
            index = index + key.length();
            count++;
        }
        return count;
    }
}