package Desafios;

import java.util.Scanner;

public class DesafioDistancia {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int resposta = input.nextInt();
		
		int tempoKm = 2 * resposta;
		
		System.out.printf("%d minutos\n", tempoKm);
		
		input.close();
	}
}
