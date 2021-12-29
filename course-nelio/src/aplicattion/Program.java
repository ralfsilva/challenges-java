package aplicattion;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		Triangle x, y; // Váriaveis x e y do tipo Triangle
		x = new Triangle(); // Instanciando os objetos
		y = new Triangle();
		
		System.out.println("Enter the measures of Triangle x: ");
		
		// Fazendo a leitura dos dados e armazenando em cada um dos atributos do objeto x
		x.a = input.nextDouble(); 
		x.b = input.nextDouble();
		x.c = input.nextDouble();
		
		System.out.println("Enter the measures of Triangle x: ");
		y.a = input.nextDouble();
		y.b = input.nextDouble();
		y.c = input.nextDouble();
	
		double areaX = x.area(); // chamada do método que vai calcular cada um dos triangles
		double areaY = y.area();
		
		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);
		
		if (areaX > areaY) {
			System.out.println("Larger area: X");
		} else {
			System.out.println("Larger area: Y");
		}
		
		input.close();
	}
}




