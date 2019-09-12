/**
 * 将字符串进行反转
 * "abcdefg"
 */
public class StringTest2 {

    public static void main(String[] args) {
        String s1 = "abcdefg";
        String s2 = trunUpString(s1, 3, 6);

        new sop(s1);
        new sop(s2);

    }

    public static String trunUpString(String str, int x, int y) {
        char[] str1 = str.toCharArray();

        turnUp(str1, x, y);

        return new String(str1);
    }

    public static String trunUpString(String str) {
        return trunUpString(str, 0, str.length());
    }

    public static void turnUp(char[] arr, int x, int y) {
        for (int start = x, end = y - 1; start < end; start++, end--) {
            sWap(arr, start, end);
        }
    }

    public static void sWap(char[] arr, int start, int end) {
        char temp;
        temp = arr[end];
        arr[end] = arr[start];
        arr[start] = temp;
    }
}