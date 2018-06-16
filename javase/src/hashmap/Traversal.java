package hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * map�Ķ��� �������� �� ��ʱ
 * 
 * ����Ҫ key ����Ҫ value ʱ
 * 		��Ҫ �ڱ���ʱɾ��Ԫ��   ��T_iter
 * 		�������ʱ    ��T_for_1
 * 
 *  ������Ҫ�� keys ��  valuesʱ
 *  	��T_for_2
 * 
 * @author hao
 *
 */
public class Traversal {

	//for ʹ��entries
	public static void T_for_1(HashMap<String, Integer> map){
		
		long startTime = System.currentTimeMillis();
		
		
		for(Map.Entry<String, Integer> var : map.entrySet()){
			System.out.println("key : " + var.getKey() + " | " + "value : " + var.getValue());
		}
		
		long endTime = System.currentTimeMillis();
		
		System.out.println("����ʱ��" + (endTime - startTime));
	}
	
	//for ֱ�ӱ���kyes values   ��˵ ��entries��������10%   �����Ҳ��� ���ˡ�����
	
	public static void T_for_2(HashMap<String, Integer> map){
		long startTime = System.currentTimeMillis();
		
		
		for(String key : map.keySet()){
			System.out.println("key : " + key);
		}
		
		for(Integer value : map.values()){
			System.out.println("value : " + value);
		}
		
		long endTime = System.currentTimeMillis();
		
		System.out.println("����ʱ��" + (endTime - startTime));
	}
	
	
	//ʹ��iterator ��������
	public static void T_iter(HashMap<String, Integer> map){
		
		long startTime = System.currentTimeMillis();
		
		Iterator<Map.Entry<String, Integer>> entries = map.entrySet().iterator();
		
		while(entries.hasNext()){
			Map.Entry<String, Integer> var = entries.next();
			System.out.println("key : " + var.getKey() + " | " + "value : " + var.getValue());
		}
		
		long endTime = System.currentTimeMillis();
		System.out.println("����ʱ��" + (endTime - startTime));
		
	}
}
