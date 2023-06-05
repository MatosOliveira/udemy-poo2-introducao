/**
 * 
 */
package poo.application;

import java.util.Locale;
import java.util.Scanner;

import poo.entities.Student;

/**
 * Classe de teste - Student
 * 
 * @author Matos
 *
 */
public class ProgramStudent {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Student student = new Student();

		student.name = sc.nextLine();
		student.grade1 = sc.nextDouble();
		student.grade2 = sc.nextDouble();
		student.grade3 = sc.nextDouble();

		if (student.finalGrade() >= 60.0) {
			System.out.printf("FINAL GRADE = %.2f%n", student.finalGrade());
			System.out.println("PASS");
		} else {
			System.out.printf("FINAL GRADE = %.2f%n", student.finalGrade());
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n ", student.missingPoints());
		}
		
		sc.close();

	}

}
