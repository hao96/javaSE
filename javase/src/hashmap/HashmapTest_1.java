package hashmap;

import java.util.HashMap;

public class HashmapTest_1 {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		
		//���� hashmap ��keyֵ����Ϊ��
		String str = null;
		map.put(str, 1);
		map.put(str, 2);
		Traversal.T_iter(map);
	}
}
