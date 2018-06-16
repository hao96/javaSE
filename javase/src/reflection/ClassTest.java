package reflection;

/**
 * һ���� ��ͨ�����ַ�ʽ �õ� Class ����
 * @author hao
 *
 */
public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException {
		//1
		Student stu = new Student();
		Class cs = stu.getClass();
		System.out.println(cs.getName());
		
		//2
		Class cs_2 = Student.class;
		//true
		System.out.println(cs == cs_2);
		
		//3  ����
		Class cs_3 = Class.forName("reflection.Student");
		//true  ֤��������һ��class����
		System.out.println(cs_3 == cs_2);
	}
	
}
