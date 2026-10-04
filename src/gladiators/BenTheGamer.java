package gladiators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Scanner;

public class BenTheGamer {

	static int weapons = -1;
	public static void main(String[] args) {
		BenTheGamer b = new BenTheGamer();
		Scanner in = new Scanner(System.in);
        String input = in.nextLine().trim();
        int levels = -1;
        int coins = 0;
        if(null != input) {
        	levels = Integer.parseInt(input.split(" ")[0]);
            weapons = Integer.parseInt(input.split(" ")[1]);
        }else {
        	System.out.println(coins);
        	in.close();
        	return;
        }
        List<Level> levelArr = new ArrayList<Level>();
        for(int i = 0; i < levels; i++) {
        	levelArr.add(b.new Level(in.nextLine().trim()));
        }
        Collections.sort(levelArr, (o1, o2) -> {
        	Level l1 = (Level) o1;
        	Level l2 = (Level) o2;
        	return Integer.compare(l1.index, l2.index);
        });
        List<Level> adjustedLevelArr = new ArrayList<Level>();
        Level min;
        adjustedLevelArr.add(levelArr.get(0));
        levelArr.remove(0);
        for(int i = 0; i <levels -1; i++) {
        	min = adjustedLevelArr.get(adjustedLevelArr.size() - 1);
        	ListIterator<Level> iter = levelArr.listIterator();
        	int minNew = -1;
        	Level tempMin = null;
            while(iter.hasNext()) {
            	Level next = iter.next();
            	int newCounter = 0;
            	for(int j = 0; j < weapons; j++) {
    				if(next.val.charAt(j) == '1' && next.val.charAt(j) == min.val.charAt(j)) {
    					newCounter++;
    				}
    			}
            	if(minNew != -1) {
            		if(minNew > newCounter) {
            			minNew = newCounter;
            			tempMin = next;
            		}
            	}else {
            		minNew = newCounter;
            		tempMin = next;
            	}
            }
            levelArr.remove(tempMin);
            adjustedLevelArr.add(tempMin);
        }
        Map<Integer, Boolean> map = new HashMap<Integer, Boolean>();
        for(int i = 0; i < levels; i++) {
        	//System.out.println(levelArr.get(i).val);
        	int newWeapons = 0;
        	for(int j = 0; j < weapons; j++) {
				if(adjustedLevelArr.get(i).val.charAt(j) == '1') {
					if(!map.containsKey(j)) {
						newWeapons++;
						map.put(j, false);
					}
				}
			}
        	coins = coins + (newWeapons * newWeapons);
        }
      System.out.println(coins);
      in.close();
	}
	
	class Level{
		int index = 0;
		String val;
		Level(String val){
			this.val = val;
			for(int i = 0; i < weapons; i++) {
				if(val.charAt(i) == '1') {
					index++;
				}
			}
		}
	}

}
