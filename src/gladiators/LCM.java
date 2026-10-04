package gladiators;

public class LCM {

	public static void main(String[] args) {
		int[] array = {15, 2, 4, 5, 6, 10};
		LCM lcm = new LCM();
		System.out.println(lcm.lcm(array));
	}

	public int lcm(int[] array) {
		int max = array[0];
		for(int iter: array){
			if(max < iter) {
				max = iter;
			}
		}
		while(true) {
			boolean gotIt = true;
			for(int iter: array){
				if(max % iter != 0) {
					gotIt = false;
					continue;
				}
			}
			if(gotIt) {
				break;
			}
			max++;
		}
		return max;
	}
}
