package thread;

/**
 * t�̴߳�ӡA
 * ���̴߳�ӡB
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
		
		//����T�߳�ִ��
		Thread.sleep(100);
		
		int count = 3;
		while(count > 0){
			synchronized(obj){
				System.out.print(Thread.currentThread().getName());
				obj.notify();
			}
			//��ֹ ���߳������õ���
			Thread.sleep(100);
			count --;
		}
		
	}
	
	
}

