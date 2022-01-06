package Desafios;

import java.util.Scanner;

public class IdadeEmDias {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int dias = input.nextInt();
		int ano = 0;
		int mes = 0;
		int dia = 0;
		
		while (dias >= 365) {
			dias -= 365;
			ano++;
		}
		while (dias >= 30) {
			dias -= 30;
			mes++;
		}
		while (dias != 0) {
			dias--;
			dia++;
		}
		
		System.out.printf("%d ano(s)%n", ano);
		System.out.printf("%d mes(es)%n", mes);
		System.out.printf("%d dia(s)%n", dia);
		
		input.close();
	}
}
