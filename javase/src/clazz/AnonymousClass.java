package clazz;

/**
 * ������
 * @author hao
 *
 */
public class AnonymousClass {
	
	//�����˽�г�Ա����
	//private String str_ = "hao";
	public String str_;
	
	//���๹�캯��
	public AnonymousClass(String str){
		str_=str;
	}
	
	public void show(){
		System.out.println(str_);
	}
	
	public static void myname(){
		System.out.println("young");
	}
 
	public static void main(String[] args) {
		
		//���ø��๹�캯��
		AnonymousClass ac = new AnonymousClass("word"){
			/**
			 * ���Կ���������ڲ���
			 * �������в������о�̬��������Ա
			 */
			//static String test = "hh";  ����
			
			//���Լ̳С���д�����еķ���
			public void show(){
				System.out.println("hello");
			}
		};
		
		//���Ե��ø��෽��  ����̬ �Ǿ�̬ ��
		ac.show();
		ac.myname();
		//���ø����Ա����
		System.out.println(ac.str_);	
	}
}
