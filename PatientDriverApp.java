/*
 * Class: CMSC203-22824
 * Instructor: Ahmed Tarek
 * Description: Driver class that uses information from Parent and Procedure to generate informative output
 * Due: 10/1/2024
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Owen Peter Sorge
*/
import java.text.DecimalFormat;
public class PatientDriverApp {
	public static void main(String[] args) {
		Patient patient = new Patient("Owen", "Peter", "Sorge", "456 Somewhere Ave.", "Sometown", "MD", "12345", "987-654-3210", "Some Guardian", "012-345-6789");
		Procedure proc1 = new Procedure("Triple Heart Bypass", "10/1/2024");
		proc1.setPractitioner("John Doe");
		proc1.setProcedureCharge(62000.98);
		Procedure proc2 = new Procedure("Cataract Surgery", "9/13/2024", "John Doe", 1234.56);
		Procedure proc3 = new Procedure("Hernia Repair", "9/14/2024", "John Doe", 2345.67);
		System.out.println(patient.toString());
		System.out.println("\n" + proc1.toString());
		System.out.println("\n" + proc2.toString());
		System.out.println("\n" + proc3.toString());
		DecimalFormat df = new DecimalFormat("#,###.00");
		System.out.println("\nTotal Charges: $" + df.format(calculateTotalCharges(proc1, proc2, proc3)));
		System.out.println("\nStudent Name: Owen Sorge\nMC#: M21165639\nDue Date: 10/1/2024");
	}
	//Sums the charges of each procedure and returns it
	public static double calculateTotalCharges(Procedure p1, Procedure p2, Procedure p3) {
		return p1.getProcedureCharge() + p2.getProcedureCharge() + p3.getProcedureCharge();
	}
}
