interface Shape
{
	void getArea();
}

class NoValueException extends RuntimeException
{
	NoValueException(String msg)
	{
		super(msg);
	}
}

class Res implements Shape
{
	private int len,wid;

	Res(int len,int wid)
	{
		if(len<=0||wid<=0)
			throw new NoValueException("ÔËËã´íÎó");
		this.len=len;
		this.wid=wid;
	}

	public void getArea()
	{
		System.out.println(len*wid);
	}
}

class  ExceptionTest1
{
	public static void main(String[] args) 
	{
		
			Res r = new Res(-3,4);
			r.getArea();
		
		
		System.out.println("over");
	}
}
