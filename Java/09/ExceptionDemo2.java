/*
java�ṩ�����е������д���
try
{
	��Ҫ�����Ĵ��룻
}
catch(�쳣�� ������
{
	�����쳣�Ĵ���:(����ʽ);
}
finally
{
	һ����ִ�е���䣻
}
3.�Բ��񵽵��쳣������г�������������
	String getMessage();

�ں����������쳣 throws <Ҫ�����쳣>
������߰�ȫ�ԣ��õ��ô����д������������ʧ��
�Զ��쳣�Ĵ���
1.�����쳣ʱ������������Ϊ������쳣����������Ŀ��Ը�Ϊ����
2.�Է����������쳣���Ͷ�Ӧ�м���catch�飬��Ҫ��������catch��
		������catch���е��쳣���ּ̳й�ϵ�������쳣catch���������

�����ڽ���catch����ʱ��catch��һ��Ҫ������崦��ʽ
��Ҫ�򵥶���һ�䣬e.printStackTrace(),
Ҳ��Ҫ�򵥾���дһ��������

*/

class Demo
{
	int div(int a,int b)throws ArithmeticException,ArrayIndexOutOfBoundsException //�ڹ�����ͨ��throws�Ĺؼ��������˸ù����п��ܻ���ֵ�����
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
