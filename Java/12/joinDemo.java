import com.sun.jdi.InternalException;

class Jdemo implements Runnable {
    public void run() {
        for (int i = 0; i < 70; i++) {
            System.out.println(Thread.currentThread().getName() + "......." + i);
        }
    }

}

public class joinDemo {
    public static void main(String[] args) throws InterruptedException {
        Jdemo d = new Jdemo();

        Thread t1 = new Thread(d);
        Thread t2 = new Thread(d);
        
        t1.start();
        
        t2.start();
        t1.join();
        for (int i = 0; i < 80; i++) {
            System.out.println(Thread.currentThread().getName() + "......." + i);
        }
    }
}
/**中文注释
 * join:
 * 当A线程执行到了b线程的 .join()方法时，A就会等待，等B线程都执行完
 * A才会执行
 * 
 * join可以用来临时加入线程执行
 */