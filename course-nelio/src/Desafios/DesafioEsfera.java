package Desafios;

import java.util.Scanner;

public class DesafioEsfera {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double pi = 3.14159;
		
		double raio = input.nextDouble();
		
		double volume = (4.0/3.0) * pi * raio * raio * raio;
		
		System.out.printf("VOLUME = %.3f\n", volume);
		
		input.close();
	}
}
