/**
 * 
 */
package poo.entities;

/**
 * Classe que le e exibe as informacoes de um funcionario (Nome, salario bruto e imposto). 
 * 
 * Calcula o aumento de salario com base na porcentagem fornecida.
 * 
 * @author Matos - 10.05.2023
 *
 */
public class Employee {
	
	public String name;
	public double grossSalary;
	public double tax;
		
	public double netSalary() {
		return grossSalary - tax;
	}
	
	public void increaseSalary(double percentage) {
		grossSalary += grossSalary * percentage / 100;
	}
	
	public String toString() {
		return name + ", $ " + String.format("%.2f", netSalary());
	}
}
