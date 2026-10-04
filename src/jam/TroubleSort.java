package jam;

import java.util.Scanner;

public class TroubleSort {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine().trim());
        long[][] array = new long[testCases][];
        for(int i = 0; i < testCases; i++) {
        	int arrLength = Integer.parseInt(in.nextLine().trim());
        	String[] inputs = in.nextLine().trim().split(" ");
        	long[] arr = new long[inputs.length];
        	for(int j = 0; j < inputs.length; j++) {
        		arr[j] = Integer.parseInt(inputs[j]);
        	}
        	array[i] = arr;
        }
        for(int i = 0; i < testCases; i++) {
        	tippleBubbleSort(array[i]);
        	boolean found = false;
        	int foundIndex = -1;
        	for(int k = 0; k < array[i].length - 1; k++) {
        		if(array[i][k] > array[i][k+1]) {
        			found = true;
        			foundIndex = k;
        			break;
        		}
        	}
        	if(found) {
        		System.out.println("Case #" + (i+1) + ": " + foundIndex);
        	}else {
        		System.out.println("Case #" + (i+1) + ": OK");
        	}
        }

        
	}

	private static void tippleBubbleSort(long arr[]) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++)
			for (int j = 0; j < n - i - 2; j++)
				if (arr[j] > arr[j + 2]) {
					long temp = arr[j];
					arr[j] = arr[j + 2];
					arr[j + 2] = temp;
				}
	}
	
	/*private static long array[];
	private static int length;

	private static void sort(long[] inputArr) {
		if (inputArr == null || inputArr.length == 0) {
			return;
		}
		array = inputArr;
		length = inputArr.length;
		quickSort(0, length - 1);
	}

	private static void quickSort(int lowerIndex, int higherIndex) {
		int i = lowerIndex;
		int j = higherIndex;
		long pivot = array[lowerIndex + (higherIndex - lowerIndex) / 2];
		while (i <= j) {
			while (array[i] < pivot) {
				i++;
			}
			while (array[j] > pivot) {
				j--;
			}
			if (i <= j) {
				exchangeNumbers(i, j);
				i++;
				j--;
			}
		}
		if (lowerIndex < j)
			quickSort(lowerIndex, j);
		if (i < higherIndex)
			quickSort(i, higherIndex);
	}

	private static void exchangeNumbers(int i, int j) {
		long temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}*/

}
