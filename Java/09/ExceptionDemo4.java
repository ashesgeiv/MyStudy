/*
Exception����һ������������쳣RuntimeException <=>����ʱ�쳣

����ں��������׳����쳣�������Ͽ��Բ�������������һ��ͨ��

����ں����������˸��쳣�������߿��Բ��ý��д�������һ��ͨ����

֮���Բ����ں�������������Ϊ����Ҫ�õ����ߴ���
�����쳣������ϣ������ֹͣ����Ϊ������ʱ����ϯ�����޷���������������ϣ��ֹͣ�����Դ����������

�Զ����쳣ʱ��������쳣�ķ������޷��ټ���������������Զ����쳣�̳�RuntimeException

�����쳣������
1������ʱ�������쳣
��Ҫ�ں����ϼ�����������

2������ʱ���������쳣������ʱ�쳣��RuntimeException�Լ������ࣩ
����Ҫ�ں���������
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
			throw new FushuException("����������");
		}
		if (b == 0)
		{
			throw new ArithmeticException("�������");
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
