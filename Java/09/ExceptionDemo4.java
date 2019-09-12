/*
Exception中有一个特殊的子类异常RuntimeException <=>运行时异常

如果在函数内容抛出该异常，函数上可以不用声明，编译一样通过

如果在函数上声明了该异常，调用者可以不用进行处理，编译一样通过。

之所以不用在函数声明，是因为不需要让调用者处理。
当该异常发生，希望程序停止。因为在运行时，出席拿了无法继续运算的情况，希望停止程序后对代码进行修正

自定义异常时：如果该异常的发生，无法再继续进行运算就让自定义异常继承RuntimeException

对于异常分两种
1，编译时被检测的异常
需要在函数上及函数内声明

2，编译时不被检测的异常（运行时异常，RuntimeException以及其子类）
不需要在函数上声明
*/
class FushuException extends RuntimeException
{
	FushuException(String msg)
	{
		super(msg);
	}
}
class Demo
{
	int div(int a,int b)
	{
		if (b<0)
		{
			throw new FushuException("被负数除了");
		}
		if (b == 0)
		{
			throw new ArithmeticException("被零除了");
		}
		return a/b;
	}
}

class ExceptionDemo4 
{
	public static void main(String[] args) 
	{
		Demo d = new Demo();

		int x = d.div(4,-5);
		System.out.println("x="+x);

		System.out.println("over");
	}
}
