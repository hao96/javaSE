package reflection;

public class Student {

	private String name;
	private String sex;
	
	private void MyName(){
		System.out.println("my name is : " + name);
	}
	
	public String getName() {
		return name;
	}
	public String getSex() {
		return sex;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	
}
