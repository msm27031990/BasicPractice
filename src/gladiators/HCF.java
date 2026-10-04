package gladiators;

public class HCF {

	public static void main(String[] args) {
		int[] array = {15, 20, 40, 55, 60, 100};
		HCF hcf = new HCF();
		System.out.println(hcf.hcf(array));
	}

	public int hcf(int[] array) {
		int min = array[0];
		for(int iter: array){
			if(min > iter) {
				min = iter;
			}
		}
		int hcf = min;
		for(int i = min; i >= 1; i--) {
			boolean gotIt = true;
			for(int iter: array){
				if(iter % i != 0) {
					gotIt = false;
					continue;
				}
			}
			if(gotIt) {
				hcf = i;
				break;
			}
		}
		return hcf;
	}
}
