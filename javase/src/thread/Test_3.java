package thread;

/**
 * t线程打印A
 * 主线程打印B
 * @author hao
 *
 */
public class Test_3 {
	

	public static void main(String[] args) throws InterruptedException {
		Object obj = new Object();

		Thread t = new Thread(new MyThread_3(obj));
		t.setName("A");
		Thread.currentThread().setName("B");
		
		t.start();
		
		//先让T线程执行
		Thread.sleep(100);
		
		int count = 3;
		while(count > 0){
			synchronized(obj){
				System.out.print(Thread.currentThread().getName());
				obj.notify();
			}
			//防止 本线程连续得到锁
			Thread.sleep(100);
			count --;
		}
		
	}
	
	
}

