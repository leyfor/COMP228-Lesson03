import java.security.SecureRandom;
import java.util.Scanner;

public class DriverApp {
    public static Patient patient;
	public static void main(String[] args) {
		
		System.out.println(rollDice(3, 6));
		
		RandomInteger();
		RandomNumbers();
		
		Scanner input = new Scanner(System.in); 
		
		System.out.print("Please enter your First Name: ");
		String patientFName = input.nextLine();
		
		System.out.print("Please enter your Last Name: ");
		String patientLName = input.nextLine();
		
		System.out.print("Please enter your Address: ");
		String patientAdress = input.nextLine();
		
		System.out.print("Please enter your City: ");
		String patientCity = input.nextLine();
		
		System.out.print("Please enter your Province: ");
		String patientProvince = input.nextLine();
		
		System.out.print("Please enter your Postal code: ");
		int patientPCode = input.nextInt();
		
		patient = new Patient();
		
		patient.set_firstName(patientFName);
		patient.set_lastName(patientLName);
		patient.set_address(patientAdress);
		patient.set_city(patientCity);
		patient.set_province(patientProvince);
		patient.setPostalCode(patientPCode);
		
		patient.getPatientInfo();
		
		System.out.print("Enter three floating-point values separated by spaces: ");
		
		double number1 = input.nextDouble(); // read first double
		double number2 = input.nextDouble(); // read second double
		double number3 = input.nextDouble(); // read third double
		

	}
	
	//return the maximum of its three double parameters
	public static double maximum(double first, double second, double third) {
		
		double maximumValue = first; // Assume x is the largest to start
		
		// determine whether y is greater than maximumValue
		if(second > maximumValue) {
			maximumValue = second;
		}
		
		
		//determine whether z is greater than maximumValue
		if(third > maximumValue) {
			maximumValue = third;
		}
		
		// Can also be writing as follows:
		
		// Math.max(first, Math.max(second, third));
		
		
		return maximumValue;
		
	}
	
	public static void RandomInteger() {
		
		// randomNumbers object will produce secure random numbers
		SecureRandom randomNumbers = new SecureRandom();
		
		// loop 20 times
		for (int counter = 1; counter < 20; counter = counter + 1) {
			// pick random integer from 1 to 6
			int face = 1 + randomNumbers.nextInt(6);
			
			System.out.printf("%d ", face); // display generated value
			
			// if counter is divisible by 5, start a new line of output
			
			if(counter % 5 == 0) {
				System.out.println();
			}
		}
	}
	
	public static void RandomNumbers() {
		SecureRandom generateRandom = new SecureRandom();
		int die1 = 0;
		int die2 = 0;
		int dice = 0;
		
		//  generate a number between 2 and 12;
		die1 = generateRandom.nextInt(6) + 1;
		die2 = generateRandom.nextInt(6) + 1;
		
		dice = die1 + die2;
		
		System.out.println(dice);
	}
	
	public static int rollDice(int numDice, int numSides) {
		SecureRandom generateRandom = new SecureRandom();
		int result = 0;
		//int[] dice = new int[numDice];
		
		for (int index = 0; index <= numDice - 1; index = index + 1 ) {
			result += generateRandom.nextInt(numSides) + 1;
		}
		
		return result;
	}

}
