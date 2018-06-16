package string;

/**
 * String 的new 关键字
 * @author hao
 *
 */
public class StringTest {

	public static void main(String[] args) {
		
		//在运行时确定  创建新的引用
		String str_1 = new String("aaa");
		String str_2 = new String("aaa");
		
		//在文件编译时 就已经确定  并已经存放到常量池中(.class 文件中)
		String str_3 = "aaa";
		//常量的引用相同
		String str_4 = "aaa";
		
		//String 类型是不可变的  所以相当于 new String(str_5 + str_6)
		String str_5 = "a";
		String str_6 = "aa";
		
		
		System.out.println((str_1 == str_2));
		System.out.println((str_1 == str_3));
		System.out.println((str_3 == str_4));
		System.out.println((str_5 + str_6) == str_1);
	}
}
