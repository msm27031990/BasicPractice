package gladiators;

public class Star {

	public static void main(String[] args) {

		int n = 10;
		char star = '*';
		char fill = ' ';
		for(int i = 1; i <= n; i++) {
			for(int k = i; k < n; k++) {
				System.out.print(fill);
				System.out.print(fill);
			}
			int end = i;
			for(int j = 1; j <= i; j++){
				System.out.print(star);
				if(end != j){
					System.out.print(fill);
				}
			}
			System.out.println();
		}
	}

}
