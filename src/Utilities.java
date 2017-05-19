import java.util.Scanner;

public class Utilities{
	
	/**
	 * Ask the user for an integer within certain bounds, returns the exit value if entered
	 * @param prompt: prompt to display to the user
	 * @param min: minimum value
	 * @param max: maximum  value
	 * @param exit: exit value
	 * @return: the valid value entered by the user, or the exit value
	 */
	public static int inputInt(String prompt, int min, int max, int exit){
		Scanner in = new Scanner(System.in);
		int input = 0;
		
		System.out.print(prompt);
		input = in.nextInt();
		
		// Make sure the value is either in bound or the exit value
		while ( (input < min || input > max) && input != exit){
			System.out.println("Error, the number has to be between " + min + " and " + max + ".");
			System.out.print(prompt);
			input = in.nextInt();
		}
	
		// Clean up and exit
		in.close();
		return input;
	}
	
	
	/**
	 * Ask the user for a double within certain bounds, returns the exit value if entered
	 * @param prompt: prompt to display to the user
	 * @param min: minimum value
	 * @param max: maximum  value
	 * @param exit: exit value
	 * @return: the valid value entered by the user, or 0 is the exit character was entered.
	 */
	public static double inputDouble(String prompt, double min, double max, double exit){
		Scanner in = new Scanner(System.in);
		double input = 0.0;
		final double EPSILON = 1E-14;
		
		System.out.print(prompt);
		input = in.nextDouble();
		
		// Make sure the value is either in bound or the exit value
		// EPSILON is used as precision margin for the comparison with the exit value
		while ( (input < min || input > max) && Math.abs(input - exit) > EPSILON) {
			System.out.println("Error. The number has to be bbetween " + min + " and " + max + ".");
			System.out.print(prompt);
			input = in.nextDouble();
		}
			
		// Clean up and exit
		in.close();
		return input;
	}
	
	/**
	 * Ask the user for a String of a certain length, returns the exit value is entered.
	 * @param prompt: prompt to display to the user
	 * @param min: minimum number of characters
	 * @param max: maximum number of characters
	 * @param exit: exit value
	 * @return: returns the valid string entered by the user, returns the exit value if entered
	 */
	public static String inputString(String prompt, int min, int max, String exit){
		String input = "";
		Scanner in = new Scanner(System.in);
		
		System.out.print(prompt);
		input = in.nextLine();
		
		// Make sure the sting has the right length
		while ( (input.length() < min || input.length() > max) && input.equals(exit) == false){
			System.out.println("Error. The entry has to be between " + min + " and " + max + " characters long.");
			System.out.print(prompt);
			input = in.nextLine();
		}
		
		// Clean up and Exit
		in.close();
		return input;
	}
	
	/**
	 * Ask the user for an alphabetical char, returns the exit value if entered
	 * @param prompt: prompt to display to the user
	 * @param exit: exit value, do not choose an alphabetical char.
	 * @return: the char entered by the user, returns the exit value if entered.
	 */
	public static char inputChar(String prompt, char exit){
		String input = "";
		char returnValue = '\n';
		Scanner in = new Scanner(System.in);
		
		System.out.print(prompt);
		input = in.nextLine();
		returnValue = input.charAt(0);
		
		// Make sure the char is alphabetical
		while ( !((returnValue >= 'A' && returnValue <= 'Z') || (returnValue >='a' && returnValue <= 'z')) && returnValue != exit){
			System.out.println("Error. The character has to be an alphabetical character (i.e. a letter from a to z).");
			System.out.print(prompt);
			input = in.nextLine();
			returnValue = input.charAt(0);
		}
		
		// Clean up and Exit
		in.close();
		return returnValue;
	}
}