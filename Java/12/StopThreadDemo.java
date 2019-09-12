import java.util.concurrent.locks.*;

class StopThread implements Runnable {
    boolean flag = true;

    public void chang() {
        flag = false;
    }

    public synchronized void run() {
        while (flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + "....Exception");
                this.chang();
            }
            System.out.println(Thread.currentThread().getName() + "....run");
        }
    }
}

class StopThreadDemo {
    public static void main(String[] args) {
        StopThread s = new StopThread();

        Thread t1 = new Thread(s);
        Thread t2 = new Thread(s);

        t1.start();
        t2.start();
        int num = 0;
        while (true) {
            if (num++ == 60) {
                // s.chang();
                t1.interrupt();
                t2.interrupt();
                break;
            }
            System.out.println(Thread.currentThread().getName() + "..." + num);
        }
    }
}