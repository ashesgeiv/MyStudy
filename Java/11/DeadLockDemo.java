class Test implements Runnable {

    private boolean flag;
	Test(boolean flag) {

		this.flag = flag;

	}

	public void run() {
		if (flag) {
			while (true) {
				synchronized(Mylock.lockA) {
					System.out.println("if LockA");
					synchronized(Mylock.lockB) {
						System.out.println("if LockB");
					}
				}
			}
		} else {
			while (true) {
				synchronized(Mylock.lockB) {
					System.out.println("else LockB");
					synchronized(Mylock.lockA) {
						System.out.println("else LockA");
					}
				}
			}
		}
	}

}

class Mylock {
	static Object lockA = new Object();
	static Object lockB = new Object();
}

class DeadLockDemo {

	public static void main(String[] args) {

		Thread t1 = new Thread(new Test(false));
		Thread t2 = new Thread(new Test(true));
		t1.start();
		t2.start();
	
	}

}
