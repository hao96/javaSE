package extend;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import clazz.AnonymousClass;

/**
 * 利用反射机制  查看子类继承父类的具体成员变量方法
 * @author hao
 *
 */
public class ExtendsTest_4 {

	public static void main(String[] args) throws ClassNotFoundException {
		Class cc = Class.forName("extend.Parent");
		
		//所有字段
		Field[] fs = cc.getDeclaredFields();
		
		for(Field f : fs){
			System.out.println(f);
		}
		
		//所有方法
		Method[] mes = cc.getDeclaredMethods();
		
		for(Method me : mes){
			System.out.println(me);
		}
		
	}
}
