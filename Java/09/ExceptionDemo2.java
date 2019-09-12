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

在函数上声明异常 throws <要声明异常>
便于提高安全性，让调用处进行处理，不处理编译失败
对多异常的处理
1.声明异常时，建议声明更为具体的异常，这样处理的可以更为具体
2.对方声明几个异常，就对应有几个catch块，不要定义多余的catch块
		如果多个catch块中的异常出现继承关系，父类异常catch块放最下面

建立在进行catch处理时，catch中一定要定义具体处理方式
不要简单定义一句，e.printStackTrace(),
也不要简单就书写一条输出语句

*/

class Demo
{
	int div(int a,int b)throws ArithmeticException,ArrayIndexOutOfBoundsException //在功能上通过throws的关键字声明了该功能有可能会出现的问题
	{
		int c=a/b;
		int [] arr = new int [a];
		System.out.println(arr[4]);
		return a/b;
	}
}
class ExceptionDemo2
{
	public static void main(String[] args)
	{

		Demo d = new Demo();
		try
		{
			int x = d.div(4,0);
			System.out.println("x="+x);
		}

		catch(Exception e)
		{
			System.out.println("hh"+e.toString());
		}
	
		System.out.println("over");
	}
}
