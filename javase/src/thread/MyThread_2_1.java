package thread;

/**
 * wait����
 * @author hao
 *
 */
public class MyThread_2_1 implements Runnable{

	private Object obj;
	
	public MyThread_2_1(Object obj) {
		this.obj = obj;
	}

	@Override
	public void run() {
		int count = 3;
		
		while(count > 0){
			synchronized(obj){
				System.out.println(Thread.currentThread().getName() +"�̵߳ȴ�");
				try {
					obj.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally{
					System.out.println(Thread.currentThread().getName() + "  " +count);
					System.out.println(Thread.currentThread().getName() +"�߳̽���");
					count--;
				}
			}
		}
	}
	
	
	
}
