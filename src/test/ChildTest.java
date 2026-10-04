package test;

public class ChildTest extends ParentTest{

	public static void main(String[] args) {
		ParentTest parent = new ChildTest();
		parent.test();
		//parent.test2();

	}

	
	public void test() {
		System.out.println("test child");
	}
	
	private void test2() {
		System.out.println("test child private");
	}
	
	public static void test1() {
		System.out.println("static test1 child");
	}
	
}
