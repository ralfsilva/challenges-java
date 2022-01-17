package Desafios;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long n = 0;

		System.out.println("Digite um número e encontre o seu fatorial entre 1 e 10: ");
		long fat = input.nextLong();

		n = fat;

		for (long i = fat; i > 1; i--) {
			fat--;
			n = n * fat;
			System.out.println(n);
		}

		input.close();
	}
}
