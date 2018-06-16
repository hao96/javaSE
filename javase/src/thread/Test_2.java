package thread;

public class Test_2 {

	public static void main(String[] args) throws InterruptedException {
		Object obj_1 = new Object();
		
		Thread notify = new Thread(new MyThread_2(obj_1));
		Thread wait = new Thread(new MyThread_2_1(obj_1));
		
		wait.start();
		Thread.sleep(100);
		notify.start();
	}
	
}
