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
class ExceptionDemo1
{
	public static void main(String[] args)
	{

		Demo d = new Demo();
		try
		{
			int x = d.div(4,1);
			System.out.println("x="+x);
		}
		catch (Exception e)
		{
			System.out.println(e.toString());
		}
		
		
		System.out.println("over");
	}
}
