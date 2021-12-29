//package Desafios;
//
//import java.util.Scanner;
//
//public class DesafioPlanoCartesiano {
//	public static void main(String[] args) {
//
//		Scanner input = new Scanner(System.in);
//		
//		boolean plano = true;
//		int x, y;
//		
//		while (plano) {
//			System.out.println("Digite o valor de X: ");
//			x = input.nextInt();
//			
//			System.out.println("Digite o valor de Y: ");
//			y = input.nextInt();
//			
//			if (x == 0 || y == 0) {
//				System.out.println("Valor Nulo!");
//				plano = false;
//			} else if (x <= 0 && y >= 0) {
//				System.out.println("Segundo Quadrante!");
//				plano = false;
//			} else if (x <= 0 && y <= 0) {
//				System.out.println("Terceiro Quadrante!");
//				plano = false;
//			} else if (x >= 0 && y <= 0) {
//				System.out.println("Quarto Quadrante!");
//				plano = false;
//			} else if (x >= 0 && y >= 0) {
//				System.out.println("Primeiro Quadrante!");
//				plano = false;
//			}
//		}
//		
//		input.close();
//	}
//}

import java.util.Scanner;

public class DesafioPlanoCartesiano {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();
		
		while (x != 0 && y != 0) {
			if (x > 0 && y > 0) {
				System.out.println("primeiro");
			}
			else if (x < 0 && y > 0) {
				System.out.println("segundo");
			}
			else if (x < 0 && y < 0) {
				System.out.println("terceiro");
			}
			else {
				System.out.println("quarto");
			}
			x = sc.nextInt();
			y = sc.nextInt();
		}
		
		sc.close();
	}
}



