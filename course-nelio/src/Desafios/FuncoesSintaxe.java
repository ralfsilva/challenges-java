package Desafios;

import java.util.Scanner;

public class FuncoesSintaxe {
	public static void main(String[] args) {
		
		double x = 25.0;
		double y = Math.sqrt(x);
		System.out.println("Raiz Quadrada: " + y + "\n");
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter three numbers: ");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		
		int higher = max(a, b, c);
		
		showResult(higher);
		
		input.close();
	}
	
	public static int max(int x, int y, int z) {
		int aux;
		if(x > y && x > z) {
			aux = x;
		} else if (y > x && x > z) {
			aux = y;
		} else {
			aux = z;
		}
		return aux;
	}
	
	public static void showResult(int value) { // A função aqui não precisa retornar nada, apenas imprimir na tela o resultado, por isso ela é void
		System.out.printf("Higher = %d", value);
	}
	
}




