
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
					r.set("鐜�", "wome");
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
 * 锟斤拷使锟斤拷锟斤拷同锟斤拷锟叫ｏ拷锟斤拷为要锟皆筹拷锟叫硷拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟竭程诧拷锟斤拷/ 锟斤拷锟斤拷要使锟斤拷锟斤拷同锟斤拷锟叫ｏ拷锟斤拷为只锟斤拷同锟斤拷锟脚撅拷锟斤拷锟斤拷
 * 
 * 为什么锟斤拷些锟斤拷锟斤拷锟竭程的凤拷锟斤拷要锟斤拷锟斤拷锟斤拷Object锟斤拷锟斤拷锟截ｏ拷
 * 锟斤拷为锟斤拷些锟斤拷锟斤拷锟节诧拷锟斤拷同锟斤拷锟叫碉拷锟竭筹拷时锟斤拷锟斤拷锟斤拷锟斤拷要锟斤拷识锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟竭程筹拷锟叫碉拷锟斤拷
 * 只锟斤拷同一锟斤拷锟斤拷锟较的憋拷锟饺达拷锟竭程ｏ拷锟斤拷锟皆憋拷同一锟斤拷锟斤拷锟斤拷notify锟斤拷锟斤拷 锟斤拷锟斤拷锟皆对诧拷同锟斤拷锟叫碉拷锟竭程斤拷锟叫伙拷锟斤拷
 * 
 * 也锟斤拷锟斤拷说锟斤拷锟饺达拷锟酵伙拷锟窖憋拷锟斤拷锟斤拷同一锟斤拷锟斤拷
 * 锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷钥锟斤拷员锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷玫姆锟斤拷锟斤拷锟斤拷锟斤拷锟絆bject锟斤拷锟斤拷
 */
