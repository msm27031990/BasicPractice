package common;

public class EvenOddPrinterByTwoThreads implements Runnable{

	static Object obj = new Object();
	static int count = 1;
	

	@Override
	public void run() {
		while(count < 100) {
			if(count % 2 == 0 && Thread.currentThread().getName().equals("even")) {
				synchronized (obj) {
					System.out.println(Thread.currentThread().getName() + " " + count);
					count++;
					try {
						obj.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			
			if(count % 2 != 0 && Thread.currentThread().getName().equals("odd")) {
				synchronized (obj) {
					System.out.println(Thread.currentThread().getName() + " " + count);
					count++;
					obj.notify();
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		Runnable t1 = new EvenOddPrinterByTwoThreads();
		Runnable t2 = new EvenOddPrinterByTwoThreads();
		new Thread(t1, "even").start();
		new Thread(t2, "odd").start();

	}

}
