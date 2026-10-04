package test;
import java.io.IOException;
import java.util.Scanner;

public class Test{
	
	static public void main(String[] args) throws IOException{
		
		System.out.println(10 + 20 + "Javatpoint");   
        System.out.println("Javatpoint" + 10 + 20);  
		
		short[] a9 = new short[2000000000];
		
		int nine = 9;
		nine = nine++;
		System.out.println(nine);
		
		String[] ss = "2-".split("-");
		System.out.println(ss.length);
		
		Keeper k = new Keeper(5, 6);
		a(k);
		System.out.println(k.getA1() + " " + k.getB1());
		int[] b = {1, 2, 4};
		b(b);
		for(int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		
		/*new C();
		String s = "abdab";
		String[] arr = s.replaceAll("ab", " ").split(" ");
		System.out.println(arr.length);
		String bool = "TruE";
		Boolean b = new Boolean(bool);
		System.out.println(b);
        Scanner in = new Scanner(System.in);
        int output = 0;
        int ip1 = Integer.parseInt(in.nextLine().trim());
        String ip2 = in.nextLine().trim();*/
        
    }
	
	private static boolean a(Keeper k) {
		k.setA1(k.getA1()-1);
		return false;
	}
	
	private static int b(int[] a) {
		a[0] = -1;
		return 5;
	}
	
	
}
class Keeper {
	Integer a1;
	Integer b1;
	public Keeper(int a1, int b1) {
		this.a1 = a1;
		this.b1 = b1;
	}
	public Integer getA1() {
		return a1;
	}
	public void setA1(Integer a1) {
		this.a1 = a1;
	}
	public Integer getB1() {
		return b1;
	}
	public void setB1(Integer b1) {
		this.b1 = b1;
	}
	
	
}
class B{
	public String dip() {
		return "";
	}
}
class C extends B{
	public C() {
		System.out.println(super.dip());
		System.out.println(this);
		
	}
}
