package gladiators;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class BobTheBear {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int salmons = Integer.parseInt(in.nextLine().trim());
        if(salmons < 1) {
        	System.out.println("0");
        	in.close();
        	return;
        }
        int[] length = new int[salmons];
        int[] position = new int[salmons];
        String[] lengthString = in.nextLine().trim().split(" ");
        String[] positionString = in.nextLine().trim().split(" ");
        int tempLength = 0;
        int tempPosition = 0;
        int maxReqLen = 0;
        for(int i = 0; i < salmons; i++) {
        	tempLength = Integer.parseInt(lengthString[i]);
        	tempPosition = Integer.parseInt(positionString[i]);
        	length[i] = tempLength;
        	position[i] = tempPosition;
        	if((tempLength + tempPosition) > maxReqLen) {
        		maxReqLen = tempLength + tempPosition;
        	}
        }
        System.out.println("maxReqLen" + maxReqLen);
        byte[][] river = new byte[salmons][maxReqLen];
        for(int i = 0; i < salmons; i++) {
        	int counter = length[i];
        	for(int j = position[i]; counter > 0; j++) {
            	river[i][j] = 1;
            	counter--;
            }
        }
        for(int i = 0; i < salmons; i++) {
        	for(int j = 0; j < maxReqLen; j++) {
            	//System.out.print(river[i][j]);
            }
        	//System.out.println("");
        }
        StringBuilder fishIndex = null;
        List<String> fishIndexes = new ArrayList<String>();
        for(int j = 0; j < maxReqLen; j++) {
        	fishIndex = new StringBuilder("");
        	for(int i = 0; i < salmons; i++) {
            	if(river[i][j] == 1) {
            		fishIndex.append(i + "-");
            	}
            }
        	if(!fishIndex.equals("")) {
        		fishIndexes.add(fishIndex.toString());
        	}
        }
        //System.out.println("fishIndexes" + fishIndexes);
        int size = fishIndexes.size();
        if(size < 1) {
        	System.out.println(0);
        	in.close();
        	return;
        }
        if(size < 2) {
        	String one = fishIndexes.get(0);
        	Set<String> set = new HashSet<String>();
        	for(String s : one.split("-")) {
        		set.add(s);
        	}
        	System.out.println(set.size());
        	in.close();
        	return;
        }
        int maxFishCount = 0;
        for(int i = 0; i < size - 1; i++) {
        	for(int j = i + 1; j < size; j++) {
        		System.out.println(i + " " + (j));
            	String one = fishIndexes.get(i);
            	String two = fishIndexes.get(j);
            	Set<String> set = new HashSet<String>();
            	for(String s : one.split("-")) {
            		set.add(s);
            	}
            	for(String s : two.split("-")) {
            		set.add(s);
            	}
            	if(maxFishCount < set.size()) {
            		maxFishCount = set.size();
            	}
            }
        }
        System.out.println("maxFishCount" + maxFishCount);
        in.close();
	}

}
