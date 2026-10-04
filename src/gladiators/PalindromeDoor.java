package gladiators;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PalindromeDoor {
	
	public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        int output = 0;
        int ip1 = Integer.parseInt(in.nextLine().trim());
        String ip2 = in.nextLine().trim();
        output = openingRightDoor(ip1,ip2);
        System.out.println(String.valueOf(output));
        in.close();
    }
	
	public static int openingRightDoor(int input1,String input2){
		String reverse = reverse(input2);
		if(input2.equals(reverse)){
			return 0;
		}
		System.out.println(reverse);
		String lcs = lcs(input2, reverse);
		System.out.println("Common: " + lcs);
		String replaced = input2.replaceAll(lcs, " ");
		replaced = replaced.replaceAll(reverse(lcs), " ");
		System.out.println("Replaced: " + replaced);
		boolean atStart = replaced.startsWith(" ");
		boolean atEnd = replaced.endsWith(" ");
		String[] arrayTemp = replaced.split(" ");
		for (String string : arrayTemp) {
			System.out.println("array " + string);
		}
		List<String> finalArray = new ArrayList<String>();
		for (String string : arrayTemp) {
			finalArray.add(string);
		}
		if(atStart){
			finalArray.set(0, "");
		}
		if(atEnd){
			finalArray.add("");
		}
		String array[] = new String[finalArray.size()];
		for(int i = 0; i < finalArray.size(); i++){
			array[i] = finalArray.get(i);
		}
		int counter = 0;
		for(int i = 0, j = array.length - 1; i <= j ; i++, j--){
			if(i != j){
				counter += incrementCounter(array[i], array[j]);
			}else{
				if(array[i].length() == 1){
					break;
				}
				if(array[i].length() % 2 != 0){
					String left = array[i].substring(0, array[i].length() / 2);
					String right = array[i].substring(array[i].length() / 2, array[i].length());
					counter += incrementCounter(left, right);
				}else{
					String left = array[i].substring(0, array[i].length() / 2);
					String right = array[i].substring((array[i].length() / 2) + 1 , array[i].length());
					counter += incrementCounter(left, right);
				}
			}
		}
	    return counter;
    }
	
	private static int incrementCounter(String left, String right){
		int counter = 0;
		right = reverse(right);
		int min = left.length() > right.length() ? right.length() : left.length() ;
		for(int i = 0; i < min; i++){
			if(!(left.charAt(i) == right.charAt(i))){
				counter += 2;
			}
		}
		int max = left.length() < right.length() ? right.length() : left.length();
		return counter + (max - min);
	}
	
	private static String reverse(String string){
		StringBuffer retString = new StringBuffer("");
		if(null != string && !string.equals("")){
			for(int i = string.length() -1 ; i >= 0 ; i--){
				retString.append(string.charAt(i));
			}
		}
		return retString.toString();
	}

    public static String lcs(String str1, String str2){
        int l1 = str1.length();
        int l2 = str2.length();
        int[][] arr = new int[l1 + 1][l2 + 1];
        int len = 0, pos = -1;
        for (int x = 1; x < l1 + 1; x++)
        {
            for (int y = 1; y < l2 + 1; y++)
            {
                if (str1.charAt(x - 1) == str2.charAt(y - 1))
                {
                        arr[x][y] = arr[x - 1][y - 1] + 1;
                        if (arr[x][y] > len)
                        {
                            len = arr[x][y];
                            pos = x;
                        }               
                }
                else
                    arr[x][y] = 0;
            }
        }        
        return str1.substring(pos - len, pos);
    }

}
