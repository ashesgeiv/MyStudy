/**
 * 获取两个字符串中最大相同子串 "vasfdfgfadsfdssddhallogdafsdvga" "dsafasdfhalloafdafs"
 */
public class StringTest4 {

    public static void main(String[] args) {

    }

    public static String getMaxString(String s1, String s2) {

        String max = "", min = "";

        max = (s1.length() <= s2.length()) ? s2 : s1;
        min = (max == s1) ? s2 : s1;

        for (int x = 0; x < min.length(); x++) {
            for (int y = 0, z = min.length() - x; y != z; y++, z++) {

            }
        }
    }
}