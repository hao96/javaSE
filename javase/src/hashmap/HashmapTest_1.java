package hashmap;

import java.util.HashMap;

public class HashmapTest_1 {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		
		//测试 hashmap 的key值可以为空
		String str = null;
		map.put(str, 1);
		map.put(str, 2);
		Traversal.T_iter(map);
	}
}
