/*
�쳣���Ӹ��า���е�����
1�������ڸ��Ǹ���ʱ���������ķ����׳��쳣����ô����ĸ��Ƿ�����ֻ���׳�������쳣���߸��쳣������
2,������෽���׳�����쳣����ô�����ڸ��Ǹ÷���ʱ��ֻ���׳������쳣���Ӽ�
3�����������߽ӿڵķ�����û���쳣�׳�����ô�����ڸ��Ƿ���ʱ��Ҳ�������׳��쳣
	������෽���������쳣���ͱ������try�������Բ�����
*/
class AException extends Exception
{

}
class BException extends AException
{
}

class fu
{
	void show()throws AException
	{

	}
}
class zi extends fu
{

}
class ExceptionDemo7 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
