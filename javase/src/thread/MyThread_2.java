package thread;

/**
 * notify测试
 * @author hao
 *
 */
public class MyThread_2 implements Runnable{

	Object obj;
	
	public MyThread_2(Object obj) {
		this.obj = obj;
	}
	
	@Override
	public void run() {
		int count = 3;
		while(count > 0){
			synchronized(obj){
				count--;
				obj.notify();
				System.out.println(Thread.currentThread().getName() + " notify  ");
			}
			
			//防止 过快获得锁
			try {
				Thread.currentThread().sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	
}
