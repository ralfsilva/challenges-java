package Desafios;

import java.util.Locale;
import java.util.Scanner;

public class DesafioConsumo {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		int x = input.nextInt();
		double y = input.nextDouble();
		
		double combustivelGasto = x/y;
		
		System.out.printf("%.3f km/l", combustivelGasto);
		
		input.close();
	}
}
