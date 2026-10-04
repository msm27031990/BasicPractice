package gladiators;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class CountingLeafs {
	
	private static Set<Integer> items = new HashSet<Integer>();

	public static void main(String[] args) {
		//17
		//-1 0 0 1 1 2 2 4 4 8 8 10 10 11 11 14 14
		Scanner in = new Scanner(System.in);
        int length = Integer.parseInt(in.nextLine().trim());
        String[] treeString = in.nextLine().trim().split(" ");
        int[] tree = new int[length];
        for(int i = 0; i < length; i++) {
        	tree[i] = Integer.parseInt(treeString[i]);
        }
        int delete = Integer.parseInt(in.nextLine().trim());
        if(delete <= 0 || length <= 0) {
        	System.out.println("0");
        	return;
        }
        items.add(delete);
        while(findChilds(tree, length)) {}
        tree[delete] = -2;
        List<Integer> tempItems = new ArrayList<Integer>();
        for(int j = 0; j < length; j++) {
        	int temp = tree[j];
        	System.out.println(temp);
        	if(temp != -2) {
        		tempItems.add(j);
        	}
        }
        System.out.println("items");
        System.out.println(tempItems);
        int counter = 0;
        for(Integer bla : tempItems) {
        	boolean found = false;
        	for(int j = 0 ; j < length; j++) {
            	if(bla == tree[j]) {
            		found = true;
            	}
            }
        	if(!found) {
        		counter++;
        	}
        }
        System.out.println("count");
        System.out.println(counter);
	}
	
	private static boolean findChilds(int[] tree, int length) {
		boolean bool = false;
		Set<Integer> tempItems = new HashSet<Integer>();
		for(Integer in : items) {
			for(int j = 0; j < length; j++) {
	        	if(tree[j] == in) {
	        		tree[j] = -2;
	        		tempItems.add(j);
	        		bool = true;
	        	}
	        }
		}
		items = tempItems;
		return bool;
	}

}
