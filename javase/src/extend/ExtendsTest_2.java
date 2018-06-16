package extend;

/**
 * ≤‚ ‘  this super
 * @author hao
 *
 */
public class ExtendsTest_2 extends Parent{
	
	String name = "hao_";
	
	public ExtendsTest_2(){
		this("hao");
	}
	public ExtendsTest_2(String name){
		super();
		this.name = name;
	}

	public static void main(String[] args) {
		ExtendsTest_2 e = new ExtendsTest_2();
		System.out.println(e.name);
		Parent p = new ExtendsTest_2();
		System.out.println(p.name);
		Parent p_2 = new Parent();
	}
}
