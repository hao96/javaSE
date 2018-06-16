package thread;

/**
 * 打印 十组ABC
 * @author hao
 *
 */
public class MyThread implements Runnable{

	//字母
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
	                    //释放 自身锁  唤醒myself对象监视器上的一个等待线程
	                    myself.notify();     
	                }     
	                try {
	                	//释放  prev锁  本线程等待
	                    previous.wait();     
	                } catch (InterruptedException e) {     
	                    e.printStackTrace();     
	                }     
	            }     
	    
	        }     
	}

}
