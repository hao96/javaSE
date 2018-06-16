package string;
/**
 * 测试：当传入形参的变量一个成员变量指针时  指针指向的对象不做自身的改变   成员变量不会修改
 * @author hao
 *
 */
public class StringTest_2 {

	public static void main(String[] args) {
		//在堆中开辟一块空间  将其地址返还str
		String str = new String("aaa");
		//将地址传给该方法
		func(str);
		System.out.println(str);
		
		
		StringBuffer sb = new StringBuffer("aaa");
		func_2(sb);
		System.out.println(sb);
		
	}

	private static void func_2(StringBuffer sb) {
		// sb该地址指向的成员变量 自身发生了改变  
		// 所以指向的成员变量改变了
		sb.replace(0, sb.length(), "bbb");
	}

	private static void func(String str) {
		// str -> 成员变量str的地址
		
		//"bbb" 作为新创建的字符串常量  将地址赋给str 局部变量str
		//所以 等于没有对成员变量操作  所以成员变量不变
		str = "bbb";
	}
}
