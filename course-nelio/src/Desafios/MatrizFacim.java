package Desafios;

import java.util.Locale;
import java.util.Scanner;

public class MatrizFacim {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		System.out.println("Whats is the order of matrix?");
		int n = input.nextInt();
		
		double[][] matrix = new double[n][n];
		
		System.out.println("Enter the matrix values: ");
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = input.nextDouble();
			}
		}
		
		double sum = 0.0;
		
		// for (int i = 0; i < n; i++){
		// 		sum += matrix[i][i];
		// }
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i] == matrix[j]) {
					sum += matrix[i][j];
				}
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.printf("Sum of the main diagonal = %.1f", count);
		
		input.close();
	}
}




