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
			System.out.println("������");
			System.out.println(e.getMessage());
			System.out.println(e);//�쳣���ƣ��쳣��Ϣ
			e.printStackTrace();//�쳣���ƣ��쳣��Ϣ���쳣���ֵ�λ��
			//jvmĬ�ϵ��쳣������ƣ������ڵ���printStackTrace��������ӡ�쳣�ڶ�ջ�еĸ�����Ϣ
		}
		
		System.out.println("over");
	}
}
