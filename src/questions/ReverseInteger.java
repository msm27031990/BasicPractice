package questions;

public class ReverseInteger {
	
	public static void main(String[] args) {
		int a = 54282561;
		int r = 0;
		while (a != 0) {
			r = r * 10 + a % 10;
			a = a / 10;
			/*if(r > Integer.MAX_VALUE || r < Integer.MIN_VALUE) {
				throw new RuntimeException("outside range")
			}*/
		}
		System.out.println(r);
	}

}
