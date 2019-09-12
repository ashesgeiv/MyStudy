/*
java提供了特有的语句进行处理
try
{
	需要被检测的代码；
}
catch(异常类 变量）
{
	处理异常的代码:(处理方式);
}
finally
{
	一定会执行的语句；
}
3.对捕获到的异常对象进行常见方法操作。
	String getMessage();
*/

class Demo
{
	int div(int a,int b)throws Exception //在功能上通过throws的关键字声明了该功能有可能会出现的问题
	{
		return a/b;
	}
}
class ExceptionDemo
{
	public static void main(String[] args)
	{

		Demo d = new Demo();
		try
		{
			int x = d.div(4,0);
		System.out.println("x="+x);
		}
		catch (Exception e)
		{
			System.out.println("除零了");
			System.out.println(e.getMessage());
			System.out.println(e);//异常名称：异常信息
			e.printStackTrace();//异常名称：异常信息，异常出现的位置
			//jvm默认的异常处理机制，就是在调用printStackTrace方法。打印异常在堆栈中的跟踪信息
		}
		
		System.out.println("over");
	}
}
