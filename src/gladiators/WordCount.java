package gladiators;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordCount {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int output = 0;
		int ip1_rows = 0;
		int ip1_cols = 0;
		ip1_rows = Integer.parseInt(in.nextLine().trim());
		ip1_cols = Integer.parseInt(in.nextLine().trim());
		String[][] ip1 = new String[ip1_rows][ip1_cols];
		for (int ip1_i = 0; ip1_i < ip1_rows; ip1_i++) {
			for (int ip1_j = 0; ip1_j < ip1_cols; ip1_j++) {
				ip1[ip1_i][ip1_j] = in.next();

			}
		}
		in.nextLine();
		String ip2 = in.nextLine().trim();
		output = word_count(ip1, ip2);
		System.out.println(String.valueOf(output));
	}
	
	public static int word_count(String[][] input1,String input2){
		int length = input1.length;
	    List<String> words = new ArrayList<String>();
	    for(int i = 0; i < length; i++){
	        words.add(toWord(input1[i]));
	    }
	    for(int i = 0; i < length; i++){
	        String vertical = "";
	        for(int j = 0; j < length; j++){
	        	vertical = vertical + input1[i][j];
	        }
	        words.add(vertical);
	    }
	    String diagonalDown = "";
	    for(int i = 0; i < length; i++){
	    	diagonalDown = diagonalDown + input1[i][i];
	    }
	    words.add(diagonalDown);
	    String diagonalUp = "";
	    for(int i = length - 1, k = 0; i > -1 ; i--, k++){
	        diagonalUp = diagonalUp + input1[i][k];
	       
	    }
	    words.add(diagonalUp);
	    int counter = 0;
	    for(String s : words){
	    	if(s.contains(input2)){
	    		counter++;
	    	}
	    }
	    return counter;
    }
	
	private static String toWord(String[] arr){
		String ss = "";
		for(String s : arr){
			ss = ss + s;
		}
		return ss;
	}

}
