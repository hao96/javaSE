package extend;

import java.util.ArrayList;
import java.util.List;

/**
 * ����  �����ܷ� ����ת�� ������   
 * ��
 * @author hao
 *
 */
public class ExtendsTest_5 {

	public static void main(String[] args) {
		Parent p = new Grandson();
		Grandson gs = new Grandson();
		p.myName();
		
		List<? extends Parent> ps = new ArrayList<>();
		
	}
	
	
}
