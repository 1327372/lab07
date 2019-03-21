package 1327372_lab07;

// Import the scanner.
import java.util.Scanner;

public class 1327372_lab07_q2 {
	
	// Copying me gets us both zero. Just use this as inspriation.

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare required variables.
		double[][] matrix1 = new double[3][3];
		double[][] matrix2 = new double[3][3];
		double[][] result = new double[3][3];
		char userChoice = ' ';

		// Enable the scanner.
		Scanner inputScanner = new Scanner(System.in);

		// Greet the user and ask the to populate the first matrix.
		System.out.println("Welcome! Please populate the first 3x3 matrix:");
		populateMatrix(matrix1);
		printMatrix(matrix1);
		// Then ask the user to populate the second matrix.
		System.out.println("\nPlease populate the second 3x3 matrix:");
		populateMatrix(matrix2);
		printMatrix(matrix2);
		
		// Create the loop structure of the program.
		while (true) {

			// Now create the menu for the user,
			System.out.println("\n******************************");
			System.out.println("** Please choose an option: **");
			System.out.println("******************************");
			System.out.println("a. Add");
			System.out.println("b. Subtract");
			System.out.println("c. Multiply");
			System.out.println("d. Exit");
			System.out.print("\nOption: ");

			// Get the users choice from the menu.
			userChoice = inputScanner.next().charAt(0);

			// Use a switch to determine the required action.
			switch (userChoice) {
			case 'a':
				// If the user chooses 'a', run the adding method.
				addMatrices(matrix1, matrix2, result);
				// Run the matrix into the print method.
				System.out.println("Adding...");
				printMatrix(result);
				break;
			case 'b':
				// If the user chooses 'b', run the subtracting method.
				subtractMatrices(matrix1, matrix2, result);
				// Run the matrix into the print method.
				System.out.println("Subtracting...");
				printMatrix(result);
				break;
			case 'c':
				// If the user chooses 'c', run the multiplying method.
				multiplyMatrices(matrix1, matrix2, result);
				// Run the matrix into the print method.
				System.out.println("Multiplying...");
				printMatrix(result);
				break;
			case 'd':
				// If the user chooses 'd', say goodbye and exit.
				System.out.println("Goodbye!");
				// Close the scanner.
				inputScanner.close();
				System.exit(0);
				break;
			}
		}
	}

	// Method to populate a matrix.
	public static void populateMatrix(double[][] matrix) {
		// Enable the scanner.
		Scanner inputScanner = new Scanner(System.in);
		// First for loop goes across the rows.
		for (int i = 0; i < 3; i++) {
			// Second for loop goes down the columns.
			for (int j = 0; j < 3; j++) {
				// Get the input for each individual element.
				System.out.print("Enter a real number for element (" + (i + 1) + ", " + (j + 1) + "): ");
				matrix[i][j] = inputScanner.nextDouble();
			}
		}
	}

	// Method to display a matrix.
	public static void printMatrix(double[][] matrix) {
		// Display the matrix for the user.
		System.out.println("\nThe resulting matrix is:");
		// First for loop goes across the rows.
		for (int i = 0; i < 3; i++) {
			// Second for loop goes down the columns.
			for (int j = 0; j < 3; j++) {
				// Output each individual element.
				System.out.print(matrix[i][j]);
				// Use a for loop to display the correct amount of spaces between each number.
				for (int k = Double.toString(matrix[i][j]).length(); k < 8; k++) {
					System.out.print(" ");
				}
			}
			// Make the output go to the next line.
			System.out.print("\n");
		}
	}

	// Method to add two matrices.
	public static void addMatrices(double[][] matrix1, double[][] matrix2, double[][] result) {
		// First for loop goes across the rows.
		for (int i = 0; i < 3; i++) {
			// Second for loop goes down the columns.
			for (int j = 0; j < 3; j++) {
				// Compute the addition for each individual part of the matrix.
				result[i][j] = matrix1[i][j] + matrix2[i][j];
			}
		}
	}

	// Method to subtract two matrices.
	public static void subtractMatrices(double[][] matrix1, double[][] matrix2, double[][] result) {
		// First for loop goes across the rows.
		for (int i = 0; i < 3; i++) {
			// Second for loop goes down the columns.
			for (int j = 0; j < 3; j++) {
				// Compute the subtraction for each individual part of the matrix.
				result[i][j] = matrix1[i][j] - matrix2[i][j];
			}
		}
	}

	// Method to multiply two matrices.
	public static void multiplyMatrices(double[][] matrix1, double[][] matrix2, double[][] result) {
		// First for loop goes across the rows.
		for (int i = 0; i < 3; i++) {
			// Second for loop goes down the columns.
			for (int j = 0; j < 3; j++) {
				// Sum the products across/down each row/column for each resulting element.
				for (int k = 0; k < 3; k++) {
					result[i][j] += matrix1[i][k] * matrix2[k][j];
				}
			}
		}
	}
}
