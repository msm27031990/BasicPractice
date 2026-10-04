package ansh;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import test.Employee;


public class Test {
	
	public Test(){}
	
	private static int middle(int a, int b, int c){
		
		
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//int middle = min(min(max(a,b), max(a,c)), max(b,c));
		int middle = max(max(min(a,b), min(a,c)), min(b,c));
		return middle;
	}
	
	private static int min(int a, int b){
		if(a>b)
			return b;
		else
			return a;
	}

	private static int max(int a, int b){
		if(a<b)
			return b;
		else
			return a;
	}
	
 static  public void  main(String[] args) {
	 
	 
	 	//confusion
		int x = 10;
		x = x++;
		//prints 10
		System.out.println(x);
		
		Employee s1 =new Employee(211,"ravi");  
		  try{
			  FileOutputStream fout=new FileOutputStream("C:/Users/MONI/Documents/Jars/f.txt");  
			  ObjectOutputStream out=new ObjectOutputStream(fout);  
			  
			  out.writeObject(s1);  
			  out.flush(); 
			  
			  FileInputStream fin=new FileInputStream("C:/Users/MONI/Documents/Jars/f.txt");  
			  ObjectInputStream in=new ObjectInputStream(fin);  
			  
			  Employee ee = (Employee)in.readObject();  
			  System.out.println(ee);
		  }catch(Exception e){
			  System.out.println(e);
		  }
		  System.out.println("success"); 
		  
		String s="Sachin";  
		s = " Tendulkar";
		String news =   s.concat(" Tendulkar");//concat() method appends the string at the end  
		   System.out.println(news);
		int qw = 1;
		qw++;
		System.out.println(qw);
		System.out.println(qw++);
		/*for(int i = 1; i<2; i++){
			System.out.println(middle(1,2,3));
			System.out.println(middle(1,3,2));
			System.out.println(middle(2,1,3));
			System.out.println(middle(2,3,1));
			System.out.println(middle(3,1,2));
			System.out.println(middle(3,2,1));
		}*/
		
	}

	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println("a");
		System.gc();
	}
}

class Emp{
	int id;
	String name;
	public Emp(int id, String name){
		this.id = id;
		this.name = name;
	}
}

abstract class Piku {
	public Piku(){
		System.out.println("Hello world 11");
	}
	public void display() {
		System.out.println("Hello world 1");
	}
}

class PK extends Piku {
	public PK(){
		System.out.println("Hello world 21");
	}
	public void display() {
		System.out.println("Hello world 2");
	}
}

class AB{
	int a=10;
	public void display() {
		System.out.println("Display AB");
	}
}
class BA extends AB{
	int a=10;
	public void display() throws RuntimeException{
		System.out.println("Display BA");
	}
}



