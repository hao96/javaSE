package extend;

public class Parent {
	
	public Parent(){

	}
	
	public Parent(String name){
		this.name = name;
	}
	
	private String sex = "ÄÐ";
	
	public String name = "yang_";

	public void myName(){
		System.out.println("name");
	}
	
	private void mySex(){
		System.out.println("ÄÐ");
	}
}
