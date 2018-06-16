package static_;

public class StaticTest {

	private static int i=127;
    public int getNext(){
         return i++;
    }
	
	public static void main(String[] args) {
		    
		        StaticTest test=new StaticTest();
		        StaticTest testObject=new StaticTest();
		        test.getNext();
		        testObject.getNext();
		        System.out.println(test.getNext());
	}
}
