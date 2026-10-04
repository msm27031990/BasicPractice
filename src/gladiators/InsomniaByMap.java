package gladiators;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * The Sheep class solves the problem of determining the last number a sheep counts
 * before it has seen all digits (0-9) at least once in its multiples.
 */
public class InsomniaByMap {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int inputs[] = null;
		try {
			// Read the number of test cases
			int i = Integer.parseInt(br.readLine());
			if (i < 0) {
				return;
			}
			inputs = new int[i];
			// Read each test case input
			for (int counter = 0; counter < i; counter++) {
				inputs[counter] = Integer.parseInt(br.readLine());
			}
		} catch (NumberFormatException nfe) {
			System.err.println("Invalid Format!");
		}
		// Process each test case and print the result
		for (int counter = 0; counter < inputs.length; counter++) {
			System.out.println("Case #" + (counter + 1) + ": " + findlast(inputs[counter]));
		}
	}

	/**
	 * Finds the last number a sheep counts before it has seen all digits (0-9) at least once.
	 *
	 * @param number The input number for which the last number is to be determined.
	 * @return The last number or "INSOMNIA" if the input number is 0.
	 */
	private static Object findlast(Integer number) {
		if (number == 0) {
			return "INSOMNIA";
		}
		// Map to track whether each digit (0-9) has been seen
		Map<Integer, Boolean> allInt = new HashMap<>();
		for (int i = 0; i < 10; i++) {
			allInt.put(i, false);
		}
		int multiply = 1;
		Integer tempNumber = 0;
		// Multiply the number until all digits are seen
		do {
			tempNumber = number * multiply;
			System.out.println(tempNumber);
			multiply++;
			// Mark digits of the current number as seen
			for (int i = 0; i < tempNumber.toString().length(); i++) {
				allInt.put(findIntChar(i + 1, tempNumber), true);
			}
		} while (!checkAllInt(allInt)); // Continue until all digits are seen
		return tempNumber;
	}

	/**
	 * Checks if all digits (0-9) have been seen.
	 *
	 * @param allInt A map tracking the digits seen so far.
	 * @return true if all digits have been seen, false otherwise.
	 */
	private static boolean checkAllInt(Map<Integer, Boolean> allInt) {
		for (int i = 0; i < 10; i++) {
			if (!allInt.get(i)) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Extracts the digit at a specific position in a number.
	 *
	 * @param pos The position of the digit (1-based index).
	 * @param number The number from which the digit is to be extracted.
	 * @return The digit at the specified position.
	 */
	private static int findIntChar(int pos, Integer number) {
		return Integer.parseInt((number.toString().charAt(pos - 1)) + "");
	}
}