
class Time {
    private int hour;
    private int minute;
    private int second;
    
    public Time() {
        hour = 0;
        minute = 0;
        second = 0;
    }

    public void setTime(int hh, int mm, int ss) {
        hour = ((hh >= 0 && hh <= 24) ? hh : 0);
        minute = ((mm >= 0 && mm <= 60) ? mm : 0);
        second = ((ss >= 0 && ss <= 60) ? ss : 0);
    }

    public String toString() {
        return (hour + ":" + minute + ":" + second );
    }
}
/**
 * TimeTest
 */
public class TimeTest {

    public static void main(String[] args) {
        Time t1= new Time();
        System.out.println("时间"+t1.toString());
        t1.setTime(24, 2, 1);
        System.out.println("时间"+t1);//直接使用t1实际上调用的是其toString()方法

    }
}