package trycatch;

/**
 * ����finally
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
			//�Ḳ�ǵ�  try �е�return
			//return 'b';
			
			//����catch ����ǰִ��
			System.out.println("hello");  //hello c
		}
		
		
	}
	
}
