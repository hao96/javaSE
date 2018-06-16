package extend;

import java.util.ArrayList;
import java.util.List;

/**
 * 测试  孙子能否 向上转型 到父亲   
 * 能
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
