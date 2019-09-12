/*
老师用电脑上课
出现了问题
电脑蓝屏
电脑冒烟
*/

class BlueException extends Exception
{
	BlueException(String msg)
	{
		super(msg);
	
	}
}

class MaoYanException
{
	super
}
class Computer
{
	public void run()
	{
		System.out.println("running");
	}
	public void reset()
	{
		System.out.println("finish");
	}
}
class Teacher
{
	private String name;
	private Computer cmp;

	Teacher(String name)
	{
		this.name=name;
		cmp = new Computer();
	}

	public void teach()
	{
		cmp.run();

		System.out.println("teaching");
	}
}



class ExceptionTest 
{
	public static void main(String[] args) 
	{
		Teacher t = new Teacher("teacher");
		t.teach();
	}
}
