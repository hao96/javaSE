package string;
/**
 * ���ԣ��������βεı���һ����Ա����ָ��ʱ  ָ��ָ��Ķ���������ĸı�   ��Ա���������޸�
 * @author hao
 *
 */
public class StringTest_2 {

	public static void main(String[] args) {
		//�ڶ��п���һ��ռ�  �����ַ����str
		String str = new String("aaa");
		//����ַ�����÷���
		func(str);
		System.out.println(str);
		
		
		StringBuffer sb = new StringBuffer("aaa");
		func_2(sb);
		System.out.println(sb);
		
	}

	private static void func_2(StringBuffer sb) {
		// sb�õ�ַָ��ĳ�Ա���� �������˸ı�  
		// ����ָ��ĳ�Ա�����ı���
		sb.replace(0, sb.length(), "bbb");
	}

	private static void func(String str) {
		// str -> ��Ա����str�ĵ�ַ
		
		//"bbb" ��Ϊ�´������ַ�������  ����ַ����str �ֲ�����str
		//���� ����û�жԳ�Ա��������  ���Գ�Ա��������
		str = "bbb";
	}
}
