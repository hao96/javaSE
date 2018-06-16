package thread;

/**
 * ��ӡ ʮ��ABC
 * @author hao
 *
 */
public class MyThread implements Runnable{

	//��ĸ
	String letter;
	Object previous;
	Object myself;
	
	public MyThread(String letter , Object previous , Object myself) {
		this.letter = letter;
		this.previous = previous;
		this.myself = myself;
	}
	
	@Override
	public void run() {
		 int count = 10;     
	        while (count > 0) {     
	            synchronized (previous) {     
	                synchronized (myself) {     
	                    System.out.print(letter);     
	                    count--;    
	                    //�ͷ� ������  ����myself����������ϵ�һ���ȴ��߳�
	                    myself.notify();     
	                }     
	                try {
	                	//�ͷ�  prev��  ���̵߳ȴ�
	                    previous.wait();     
	                } catch (InterruptedException e) {     
	                    e.printStackTrace();     
	                }     
	            }     
	    
	        }     
	}

}
