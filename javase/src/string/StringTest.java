package string;

/**
 * String ��new �ؼ���
 * @author hao
 *
 */
public class StringTest {

	public static void main(String[] args) {
		
		//������ʱȷ��  �����µ�����
		String str_1 = new String("aaa");
		String str_2 = new String("aaa");
		
		//���ļ�����ʱ ���Ѿ�ȷ��  ���Ѿ���ŵ���������(.class �ļ���)
		String str_3 = "aaa";
		//������������ͬ
		String str_4 = "aaa";
		
		//String �����ǲ��ɱ��  �����൱�� new String(str_5 + str_6)
		String str_5 = "a";
		String str_6 = "aa";
		
		
		System.out.println((str_1 == str_2));
		System.out.println((str_1 == str_3));
		System.out.println((str_3 == str_4));
		System.out.println((str_5 + str_6) == str_1);
	}
}
