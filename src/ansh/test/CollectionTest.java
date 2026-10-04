package ansh.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;


class s{
	private Employee e;

	public Employee getE() {
		return e;
	}

	public void setE(Employee e) {
		this.e = e;
	}
	
}

public class CollectionTest {
	
	public static void main(String[] args) {
		
		Map<Employee, String> a = new HashMap<Employee, String>();
		
		
		Employee Employee = new Employee(1, "First");
		a.put(Employee, "a");
		System.out.println(a.get(Employee));
		System.out.println(a);
		Collections.synchronizedMap(new HashMap<String, String>());
		Hashtable<Employee, Employee> aa = new Hashtable<Employee, Employee>();
		Employee e = new Employee(3, "Third");
		aa.put(new Employee(1, "First"), new Employee(1, "First"));
		aa.put(new Employee(2, "Second"), new Employee(2, "Second"));
		aa.put(e, e);
		
		List abc = new CopyOnWriteArrayList();
		Iterator ab = abc.iterator();
		ab.next();
	}
	

	
}




