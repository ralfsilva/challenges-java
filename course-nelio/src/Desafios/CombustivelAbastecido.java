package Desafios;

import java.util.Scanner;

public class CombustivelAbastecido {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int resposta = 0;
		int clientes = 0;
		int cont = 0;
		
		System.out.println("Digite quantos Clientes vão abastecer: ");
		clientes = input.nextInt();
		
		while (cont < clientes) {
			int alcool = 0;
			int gasolina = 0;
			int diesel = 0;
			
			System.out.println("Digite qual combustivel Combustivel vai abastecer: \n1 - Álcool \n2 - Gasolina \n3 - Diesel \n4 - Fim");
			resposta = input.nextInt();
			cont++;
			
			if (resposta == 1) {
				alcool++;
				System.out.println("Alcool: " + alcool);
			} else if (resposta == 2) {
				gasolina++;
				System.out.println("Gasolina: " + gasolina);
			} else if (resposta == 3) {
				diesel++;
				System.out.println("Diesel: " + diesel);
			} else if (resposta == 4) {
				System.out.println("MUITO OBRIGADO");
				break;
			}
		}
		
		
		input.close();
	}
}
