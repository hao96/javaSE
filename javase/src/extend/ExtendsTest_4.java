package extend;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import clazz.AnonymousClass;

/**
 * ���÷������  �鿴����̳и���ľ����Ա��������
 * @author hao
 *
 */
public class ExtendsTest_4 {

	public static void main(String[] args) throws ClassNotFoundException {
		Class cc = Class.forName("extend.Parent");
		
		//�����ֶ�
		Field[] fs = cc.getDeclaredFields();
		
		for(Field f : fs){
			System.out.println(f);
		}
		
		//���з���
		Method[] mes = cc.getDeclaredMethods();
		
		for(Method me : mes){
			System.out.println(me);
		}
		
	}
}
