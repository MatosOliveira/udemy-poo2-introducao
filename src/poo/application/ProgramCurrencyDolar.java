/**
 * 
 */
package poo.application;

import java.util.Locale;
import java.util.Scanner;

import poo.util.CurrencyConverter;

/**
 * Classe de teste - CurrencyConverter
 * 
 * @author Matos - 12.05.2023
 *
 */
public class ProgramCurrencyDolar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double cotacao = sc.nextDouble();
		
		System.out.print("How many dollar will be bought? ");
		double valorDolar = sc.nextDouble();
		
		System.out.printf("Amount to be paid in real = %.2f%n", CurrencyConverter.calculaValorDolarReais(valorDolar, cotacao));
		
		sc.close();

	}

}
