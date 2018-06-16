package reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 获取成员变量并调用
 * 
 * 获取成员方法并调用
 * @author hao
 *
 */
public class ClassTets_2 {

	public static void main(String[] args)throws ClassNotFoundException, NoSuchFieldException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException {
		
		Class cs = Class.forName("reflection.Student");

		//---------获得成员变量(所用成员变量)-------------
		Field[] fs = cs.getDeclaredFields();
		for(Field f : fs){
			System.out.println(f);
		}
		
		//Field f = cs.getField("name");  获取公有字段
		//获取单个成员变量
		Field f = cs.getDeclaredField("name");
		f.setAccessible(true);  //暴力反射  解除私有限制
		Object obj = cs.getConstructor().newInstance();
		//使用成员变量
		f.set(obj, "hh");
		Student stu = (Student) obj;
		System.out.println(stu.getName());
		
		
		//--------------获得所有成员方法----------------------
		
		Method[] mds = cs.getDeclaredMethods();
		for(Method md : mds){
			System.out.println(md);
		}
		
		//获取单个成员方法
		//Method md = cs.getDeclaredMethod("MyName",String.class); 对应参数类型
		Method md = cs.getDeclaredMethod("MyName");
		md.setAccessible(true);
		//md.invoke(obj, "sss");  arg1:方法所属对象    arg2:实参
		md.invoke(obj, null);
	}
	
}
