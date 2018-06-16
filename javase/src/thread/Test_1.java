package thread;

/**
 * 利用多线程  打印十组 ABC
 * @author hao
 *
 */
public class Test_1 {

	public static void main(String[] args) throws InterruptedException {
		
		Object a = new Object();
		Object b = new Object();
		Object c = new Object();
		
		Thread pa = new Thread(new MyThread("A", c, a));
		Thread pb = new Thread(new MyThread("B", a, b));
		Thread pc = new Thread(new MyThread("C", b, c));
		
		pa.start();
		Thread.sleep(100);
		pb.start();
		Thread.sleep(100);
		pc.start();
	}
}
