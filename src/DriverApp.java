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
		
		
		

	}

}
