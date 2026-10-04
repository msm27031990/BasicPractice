package gladiators;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class HidingChristmassGifts {

	private static List<Integer> items;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] mainString = in.nextLine().trim().split(" ");
        int n = Integer.parseInt(mainString[0]);
        int m = Integer.parseInt(mainString[1]);
        int[][] roads = new int[n-1][2];
        for(int i = 0; i < n - 1; i++) {
        	String[] temp = in.nextLine().trim().split(" ");
        	roads[i][0] = Integer.parseInt(temp[0]);
        	roads[i][1] = Integer.parseInt(temp[1]);
        }
        int[][] paths = new int[m][2];
        for(int i = 0; i < m; i++) {
        	String[] temp = in.nextLine().trim().split(" ");
        	paths[i][0] = Integer.parseInt(temp[0]);
        	paths[i][1] = Integer.parseInt(temp[1]);
        }
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < n; i++) {
        	map.put(i+1, 0);
        }
        for(int i = 0; i < m; i++) {
        	int start = paths[i][0];
        	int end = paths[i][1];
        	int current = 0;
        	items = new ArrayList();
    		items.add(start);
    		road(start, roads, end, start);
    		//System.out.println(items);
    		for(Integer tempInt : items) {
    			map.put(tempInt, (map.get(tempInt) + 1));
    		}
        }
        int max = 0;
        for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
        	if(entry.getValue() > max) {
        		max = entry.getValue();
        	}
        }
        System.out.println(max);
	}
	
	private static boolean road(int start, int[][] paths, int end, int prev) {
		if(start == end) {
			return true;
		}
		for(int i = 0; i < paths.length; i++) {
        	if(paths[i][0] == start && paths[i][1] != prev) {
        		if(road(paths[i][1], paths, end, start)) {
        			items.add(paths[i][1]);
        			return true;
        		}
        	}
        	if(paths[i][1] == start && paths[i][0] != prev) {
        		if(road(paths[i][0], paths, end, start)) {
        			items.add(paths[i][0]);
        			return true;
        		}
        	}
        }
		return false;
	}

}
