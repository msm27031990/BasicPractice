package gladiators;
import java.io.IOException;
import java.util.Scanner;

public class Enemy {
	public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        int output = 0;
        int ip1 = Integer.parseInt(in.nextLine().trim());
        int ip2 = Integer.parseInt(in.nextLine().trim());
        String ip3 = in.nextLine().trim();
        String ip4 = in.nextLine().trim();
        output = appearanceCount(ip1,ip2,ip3,ip4);
    }
	
	private static int appearanceCount = 0;
	private static String sequence;
	public static int appearanceCount(int glyphsLength, int sequenceLength, String glyphs, String sequence){
		Enemy.sequence = sequence;
	    char[] glyphsArray = glyphs.toCharArray();
	    permute(glyphsArray, 0);
		return appearanceCount;
    }
	
	private static void permute(char[] a, int k){
        if (k == a.length){
        	StringBuffer s = new StringBuffer("");
        	for (int i = 0; i < a.length; i++){
                s.append(a[i]);
            }
        	String temp = new String(sequence);
			appearanceCount = appearanceCount + temp.split(s.toString(), -1).length - 1;
        } 
        else{
            for (int i = k; i < a.length; i++) {
                char temp = a[k];
                a[k] = a[i];
                a[i] = temp;
                permute(a, k + 1);
				temp = a[k];
                a[k] = a[i];
                a[i] = temp;
            }
        }
    }
	
}
