package extend;

public class ExtendTest_1 extends Parent{

	/**
	 * 重写    overriding
	 * 方法名 返回值类型  参数 都相同
	 * 父类与子类之间的多态的一种表现
	 */
	public void myName(){
		System.out.println("my name");
	}
	
	/**
	 * 重载    overloding
	 * 方法名相同   返回值类型（可以相同） 参数 不相同
	 * 类中的多态的一种表现
	 * @param name
	 */
	public void myName(String name){
		System.out.println("my name is " + name );
	}
	
	public static void main(String[] args) {
		Parent p = new ExtendTest_1();
		ExtendTest_1 e = (ExtendTest_1)p;
		e.myName("young");
	}
}
