/*
因为项目中会出现特有的问题
而这些问题并未被java所描述并封装对象
所以对于这些特有的问题可以按照java的对问题封装的思想
将特有的问题，进行自定义的异常封装

自定义异常

需求：在本程序中，对于除数为负数，也视为是错误的是无法进行运算的

当在函数内部出现了throw抛出异常对象，那么就必须给出对应的处理动作
要么通过try catch处理
要么在函数上声明让调用者处理 [viod Hanshu () throws (对应)Exception]

一般情况在函数内出现异常，函数上需要声明


发现打印的结果中只有异常的名称，却没有异常的信息
因为自定义的异常并未定义信息

如何定义异常信息呢
因为父类中已经把异常信息的操作都完成了
所以子类只要在构造时，把异常信息传递给父类通过super语句
那么就可以直接通过getMessage方法获取自定义的异常信息


自定义异常
必须是自定义类继承Exception

继承Exception原因
异常体系有一个特点：因为异常类和异常对象都被抛出
他们都具备可抛性。这个可抛性是Throwable这个体系独有特点

只有这个体系中的类和对象才可以被throw和throws操作

throw使用在函数内
throws使用在函数上

throws后面跟的是异常类。可以跟多个。用逗号隔开
throw后跟的是异常对象
*/
class FuShuException extends Exception
{
	private int value;
	FuShuException(String msg,int value)
	{
		super(msg);
		this.value = value;

	}
	public int getValue()
	{
		return value;
	}

}

class Demo
{
	int div(int a,int b) throws FuShuException//在功能上通过throws的关键字声明了该功能有可能会出现的问题
	{
		if(b<0)
			throw new FuShuException("By fushu",b);//手动通过throw关键字抛出异常对象

		return a/b;
	}
}
class ExceptionDemo3
{
	public static void main(String[] args)
	{

		Demo d = new Demo();
		
		try 
		{
			int x = d.div(1,-1);
			System.out.println("x="+x);
		}
		catch (FuShuException e)
		{
			System.out.println(e.toString());
			System.out.println("错误的负数时"+e.getValue());
		}
		System.out.println("over");
	}
}
