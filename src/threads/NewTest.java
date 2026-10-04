package threads;

public class NewTest {
	
	public static void main(String[] args) {
		try {
			//BC.main(null);
			BC bc = new BC();
			Thread t = new Thread(bc);
			t.start();
			Thread.holdsLock(t);
		} catch (Error e) {
			System.out.println("ERROR");
		}
	}

}
class BC extends Thread{
	public static void main(String[] args) {
		NewTest.main(null);
	}
	
	public void run() {
		try {
			for(int i = 0; i < 10 ; i++) {
				Thread.sleep(1000);
				System.out.println("1");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}