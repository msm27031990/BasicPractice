package gladiators;

public class LongConChar {

	public static void main(String[] args) {

		String input = "APPPBBCHHHHIIPPPPP";
		char last = '\n';
		char maxLast = '\n';
		int lastCounter = 0;
		int maxCounter = 0;
		for(int i = 0; i < input.length(); i++) {
			char j = input.charAt(i);
			if(j == last) {
				lastCounter++;
			}else {
				if(maxCounter < lastCounter) {
					maxCounter = lastCounter;
					maxLast = last;
				}
				lastCounter = 1;
				last = j;
			}
		}
		if(maxCounter < lastCounter) {
			maxCounter = lastCounter++;
			maxLast = last;
		}
		System.out.println("Max "+ maxLast + " is " + maxCounter + " times");
	}

}
