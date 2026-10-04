package questions;

public class StringReverse {
	
	public static void main(String[] args) {
		String myString = "This is the string to reverse";
		System.out.println(new StringBuilder(myString).reverse().toString());
		
		StringBuilder sb = new StringBuilder();
		for(int i = myString.length() -1 ; i >= 0; i--) {
			sb.append(myString.charAt(i));
		}
		System.out.println(sb.toString());
	}
}
