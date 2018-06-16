package reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * ��ȡ��Ա����������
 * 
 * ��ȡ��Ա����������
 * @author hao
 *
 */
public class ClassTets_2 {

	public static void main(String[] args)throws ClassNotFoundException, NoSuchFieldException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException {
		
		Class cs = Class.forName("reflection.Student");

		//---------��ó�Ա����(���ó�Ա����)-------------
		Field[] fs = cs.getDeclaredFields();
		for(Field f : fs){
			System.out.println(f);
		}
		
		//Field f = cs.getField("name");  ��ȡ�����ֶ�
		//��ȡ������Ա����
		Field f = cs.getDeclaredField("name");
		f.setAccessible(true);  //��������  ���˽������
		Object obj = cs.getConstructor().newInstance();
		//ʹ�ó�Ա����
		f.set(obj, "hh");
		Student stu = (Student) obj;
		System.out.println(stu.getName());
		
		
		//--------------������г�Ա����----------------------
		
		Method[] mds = cs.getDeclaredMethods();
		for(Method md : mds){
			System.out.println(md);
		}
		
		//��ȡ������Ա����
		//Method md = cs.getDeclaredMethod("MyName",String.class); ��Ӧ��������
		Method md = cs.getDeclaredMethod("MyName");
		md.setAccessible(true);
		//md.invoke(obj, "sss");  arg1:������������    arg2:ʵ��
		md.invoke(obj, null);
	}
	
}
