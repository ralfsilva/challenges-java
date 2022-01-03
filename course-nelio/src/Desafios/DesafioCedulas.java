package Desafios;

import java.util.Scanner;

public class DesafioCedulas {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
//		int n = N;
//		int oneHundred = 0, fifty = 0, twenty = 0, ten = 0, five = 0, two = 0, one = 0;
//
//		if (N > 0 && N < 1000000) {
//			while (N >= 100) {
//				N -= 100;
//				oneHundred++;
//			}
//			if (N >= 50 && N < 100) {
//				N -= 50;
//				fifty++;
//			}
//			if (N >= 20 && N < 50) {
//				N -= 20;
//				twenty++;
//			}
//			if (N >= 10 && N < 20) {
//				N -= 10;
//				ten++;
//			}
//			if (N >= 5 && N < 10) {
//				N -= 5;
//				five++;
//			}
//			if (N >= 2 && N < 5) {
//				N -= 2;
//				two++;
//			}
//			if (N > 0 && N < 2) {
//				N -= 1;
//				one++;
//			}
//		}
//
//		System.out.printf("%d%n", n);
//		System.out.printf("%d nota (s) de R$ 100,00%n", oneHundred);
//		System.out.printf("%d nota (s) de R$ 50,00%n", fifty);
//		System.out.printf("%d nota (s) de R$ 20,00%n", twenty);
//		System.out.printf("%d nota (s) de R$ 10,00%n", ten);
//		System.out.printf("%d nota (s) de R$ 5,00%n", five);
//		System.out.printf("%d nota (s) de R$ 2,00%n", two);
//		System.out.printf("%d nota (s) de R$ 1,00%n", one);

		
		// Resolução Alternativa
		System.out.println(N);
		System.out.println(N / 100 + " nota (s) de R$ 100,00");
		N %= 100;
		System.out.println(N / 50 + " nota (s) de R$ 50,00");
		N %= 50;
		System.out.println(N / 20 + " nota (s) de R$ 20,00");
		N %= 20;
		System.out.println(N / 10 + " nota (s) de R$ 10,00");
		N %= 10;
		System.out.println(N / 5 + " nota (s) de R$ 5,00");
		N %= 5;
		System.out.println(N / 2 + " nota (s) de R$ 2,00");
		N %= 2;
		System.out.println(N / 1 + " nota (s) de R$ 1,00");
		
		input.close();
	}
}
