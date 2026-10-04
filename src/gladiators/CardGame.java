package gladiators;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CardGame {
	
	
	
	public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        String output;
        int ip1 = Integer.parseInt(in.nextLine().trim());
        int ip2 = Integer.parseInt(in.nextLine().trim());
        String ip3 = in.nextLine().trim();
        String ip4 = in.nextLine().trim();
        output = combinationOfCards(ip1,ip2,ip3,ip4);
        System.out.println(String.valueOf(output));
    }

	private static boolean[] cards;
	private static List<String> steps = new ArrayList<String>();
	
	public static String combinationOfCards(int input1,int input2,String input3,String input4){
		String[] whites = new String[2];
		String[] blacks = new String[2];
		boolean checkWhites = false;
		boolean checkBlacks = false;
		if(!input3.equals("-1")){
			whites = input3.split(",");
			checkWhites = true;
		}
		if(!input4.equals("-1")){
			blacks = input4.split(",");
			checkBlacks = true;
		}
		//find all possible steps
		char set[] = {'1', '2', '3', '4'};
		getAllKLengthRec(set, "", 4, input2);
		/*for (String string : steps) {
			System.out.println(string);
		}*/
		List<String> results = new ArrayList<String>();
		for (String step : steps) {
			boolean allWhiteGood = true;
			boolean allBlackGood = true;
			initialize(input1);
			execute(step);
			if(checkWhites){
				for (String index : whites) {
					//System.out.println(index);
					if(!cards[Integer.parseInt(index) - 1] == true){
						allWhiteGood = false;
					}
				}
			}
			if(checkBlacks){
				for (String index : blacks) {
					//System.out.println(index);
					if(!cards[Integer.parseInt(index) - 1] == false){
						allBlackGood = false;
					}
				}
			}
			boolean both = false;
			if((checkWhites && checkBlacks)){
				both = true;
			}
			if(both){
				if((checkWhites && allWhiteGood) && (checkBlacks && allBlackGood)){
					results.add(prepare());
					System.out.println("blaP");
				}
			}else{
				if((checkWhites && allWhiteGood)){
					results.add(prepare());
					System.out.println("blaB");
				}
				if((checkBlacks && allBlackGood)){
					results.add(prepare());
					System.out.println("blaN");
				}
			}
			
		}
		Collections.sort(results);
		StringBuffer finalResult = new StringBuffer("");
		for (String string : results) {
			finalResult.append(string);
			finalResult.append("#");
		}
		finalResult.deleteCharAt(finalResult.length()-1);
	   return finalResult.toString();
    }
	
	private static void execute(String steps){
		for(int i = 0; i < steps.length(); i++){
			switch (steps.charAt(i)) {
			case '1':
				step1();
				break;
			case '2':
				step2();
				break;
			case '3':
				step3();
				break;
			case '4':
				step4();
				break;
			}
		}
	}
	
	private static void step1(){
		for(int i = 0; i< cards.length; i++){
			flip(i);
		}
	}
	
	private static void step2(){
		for(int i = 0; i< cards.length; i++){
			if((i + 1) % 2 != 0){
				flip(i);
			}
		}
	}
	
	private static void step3(){
		for(int i = 0; i< cards.length; i++){
			if((i + 1) % 2 == 0){
				flip(i);
			}
		}
	}
	
	private static void step4(){
		for(int i = 0; i < cards.length; ){
			flip(i);
			i = i + 3;
		}
	}
	
	private static void flip(int i){
		if(cards[i] == true){
			cards[i] = false;
		}else{
			cards[i] = true;
		}
	}
	
	private static void initialize(int size){
		cards = new boolean[size];
		for(int i = 0; i< size; i++){
			cards[i] = true; 
		}
	}

	private static void getAllKLengthRec(char set[], String prefix, int n, int k) {
		if (k == 0) {
			steps.add(prefix);
			return;
		}
		for (int i = 0; i < n; ++i) {
			String newPrefix = prefix + set[i]; 
			getAllKLengthRec(set, newPrefix, n, k - 1); 
		}
	}
	
	private static String prepare(){
		StringBuffer result = new StringBuffer("");
		for (boolean b : cards) {
			if(b){
				result.append("1");
			}else{
				result.append("0");
			}
		}
		return result.toString();
	}
}
