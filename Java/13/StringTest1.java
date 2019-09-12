// ?????????
// ”    asdf asd    “
public class StringTest1 {

    public static void main(String[] args) {
        String s = "    asdf asd    ";
        String s1 = myTrim(s);

        new sop(s);
        new sop(s1);
    }

    public static String myTrim(String str) {
        int start, end;
        start = 0;
        end = str.length() - 1;

        while (start <= end && str.charAt(start) == ' ') {
            start++;
        }
        while (start <= end && str.charAt(end) == ' ') {
            end--;
        }
        if (!(start <= end)) {
            return -1 + "";
        } else {
            return str.substring(start, end + 1);
        }

    }
}