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
*/

class Demo
{
	int div(int a,int b)throws Exception //�ڹ�����ͨ��throws�Ĺؼ��������˸ù����п��ܻ���ֵ�����
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
