/*
��Ϊ��Ŀ�л�������е�����
����Щ���Ⲣδ��java����������װ����
���Զ�����Щ���е�������԰���java�Ķ������װ��˼��
�����е����⣬�����Զ�����쳣��װ

�Զ����쳣

�����ڱ������У����ڳ���Ϊ������Ҳ��Ϊ�Ǵ�������޷����������

���ں����ڲ�������throw�׳��쳣������ô�ͱ��������Ӧ�Ĵ�����
Ҫôͨ��try catch����
Ҫô�ں����������õ����ߴ��� [viod Hanshu () throws (��Ӧ)Exception]

һ������ں����ڳ����쳣����������Ҫ����


���ִ�ӡ�Ľ����ֻ���쳣�����ƣ�ȴû���쳣����Ϣ
��Ϊ�Զ�����쳣��δ������Ϣ

��ζ����쳣��Ϣ��
��Ϊ�������Ѿ����쳣��Ϣ�Ĳ����������
��������ֻҪ�ڹ���ʱ�����쳣��Ϣ���ݸ�����ͨ��super���
��ô�Ϳ���ֱ��ͨ��getMessage������ȡ�Զ�����쳣��Ϣ


�Զ����쳣
�������Զ�����̳�Exception

�̳�Exceptionԭ��
�쳣��ϵ��һ���ص㣺��Ϊ�쳣����쳣���󶼱��׳�
���Ƕ��߱������ԡ������������Throwable�����ϵ�����ص�

ֻ�������ϵ�е���Ͷ���ſ��Ա�throw��throws����

throwʹ���ں�����
throwsʹ���ں�����

throws����������쳣�ࡣ���Ը�������ö��Ÿ���
throw��������쳣����
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
	int div(int a,int b) throws FuShuException//�ڹ�����ͨ��throws�Ĺؼ��������˸ù����п��ܻ���ֵ�����
	{
		if(b<0)
			throw new FuShuException("By fushu",b);//�ֶ�ͨ��throw�ؼ����׳��쳣����

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
			System.out.println("����ĸ���ʱ"+e.getValue());
		}
		System.out.println("over");
	}
}
