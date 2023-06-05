/**
 * 
 */
package poo.entities;

/**
 * Classe que le os valores de entrada (largura e altura) e calcula area, perimetro e diagonal. 
 * 
 * @author Matos - 10.05.2023
 *
 */
public class Rectangle {

	public double width;
	public double height;
	
	public Double area() {
		return width * height;
	}
	
	public Double perimeter() {
		return 2 * (width + height);
	}
	
	public Double diagonal() {
		return Math.sqrt(width * width + height * height);
	}
}
