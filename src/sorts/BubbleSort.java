package sorts;

public class BubbleSort {
	
	public static void main(String[] args) {
		int[] array = new int[] {5, 1, 9, 7, 13, 2, 4, 0, 6, 3, 8};
		int temp = 0;
		for(int i = 0; i < array.length; i++) {
			for(int j = 1; j < array.length - i; j++) {
				//System.out.println("i - " + i + " j - " + j);
				//System.out.println("compare " + array[j - 1] + " and " + array[j]);
				if(array[j - 1] > array[j]) {
					//System.out.println("Swap");
					temp = array[j - 1];
					array[j - 1] = array[j];
					array[j] = temp;
				}
			}
			for (int p : array) {
				System.out.print(p + ", ");
			}
			System.out.println();
		}
		for (int i : array) {
			System.out.println(i);
		}
	}

}
