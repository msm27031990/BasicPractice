package test;

public class StaticTest {
	
	static {
		System.out.println("cd");
		//System.exit(0);
	}
	
	public static void main(String[] args) {
		System.out.println("AB");
		StaticTest sc = new StaticTest();
		//sc.sum(10, 12);
		AB ab = new BC();
		ab.sum(0, 121212);
	}
	
	
	    
	     

}
class AB{
	void sum(int a,long b) throws RuntimeException{System.out.println("a method invoked");}
}

class BC extends AB{
	void sum(long a,int b){System.out.println("b method invoked");}
	void sum(int a,long b) throws ArithmeticException {System.out.println("ab method invoked");}
}
