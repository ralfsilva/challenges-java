package Desafios;

import java.util.Scanner;

public class DesafioProdSimples {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		int b = input.nextInt();
		
		int PROD = a * b;
		
		System.out.printf("PROD = %d\n", PROD);
		
		input.close();
	}
}
