package gladiators;
import java.io.IOException;
import java.util.Scanner;

public class JailBreak {
	public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        int output = 0;
        int ip1 = Integer.parseInt(in.nextLine().trim());
        int ip2 = Integer.parseInt(in.nextLine().trim());
        int ip3_size = 0;
        ip3_size = Integer.parseInt(in.nextLine().trim());
        int[] ip3 = new int[ip3_size];
        int ip3_item;
        for(int ip3_i = 0; ip3_i < ip3_size; ip3_i++) {
            ip3_item = Integer.parseInt(in.nextLine().trim());
            ip3[ip3_i] = ip3_item;
        }
        output = GetJumpCount(ip1,ip2,ip3);
        System.out.println(String.valueOf(output));
    }

    public static int GetJumpCount(int jump,int slide,int[] walls){
	    int jumpCount = 0;
	    for(int counter = 0; counter < walls.length; counter ++){
	        int wall = walls[counter];
	        if(wall <= jump){
	            jumpCount++;
	            continue;
	        }else{
	            int tempHeight = wall;
	            while(true){
	                if(tempHeight > jump){
	                    tempHeight = tempHeight - jump + slide;
	                    jumpCount++;
	                }else{
	                    jumpCount++;
	                    break;
	                }
	            }
	        }
	    }
	    return jumpCount;
    }
}
