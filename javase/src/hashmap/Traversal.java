package hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * map的多种 遍历方法 及 用时
 * 
 * 即想要 key 又想要 value 时
 * 		想要 在遍历时删除元素   用T_iter
 * 		仅想遍历时    用T_for_1
 * 
 *  单独想要用 keys 或  values时
 *  	用T_for_2
 * 
 * @author hao
 *
 */
public class Traversal {

	//for 使用entries
	public static void T_for_1(HashMap<String, Integer> map){
		
		long startTime = System.currentTimeMillis();
		
		
		for(Map.Entry<String, Integer> var : map.entrySet()){
			System.out.println("key : " + var.getKey() + " | " + "value : " + var.getValue());
		}
		
		long endTime = System.currentTimeMillis();
		
		System.out.println("总用时：" + (endTime - startTime));
	}
	
	//for 直接遍历kyes values   据说 比entries方法快了10%   但是我测试 慢了。。。
	
	public static void T_for_2(HashMap<String, Integer> map){
		long startTime = System.currentTimeMillis();
		
		
		for(String key : map.keySet()){
			System.out.println("key : " + key);
		}
		
		for(Integer value : map.values()){
			System.out.println("value : " + value);
		}
		
		long endTime = System.currentTimeMillis();
		
		System.out.println("总用时：" + (endTime - startTime));
	}
	
	
	//使用iterator 方法遍历
	public static void T_iter(HashMap<String, Integer> map){
		
		long startTime = System.currentTimeMillis();
		
		Iterator<Map.Entry<String, Integer>> entries = map.entrySet().iterator();
		
		while(entries.hasNext()){
			Map.Entry<String, Integer> var = entries.next();
			System.out.println("key : " + var.getKey() + " | " + "value : " + var.getValue());
		}
		
		long endTime = System.currentTimeMillis();
		System.out.println("总用时：" + (endTime - startTime));
		
	}
}
