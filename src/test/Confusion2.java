package test;

import java.util.Set;
import java.util.TreeSet;

public class Confusion2 {

	public static void main(String[] args) {
		A a = new A(1);
		A a1 = new A(1);
		A a2 = new A(1);
		Set<A> s = new TreeSet<A>();
		s.add(a);
		s.add(a1);
		s.add(a2);
		System.out.println(s);

	}

}
class A implements Comparable{
	int a;
	A(int a){
		this.a = a;
	}
	
	public int compareTo(Object a) {
		return (int)System.currentTimeMillis()/100000;
	}
}
