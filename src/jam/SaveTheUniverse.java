package jam;

import java.util.Scanner;

public class SaveTheUniverse {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine().trim());
        long[] damages = new long[testCases];
        char[][] prog = new char[testCases][30];
        String input = null;
        for(int i = 0; i < testCases; i++) {
        	input = in.nextLine().trim();
        	damages[i] = Long.parseLong(input.split(" ")[0]);
        	prog[i] = input.split(" ")[1].toCharArray();
        }
        for(int i = 0; i < testCases; i++) {
        	if(damages[i] >= execute(prog[i])) {
        		System.out.println("Case #" + (i+1) + ": " + 0);
        		continue;
        	}else {
        		long steps = 0;
        		boolean found = true;
        		while(damages[i] < execute(prog[i]) && found) {
        			char[] temp = prog[i];
        			found = false;
        			for(int j = temp.length - 1; j > 0; j--) {
        				if(temp[j] == 'S' && temp[j-1] == 'C') {
        					temp[j] = 'C';
        					temp[j-1] = 'S';
        					steps++;
        					prog[i] = temp;
        					found = true;
        					break;
        				}
        			}
        		}
        		if(damages[i] < execute(prog[i])) {
    				if(!found){
    					System.out.println("Case #" + (i+1) + ": IMPOSSIBLE");
    				}
    			}else {
    				System.out.println("Case #" + (i+1) + ": " + steps);
    			}
        	}
        }
	}
		
	private static long execute(char[] arr) {
		long damage = 0;
		long energy = 1;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == 'C') {
				energy = energy * 2;
			}else {
				damage = damage + energy;
			}
		}
		return damage;
	}

}
