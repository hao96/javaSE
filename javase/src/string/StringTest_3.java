package string;
/**
 * final 关键字
 * @author hao
 *
 */
public class StringTest_3 {

	public static void main(String[] args) {
		final StringBuffer str = new StringBuffer("aaa");
		//会报错
		//str = new StringBuffer("bbb");
		
		//对于引用型变量  可以改变变量值  不可以改变变量指针
		str.append("bbb");
		
	}
}
