package reflection;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * 通过 配置文件 实现成员变量 及方法调用
 * @author hao
 *
 */
public class ClassTest_3 {

	public static void main(String[] args) throws ClassNotFoundException, IOException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException {
		
		//反射获取Class对象
		Class cs = Class.forName(getVlaue("classname"));
		//反射获取方法
		Method me = cs.getDeclaredMethod(getVlaue("method"));
		//暴力反射
		me.setAccessible(true);
		//调用方法
		me.invoke(cs.getConstructor().newInstance(), null);
		
	}

	//输入key 从配置文件中获取value
	private static String getVlaue(String key) throws IOException {
		//创建配置文件对象
		Properties pro = new Properties();
		//获取输入流
		FileReader fr = new FileReader("test.txt");
		//将流加载到配置文件中
		pro.load(fr);
		fr.close();
		//根据key 返回value值
		return pro.getProperty(key);
	}
}
