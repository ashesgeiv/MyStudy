
import java.util.concurrent.locks.*;

class Res {
	private String name;
	private String sex;
	private boolean flag = false;
	private Lock lock = new ReentrantLock();
	private Condition out = lock.newCondition();
	private Condition in = lock.newCondition();

	public void out() throws InterruptedException {
		lock.lock();
		try {
			while (!flag) {
				try {
					out.await();
				} catch (Exception e) {
				}
			}
			System.out.println(name + "...." + sex);
			flag = false;
			in.signal();
		} finally {
			lock.unlock();
		}

	}

	public void set(String name, String sex) throws InterruptedException {
		lock.lock();
		try {
			while (flag) {
				try {
					in.await();
				} catch (Exception e) {
				}
			}
			this.name = name;
			this.sex = sex;
			flag = true;
			out.signal();
		} finally {
			lock.unlock();
		}

	}
}

class Input implements Runnable {
	private int x = 0;
	private Res r;

	Input(Res r) {
		this.r = r;
	}

	public void run() {
		while (true) {
			if (x == 0) {
				try {
					r.set("玄1�7", "wome");
				} catch (Exception e) {
				}
			} else {
				try {
					r.set("wang", "das");
				} catch (Exception e) {
				}
			}
			x = (x + 1) % 2;
		}
	}
}

class Output implements Runnable {
	private Res r;

	Output(Res r) {
		this.r = r;
	}

	public void run() {
		while (true) {
			try {
				r.out();
			} catch (Exception e) {
			}

		}
	}
}

class InputOutputDemo {
	public static void main(String[] args) {
		Res r = new Res();

		new Thread(new Input(r)).start();
		new Thread(new Output(r)).start();

		/*
		 * Input In = new Input(r); Output Out = new Output(r);
		 * 
		 * Thread t1 = new Thread(In); Thread t2 = new Thread(Out);
		 * 
		 * t1.start(); t2.start();
		 */
		
	}
}

/*
 * wait(); notify(); notifyAll();
 * 
 * ��ʹ����ͬ���У���ΪҪ�Գ��м��������������̲߳���/ ����Ҫʹ����ͬ���У���Ϊֻ��ͬ���ž�����
 * 
 * Ϊʲô��Щ�����̵߳ķ���Ҫ������Object�����أ�
 * ��Ϊ��Щ�����ڲ���ͬ���е��߳�ʱ��������Ҫ��ʶ�����������̳߳��е���
 * ֻ��ͬһ�����ϵı��ȴ��̣߳����Ա�ͬһ������notify���� �����ԶԲ�ͬ���е��߳̽��л���
 * 
 * Ҳ����˵���ȴ��ͻ��ѱ�����ͬһ����
 * ��������������������Կ��Ա����������õķ���������Object����
 */
