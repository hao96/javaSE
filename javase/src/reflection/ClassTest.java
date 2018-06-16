package reflection;

/**
 * 一个类 可通过三种方式 得到 Class 对象
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
		
		//3  常用
		Class cs_3 = Class.forName("reflection.Student");
		//true  证明生成了一个class对象
		System.out.println(cs_3 == cs_2);
	}
	
}
