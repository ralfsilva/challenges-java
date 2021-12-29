package Desafios;

import java.util.Scanner;

public class For {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int N = input.nextInt();
		
		int soma = 0;
		for (int i = 0; i < N; i++) {
			// lógica
			int x = input.nextInt();
			soma = soma + x;
			System.out.println("X: " + x + "\nSoma: " + soma);
		}
		
		
		
		input.close();
	}
}
