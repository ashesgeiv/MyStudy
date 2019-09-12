class Demo extends Thread
{
	
	Demo(String name)
	{
		super(name);
	}
	public void run ()
	{
		for (int x =0;x<40 ;x++ )
		{
			System.out.println(this.getName()+" run ----"+x);
		}
	}
}
class Bank
{
	private int sum;
	public synchronized void add (int x)
	{
		sum=sum+x;
		System.out.println("sum="+sum);
	}
}
class Cus implements Runnable
{
	private Bank b = new Bank();
	public void run()
	{
		for (int x = 0 ;x <3 ;x++ )
		{
			b.add(100);
		}
	}
}
class ThreadTest
{
	public static void main(String [] args)
	{
		Cus c = new Cus();

		Thread t1 = new Thread(c);
		Thread t2 = new Thread(c);
		t1.start();
		t2.start();
	}
}