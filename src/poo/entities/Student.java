/**
 * 
 */
package poo.entities;

/**
 * Classe que le o nome e as tres notas que ele obteve nos tres primeiros trimestres do ano. Criterio:
 * - 1 Trimestre: 30.00
 * - 2 Trimestre: 35.00
 * - 3 Trimestre: 35.00
 * 
 * Ao final, exibir a nota total do aluno e se ele foi aprovado (PASS) ou nao (FAILED - neste caso mostrar quantos pontos
 * faltaram para obter a nota mínima = 60%). 
 * 
 * @author Matos
 *
 */
public class Student {

	public String name;
	public double grade1;
	public double grade2;
	public double grade3;
	
	public double finalGrade() {
		return grade1 + grade2 + grade3;
	}
	
	public double missingPoints() {
		if(finalGrade() < 60) {
			return 60.0 - finalGrade();
		} else {
			return 0.0;
		}
	}
	
}
