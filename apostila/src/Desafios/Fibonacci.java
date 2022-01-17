package Desafios;

public class Fibonacci {
	
	public static void main(String[] args) {
		
		int max = 30;
		int a = 0;
		int b = 1;
		int aux;
		

		for (int i = 0; i < max; i++) {
			System.out.print(a + ", ");
			aux = a;
			a = a + b;
			b = aux;
		}
		
	}
}
