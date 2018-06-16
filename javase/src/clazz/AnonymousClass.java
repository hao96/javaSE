package clazz;

/**
 * 匿名类
 * @author hao
 *
 */
public class AnonymousClass {
	
	//父类的私有成员变量
	//private String str_ = "hao";
	public String str_;
	
	//父类构造函数
	public AnonymousClass(String str){
		str_=str;
	}
	
	public void show(){
		System.out.println(str_);
	}
	
	public static void myname(){
		System.out.println("young");
	}
 
	public static void main(String[] args) {
		
		//调用父类构造函数
		AnonymousClass ac = new AnonymousClass("word"){
			/**
			 * 可以看成特殊的内部类
			 * 匿名类中不可以有静态方法、成员
			 */
			//static String test = "hh";  报错
			
			//可以继承、重写父类中的方法
			public void show(){
				System.out.println("hello");
			}
		};
		
		//可以调用父类方法  （静态 非静态 ）
		ac.show();
		ac.myname();
		//调用父类成员变量
		System.out.println(ac.str_);	
	}
}
