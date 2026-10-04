package sort;

public class BubbleSort {

	public static int[] sort(int []array, boolean print) {
	    int length, temp;
	    length = array.length;
	    for (int c = 0; c < ( length - 1 ); c++) {
	      for (int d = 0; d < length - c - 1; d++) {
	        if (array[d] > array[d+1]){
	          temp = array[d];
	          array[d] = array[d+1];
	          array[d+1] = temp; 
	        }
	        if(print){
	        	print(array);
		        System.out.println();
		    }
	      }
	      if(print){
	    	  System.out.println();
		  }
	    }
	    if(print){
	    	print(array);
	    }
	    return array;
	  }
	
	private static void print(int array[]){
		for (int c = 0; c < array.length; c++) 
	  	      System.out.print(array[c] + " ");
	}
	/**
	 *  Prints all the values after sorting
	 */
	public static int[] sort(int []array) {
	    return BubbleSort.sort(array, false);
	  }
}
