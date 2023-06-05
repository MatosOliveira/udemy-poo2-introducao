/**
 * 
 */
package poo.application;

import java.util.Locale;
import java.util.Scanner;

import poo.entities.Employee;

/**
 * Classe de teste - Employee
 * 
 * @author Matos
 *
 */
public class ProgramEmployee {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee e = new Employee();
		
		System.out.print("Name: ");
		e.name = sc.nextLine();
		
		System.out.print("Gross Salary: ");
		e.grossSalary = sc.nextDouble();
		
		System.out.print("Tax: ");
		e.tax = sc.nextDouble();
		
		System.out.println("\nEmployee: " + e);
		
		System.out.print("\nWhich percentage to increase salary? ");
		double percentage = sc.nextDouble();
		e.increaseSalary(percentage);
		
		System.out.println("\nUpdated data: " + e);
		
		sc.close();

	}

}
