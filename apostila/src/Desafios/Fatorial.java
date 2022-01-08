package Desafios;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n, sum = 0;

		System.out.println("Digite um número e encontre o seu fatorial entre 1 e 10: ");
		int fat = input.nextInt();

		n = fat;

		for (int i = fat; i > 1; i--) {
			fat--;
			n = n * fat;
		}

		System.out.println(n);

		input.close();
	}
}
