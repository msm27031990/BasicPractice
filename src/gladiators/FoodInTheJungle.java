package gladiators;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public interface FoodInTheJungle {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        String[] treesAndDistance = in.nextLine().trim().split(" ");
        short trees = Short.parseShort(treesAndDistance[0]);
    	double maxDistance = Double.parseDouble(treesAndDistance[1]);
        if(trees <= 1) {
        	System.out.println("0");
        	return;
        }
        short badTrees = 0;
        List<Tree> treesList = new ArrayList<Tree>();
        for(short i = 0; i <trees; i++) {
        	String[] s = in.nextLine().trim().split(" ");
        	Tree t = new Tree(Short.parseShort(s[0]), Short.parseShort(s[1]), Byte.parseByte(s[2]), Short.parseShort(s[3]));
        	treesList.add(t);
        	if(t.monkeys > t.threshold) {
        		badTrees++;
        	}
        }
        if(badTrees > 1) {
        	System.out.println("-1");
        	return;
        }
        int size = treesList.size();
        for(int i = 0; i < size -1; i++) {
        	double shortest = 0;
        	boolean first = true;
        	Tree temp = null;
        	for(int j = i + 1; j < size; j++) {
            	Tree t1 = treesList.get(i);
            	Tree t2 = treesList.get(j);
            	if(first) {
            		shortest = Math.sqrt(((t1.x - t2.x)^2 + (t1.y - t2.y)^2));
            		first = false;
            		temp = t1;
            		continue;
            	}
            	if(Math.sqrt(((t1.x - t2.x)^2 + (t1.y - t2.y)^2)) < shortest){
            		shortest = Math.sqrt(((t1.x - t2.x)^2 + (t1.y - t2.y)^2));
            		temp = t1;
            	}
            	
            }
        	if(shortest > maxDistance) {
        		if(temp.monkeys > 0) {
        			System.out.println("-1");
        			return;
        		}
        	}
        }
        
        
	}

}

class Tree {
	
	public short x;
	public short y;
	public byte monkeys;
	public short threshold;
	
	public Tree(short x, short y, byte monkeys, short thrshold) {
		this.x = x;
		this.y = y;
		this.monkeys = monkeys;
		this.threshold = thrshold;
	}
		
}
