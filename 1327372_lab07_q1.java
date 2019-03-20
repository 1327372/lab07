package 1327372_lab07;

//Import the scanner.
import java.util.Scanner;

public class 1327372_lab07_q1 {

	// Copying me gets us both zero. Just use this as inspriation.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare required variables.
		int numInputs = 0;

		// Enable the scanner.
		Scanner inputScanner = new Scanner(System.in);

		// Ask the user how many inputs they want.
		System.out.println("Please enter the desired amount of inputs:");
		numInputs = inputScanner.nextInt();

		// Declare the array.
		String inputs[] = new String[numInputs];

		// Begin to fill the array.
		System.out.println("\nPlease enter strings to populate the array.");
		// Loop to get their inputs.
		for (int i = 0; i < numInputs; i++) {
			System.out.println("Please enter string #" + (i + 1) + ":");
			inputs[i] = inputScanner.next();
		}
		
		// Run the array through the sorting method.
		sortLength(inputs);

		System.out.println("\nThe array in order of length from smallest to largest is:");
		//Output the array.
		for (int j = inputs.length - 1;  j >= 0 ; j--) {
			System.out.println(inputs[j]);
		}
	}

	// Method to sort the strings.
	public static void sortLength(String[] inputs) {
		//Go through each array string.
		for (int i = inputs.length - 1; i >= 0; i--) {
			//For each string, check how long it is and put them in order.
			for (int j = 0; j < i; j++) {
				if (inputs[j].length() < inputs[j + 1].length()) {
					//Create a placeholder variable to hold a string.
					String temp = inputs[j + 1];
					//Swap the two strings.
					inputs[j + 1] = inputfs[j];
					inputs[j] = temp;
				}
			}
		}
	}
}
