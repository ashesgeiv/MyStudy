/*
��ʦ�õ����Ͽ�
����������
��������
����ð��
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
