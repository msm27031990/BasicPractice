import java.util.Collection;
import java.util.HashSet;

public class StaticBindingTest extends ABCD{
	
	public StaticBindingTest() {
		System.out.println(1);
	}
 
    public static void main(String args[])  {
       Collection c = new HashSet();
       StaticBindingTest et = new StaticBindingTest();
       et.sort(c);
     
    }
   
    //overloaded method takes Collection argument
    public Collection sort(Collection c){
        System.out.println("Inside Collection sort method");
        return c;
    }
 
   
   //another overloaded method which takes HashSet argument which is sub class
    public Collection sort(HashSet hs){
        System.out.println("Inside HashSet sort method");
        return hs;
    }
     
}
class ABCD{
	
	public ABCD() {
		System.out.println(2);
	}
	
	 //overloaded method takes Collection argument
    public Collection sort(Collection c){
        System.out.println("Inside Collection sort method");
        return c;
    }
}
