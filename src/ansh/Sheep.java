package ansh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Sheep {

	public static void main(String[] args) throws IOException { 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inputs[] = null;
        try{
            int i = Integer.parseInt(br.readLine());
            if(i < 0){
            	return;
            }
            inputs = new int[i];
            for(int counter = 0; counter < i; counter++){
            	inputs[counter] = Integer.parseInt(br.readLine());
            }
        }catch(NumberFormatException nfe){
            System.err.println("Invalid Format!");
        }
        for(int counter = 0; counter < inputs.length; counter++){
        	System.out.println("Case #" + (counter+1) + ": " + findlast(inputs[counter]));
        }
    }
	
	private static Object findlast(Integer number){
		if(number == 0){
			return "INSOMNIA";
		}
		Map<Integer, Boolean> allInt = new HashMap<Integer, Boolean>();
		for(int i = 0; i < 10; i++){
			allInt.put(i, false);
		}
		int multiply = 1;
		Integer tempNumber = 0;
		do{
			tempNumber = number * multiply;
			System.out.println(tempNumber);
			multiply++;
			for(int i = 0; i < tempNumber.toString().length(); i++){
				allInt.put(findIntChar(i + 1, tempNumber), true);
			}
		}while(!checkAllInt(allInt));
		return tempNumber;
	}
	
	private static boolean checkAllInt(Map<Integer, Boolean> allInt){
		for(int i = 0; i < 10; i++){
			if(allInt.get(i) == false)
				return false;
		}
		return true;
	}
	
	private static int findIntChar(int pos, Integer number){
		return Integer.parseInt((number.toString().charAt(pos - 1))+"");
	}
	
}
