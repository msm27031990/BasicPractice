package gladiators;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RubyNecklaceWR {
	
	enum RubyT {B, R, Y, G;}
	static List<Integer> lengths = new ArrayList<Integer>();
	static int length = 0;

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
        int b1 = Integer.parseInt(in.nextLine().trim());
        int r1 = Integer.parseInt(in.nextLine().trim());
        int y1 = Integer.parseInt(in.nextLine().trim());
        int g1 = Integer.parseInt(in.nextLine().trim());
        if(b1 == 0 && r1 == 0 && y1 == 0 && g1 == 0) {
        	System.out.println(length);
        }
        boolean ruby = true;
        RubyT type = null;
        int b = b1;
        int r = r1;
        int y = y1;
        int g = g1;
        boolean sr = false;
        boolean sb = false;
        boolean sy = false;
        boolean sg = false;
        if(b > 0) {
        	length++;
        	type = RubyT.B;
        	b--;
        	sb = true;
        }else if(r > 0) {
        	length++;
        	type = RubyT.R;
        	r--;
        	sr = true;
        	sb = true;
        }
        else if(y > 0) {
        	length++;
        	type = RubyT.Y;
        	y--;
        	sy = true;
        	sr = true;
        	sb = true;
        }
        else if(g > 0) {
        	length++;
        	type = RubyT.G;
        	g--;
        	sg = true;
        	sy = true;
        	sr = true;
        	sb = true;
        }
        while(ruby) {
        	boolean found = false;
        	if(b > 0 && (type == RubyT.B || type == RubyT.Y)) {
        		length++;
        		b--;
        		type = RubyT.B;
        		found = true;
        		continue;
        	}
    		if(r > 0 && (type == RubyT.B || type == RubyT.Y)) {
        		length++;
        		r--;
        		type = RubyT.R;
        		found = true;
        		continue;
        	}
    		if(g > 0 && (type == RubyT.G || type == RubyT.R)) {
        		length++;
        		g--;
        		type = RubyT.G;
        		found = true;
        		continue;
        	}
    		if(y > 0 && (type == RubyT.G || type == RubyT.R)) {
        		length++;
        		y--;
        		type = RubyT.G;
        		found = true;
        		continue;
        	}
    		/*if(b > 0 && type == RubyT.N) {
        		length++;
        		b--;
        		type = RubyT.B;
        		found = true;
        	}
        	if(r > 0 && type == RubyT.N) {
        		length++;
        		r--;
        		type = RubyT.R;
        		found = true;
        	}*/
        	if(!found) {
        		lengths.add(length);
            	length = 0;
            	b = b1;
                r = r1;
                y = y1;
                g = g1;
        		if(!sg) {
        			if(g > 0) {
        	        	length++;
        	        	type = RubyT.G;
        	        	g--;
        	        }
        			sg = true;
        		}else if(!sy) {
        			if(y > 0) {
        	        	length++;
        	        	type = RubyT.Y;
        	        	y--;
        	        }
        			sy = true;
        		}else if(!sr) {
        			if(r > 0) {
        	        	length++;
        	        	type = RubyT.R;
        	        	r--;
        	        }
        			sr = true;
        		}else if(!sb) {
        			if(b > 0) {
        	        	length++;
        	        	type = RubyT.B;
        	        	b--;
        	        }
        			sb = true;
        		}else {
        			ruby = false;
        		}
        	}
        }
        for(int i : lengths) {
        	if(length < i) {
        		length = i;
        	}
        }
        System.out.println(length);
	}
	
	/*private static boolean makeNecklace(int length, int b, int r, int y, int g, RubyT type) {
		if(b > 0 && (type == RubyT.B || type == RubyT.Y)) {
    		//makeNecklace(++length, --b, r, y, g, RubyT.B);
    		return true;
    	}
		if(r > 0 && (type == RubyT.B || type == RubyT.Y)) {
    		//makeNecklace(++length, b, --r, y, g, RubyT.R);
    		return true;
    	}
		if(g > 0 && (type == RubyT.G || type == RubyT.R)) {
    		//makeNecklace(++length, b, r, y, --g, RubyT.G);
    		return true;
    	}
		if(y > 0 && (type == RubyT.G || type == RubyT.R)) {
    		//makeNecklace(++length, b, r, --y, g, RubyT.G);
    		return true;
    	}
		if(b > 0 && type == RubyT.N) {
    		//makeNecklace(++length, --b, r, y, g, RubyT.B);
    		return true;
    	}
    	if(r > 0 && type == RubyT.N) {
    		//makeNecklace(++length, b, --r, y, g, RubyT.R);
    		return true;
    	}
    	lengths.add(length);
    	return false;
	}*/
	
	/*class Necklace{
		int length;
		int b;
		int r;
		int y;
		int g;
		RubyT type;
		public Necklace(int length, int b, int r, int y, int g, RubyT type) {
			this.length = length;
			this.b = b;
			this.r = r;
			this.y = y;
			this.g= g;
			this.type = type;
		}
		public int getLength() {
			return length;
		}
		public void setLength(int length) {
			this.length = length;
		}
		public int getB() {
			return b;
		}
		public void setB(int b) {
			this.b = b;
		}
		public int getR() {
			return r;
		}
		public void setR(int r) {
			this.r = r;
		}
		public int getY() {
			return y;
		}
		public void setY(int y) {
			this.y = y;
		}
		public int getG() {
			return g;
		}
		public void setG(int g) {
			this.g = g;
		}
		public RubyT getType() {
			return type;
		}
		public void setType(RubyT type) {
			this.type = type;
		}
	}*/

}
