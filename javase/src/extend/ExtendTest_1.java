package extend;

public class ExtendTest_1 extends Parent{

	/**
	 * ��д    overriding
	 * ������ ����ֵ����  ���� ����ͬ
	 * ����������֮��Ķ�̬��һ�ֱ���
	 */
	public void myName(){
		System.out.println("my name");
	}
	
	/**
	 * ����    overloding
	 * ��������ͬ   ����ֵ���ͣ�������ͬ�� ���� ����ͬ
	 * ���еĶ�̬��һ�ֱ���
	 * @param name
	 */
	public void myName(String name){
		System.out.println("my name is " + name );
	}
	
	public static void main(String[] args) {
		Parent p = new ExtendTest_1();
		ExtendTest_1 e = (ExtendTest_1)p;
		e.myName("young");
	}
}
