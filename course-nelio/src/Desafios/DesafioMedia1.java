package Desafios;

import java.util.Locale;
import java.util.Scanner;

public class DesafioMedia1 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		double nota1 = input.nextDouble();
		double nota2 = input.nextDouble();
		
		double media = ((nota1 * 3.5) + (nota2 * 7.5))/11;
		
		System.out.printf("MEDIA = %.5f\n", media);
		
		input.close();
	}
}
