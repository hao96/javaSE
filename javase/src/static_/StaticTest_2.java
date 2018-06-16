package static_;

public class StaticTest_2 {
	public static int i = 1;
	public static void main(String[] args) {
		StaticTest_2 st = new StaticTest_2();
		st.i++;
		System.out.println(st.i);
		boolean b = false;
		System.out.println(!b);
	}
}
