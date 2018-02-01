import java.util.Scanner;

public class DriverApp {
    public static Patient patient;
	public static void main(String[] args) {
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

}
