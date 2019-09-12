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
/**����ע��
 * join:
 * ��A�߳�ִ�е���b�̵߳� .join()����ʱ��A�ͻ�ȴ�����B�̶߳�ִ����
 * A�Ż�ִ��
 * 
 * join����������ʱ�����߳�ִ��
 */