package trycatch;

/**
 * 测试finally
 * @author hao
 *
 */
public class Test_1 {

	public static void main(String[] args) {
		System.out.println(getNum());
	}

	private static char getNum() {

		try {
			throw new Exception();
			//return 'a';
		}catch (Exception e) {
			System.out.println("catch");
			return 'c';
		} finally {
			System.exit(1);
			//会覆盖掉  try 中的return
			//return 'b';
			
			//会在catch 方法前执行
			System.out.println("hello");  //hello c
		}
		
		
	}
	
}
