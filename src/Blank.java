
public class Blank {
	
	public static final int a;
	public final int  b;
	
	static {
		a = 10;
		//System.exit(0);
	}
	
	public Blank() {
		b = 10;
	}
	
	public  void display() {
		System.out.println("Top Display");
	}
	
	/*public void display() {
		System.out.println("Top Display");
	}*/

	public static void main(String[] args) {
		Blank b = new Black();
		Blank b1 = new Blank();
		Black b2 = new Black();
		b.display();
		b1.display();
		b2.display();
	}

}

class Black extends Blank{
	public void display() {
		System.out.println("Bottom Display");
	}
}

class Ass{
	
}