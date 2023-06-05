/**
 * 
 */
package poo.util;

/**
 * Classe que le a cotacao do dolar, e depois um valor em dolares a ser comprado por uma pessoa em reais.
 * 
 * Informar quantos reais a pessoa vai pagar pelos dolares, considerando ainda que a pessoa terá que pagar
 * 6% de IOF sobre o valor em dolar.
 * 
 * @author Matos - 12.05.2023
 *
 */
public class CurrencyConverter {

	public static final double IOF = 6.00;
	
	public static double calculaValorDolarReais(double valorDolar, double cotacaoDolar) {
		return (valorDolar * cotacaoDolar) * 1.06;
	}
	
}
