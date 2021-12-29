package Desafios;

import java.util.Locale;
import java.util.Scanner;

public interface DistanciaDoisPontos {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		String x1y1 = input.nextLine();
		String x2y2 = input.nextLine();
		
		String[] xy1 = x1y1.split(" ");
		String[] xy2 = x2y2.split(" ");
		
		double x1 = Double.parseDouble(xy1[0]);
		double y1 = Double.parseDouble(xy1[1]);
		
		double x2 = Double.parseDouble(xy2[0]);
		double y2 = Double.parseDouble(xy2[1]);
		
		double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		
		System.out.printf("%.4f\n", distancia);

		input.close();
	}
}
