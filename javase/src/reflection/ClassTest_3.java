package reflection;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * ͨ�� �����ļ� ʵ�ֳ�Ա���� ����������
 * @author hao
 *
 */
public class ClassTest_3 {

	public static void main(String[] args) throws ClassNotFoundException, IOException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException {
		
		//�����ȡClass����
		Class cs = Class.forName(getVlaue("classname"));
		//�����ȡ����
		Method me = cs.getDeclaredMethod(getVlaue("method"));
		//��������
		me.setAccessible(true);
		//���÷���
		me.invoke(cs.getConstructor().newInstance(), null);
		
	}

	//����key �������ļ��л�ȡvalue
	private static String getVlaue(String key) throws IOException {
		//���������ļ�����
		Properties pro = new Properties();
		//��ȡ������
		FileReader fr = new FileReader("test.txt");
		//�������ص������ļ���
		pro.load(fr);
		fr.close();
		//����key ����valueֵ
		return pro.getProperty(key);
	}
}
