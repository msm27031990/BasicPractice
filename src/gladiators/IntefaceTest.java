package gladiators;

public class IntefaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	
	String bed(String a){
		return null;
	}
	
	String bed(String a, String b) {
		return null;
	}

}
class Constructur{
	private Constructur() {
		
	}
}

interface One{
	/*String a = "One";
	int b = 1;*/
	void display();
}
interface Two{
	String a = "Two";
	int b = 2;
	void display();
}
class OneTwo implements Two, One{

	@Override
	public void display() {
		System.out.println(a + b);
		
	}
	
}

class Par{
	
	Par(){
		
	}
	
	Par(int a){
		
	}
	
	void blabla() throws NullPointerException{
		
	}
	
}
class Bar extends Par{
	
	Bar(){
		blabla();
	}
	
	void far(){
		blabla();
	}
	
	void bad(){
		far();
	}
	
	void blabla() throws RuntimeException{
		System.out.println("");
		super.blabla();
	}
}




