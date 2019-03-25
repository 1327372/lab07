package 1327372_lab07;

//Import the Scanner.
import java.util.Scanner;

public class 1327372_lab07_q3 {

	// Copying me gets us both zero. Just use this as inspiration.
	
	
	// Enable the scanner.
	static Scanner inputScanner = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare required variables.
		int numEmp = 0;
		// Ask the user for the number of employees.
		System.out.println("Please enter the number of employees in the database:");
		numEmp = inputScanner.nextInt();

		// Declare the array of employees.
		Employee[] emp = new Employee[numEmp];

		// Run the required methods.
		enterData(emp);
		printReport(emp);
	}

	// Method to get the employee's info.
	public static void enterData(Employee[] database) {
		// Declare required variables.
		int salary = 0;
		// Loop to get the employees information.
		for (int i = 0; i < database.length; i++) {
			// State the employee number.
			System.out.println("\nEmployee " + (i + 1));
			// Ask for their name
			System.out.println("Please enter the employee's first name:");
			String fName = inputScanner.next();
			System.out.println("Please enter the employee's last name:");
			String lName = inputScanner.next();
			// Get their ID number.
			System.out.println("Please enter the employee's ID number:");
			int ID = inputScanner.nextInt();
			System.out.println("Please enter the employee's salary:");
			salary = inputScanner.nextInt();
			// Loop to ensure a valid salary.
			while (salary < 0) {
				System.out.println("Invalid input. Please enter a valid salary:");
				salary = inputScanner.nextInt();
			}
			database[i] = new Employee(fName, lName, ID, salary);
		}
	}
	// Method to print out the database.
	public static void printReport(Employee[] database) {
		System.out.println("\nReport for all employees:");
		// Use a for loop to index through all employees.
		for (int i = 0; i < database.length; i++) {
			database[i].printInfo();
		}
	}
}

class Employee {
	// Member variables.
	String m_firstName;
	String m_lastName;
	int m_ID;
	int m_salary;

	// Member method for employee.
	public Employee(String fName, String lName, int ID, int salary) {
		// Assign the employee's info.
		m_firstName = fName;
		m_lastName = lName;
		m_ID = ID;
		m_salary = salary;
	}

	// Member method to print the info.
	public void printInfo() {
		// Output the employee's info.
		System.out.println("Name: " + m_firstName + " " + m_lastName + ", ID: " + m_ID + ", Salary: " + m_salary);
	}
}