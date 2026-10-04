package test;

public class ExceptionInheritance {

	public static void main(String[] args) {
		Object s = new String("Java");
		Parent p = new Child();
		Child c = new Child();
		p.method("");
		p.method(s);
		c.method("");
		c.method(s);
		Exception e1 = new RuntimeException("Java");
		Exception e = new Exception("Java");
		Parent1 p1 = new Child1();
		Child1 c1 = new Child1();
		p1.method(e);
		p1.method(e1);
		c1.method(e);
		c1.method(e1);
	}

}
class Parent{

	public void method(Object a) {
		System.out.println("In Parent");
	}
}
class Child extends Parent{
	
	public void method(String a) {
		System.out.println("In Child String");
	}
}
class Parent1{

	public void method(Exception  a) {
		System.out.println("In Parent");
	}
}
class Child1 extends Parent1{
	
	public void method(RuntimeException  a) {
		System.out.println("In Child exception");
	}
}