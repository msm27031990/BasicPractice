package gladiators;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RubyNecklace {
	
	enum RubyT {B, R, Y, G, N;}
	static List<Integer> lengths = new ArrayList<Integer>();

	public static void main(String[] args) {
		int length = 0;
		Scanner in = new Scanner(System.in);
        int b = Integer.parseInt(in.nextLine().trim());
        int r = Integer.parseInt(in.nextLine().trim());
        int y = Integer.parseInt(in.nextLine().trim());
        int g = Integer.parseInt(in.nextLine().trim());
        if(b == 0 && r == 0 && y == 0 && g == 0) {
        	System.out.println(length);
        }
        makeNecklace(0, b, r, y, g, RubyT.N);
        for(int i : lengths) {
        	if(length < i) {
        		length = i;
        	}
        }
        System.out.println(length);
	}
	
	private static void makeNecklace(int length, int b, int r, int y, int g, RubyT type) {
		if(b > 0 && (type == RubyT.B || type == RubyT.Y)) {
    		makeNecklace(++length, --b, r, y, g, RubyT.B);
    	}
		if(r > 0 && (type == RubyT.B || type == RubyT.Y)) {
    		makeNecklace(++length, b, --r, y, g, RubyT.R);
    	}
		if(g > 0 && (type == RubyT.G || type == RubyT.R)) {
    		makeNecklace(++length, b, r, y, --g, RubyT.G);
    	}
		if(y > 0 && (type == RubyT.G || type == RubyT.R)) {
    		makeNecklace(++length, b, r, --y, g, RubyT.G);
    	}
		if(b > 0 && type == RubyT.N) {
    		makeNecklace(++length, --b, r, y, g, RubyT.B);
    	}
    	if(r > 0 && type == RubyT.N) {
    		makeNecklace(++length, b, --r, y, g, RubyT.R);
    	}
    	lengths.add(length);
	}

}
