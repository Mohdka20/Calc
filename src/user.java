import java.util.Scanner;


public class user {
	
	private static Scanner keyboard = new Scanner(System.in);
	
	
	public static int inputInteger() {
		boolean isInputBad = true;
		boolean hasNextInt;
		int value = 0;
		while(isInputBad) {
			hasNextInt = keyboard.hasNextInt();
			if(hasNextInt) {
				value = keyboard.nextInt();
				isInputBad = false; // break out of loop
			}
			else {
				System.out.print("Invalid input. Enter an integer number: ");
			}
			keyboard.nextLine(); // clean up input stream
		}
		return value;
	}
	
	/*
	 * This method prompts the user using the argument sent to message
	 *  and then calls to method inputInteger() to get the actual input value.
	 */
	public static int inputInteger(String message) {
		// This method calls inputInteger(), so no changes are needed here.
		System.out.printf("%s", message);
		int value = inputInteger(); 
		return value;
	}
	
	/*
	 * Does not prompt the user, reads in a double value when there is one. If
	 * the user does not provide input that can be converted into a double an
	 * error message is printed requesting a correct input and a loop is used
	 * to trap the user until they get this right. A future version of 
	 * the program might have a sanity check to break the loop after several 
	 * failed attempts and then shut down the program, rather than looping
	 * (in theory) forever.
	 */
	public static double inputDouble() {
		boolean isInputBad = true;
		boolean hasNextDouble;
		double value = 0.0;
		while(isInputBad) {
			hasNextDouble = keyboard.hasNextDouble();
			if(hasNextDouble) {
				value = keyboard.nextDouble();
				isInputBad = false; // break out of loop
			}
			else {
				System.out.print("Invalid input. Enter a number: ");
			}
			keyboard.nextLine(); // clean up input stream
		}
		return value;	
	}
	
	/*
	 * This method prompts the user using the argument sent to message
	 *  and then calls to method inputDouble() to get the actual input value.
	 */
	public static double inputDouble(String message) {
		// This method calls inputDouble(), so no changes are needed here.
		System.out.printf("%s", message);
		double value = inputDouble();
		return value;
	}
	
	/*
	 * this method is used to get a line of text from the console, it reads
	 * until it encounters a line terminator character.
	 */
	public static String inputString() {
		String value = keyboard.nextLine();
		return value;
	}
	
	/*
	 * This method prompts the user using the argument sent to message, 
	 * then calls to method inputString() which reads in the actual text.
	 */
	public static String inputString(String message) {
		System.out.printf("%s", message);
		String value = inputString();
		return value;
	
}
	
}