package thread;

/**
 * notify����
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
			
			//��ֹ ��������
			try {
				Thread.currentThread().sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	
}
