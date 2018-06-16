package thread;

/**
 * ��ӡ 3�� AB
 * A�̴߳�ӡ A
 * B�̴߳�ӡ B
 * @author hao
 *
 */
public class MyThread_3 implements Runnable{

	Object obj;
	
	public MyThread_3(Object obj) {
		this.obj = obj;
	}
	
	public MyThread_3() {
	}

	@Override
	public void run() {
		int count = 3;
		while(count > 0){

			synchronized(obj){
				System.out.print(Thread.currentThread().getName());
				try {
					obj.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			count--;
		}
	}

}
