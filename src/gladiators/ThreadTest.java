package gladiators;

public class ThreadTest {

	public static void main(String[] args) {
		Thread c = new ThreadExtends(new BC());
		c.start();
	}
}
class Thread{
	
	public Thread(String name) {
		System.out.println("Default Constructor 2");
	}
	public void run() {
		System.out.println("Run");
	}
	public void start(){
		System.out.println("Start");
		run();
	}
}

class ThreadExtends extends Thread{
	public ThreadExtends(BC bc) {
		super("");
	}
	public void run() {
		System.out.println("Run override");
	}
}
class BC{
	
}