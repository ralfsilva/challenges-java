package Desafios;

import java.util.Scanner;

public class DesafioGastoCombustivel {
	public static void main(String[] args) {
 		 
		        Scanner input = new Scanner(System.in);
		        
		        double tempoGasto = input.nextDouble();
		        double velocidadeMedia = input.nextDouble();
		        
		        double qtdLitros = (tempoGasto * velocidadeMedia) / 12;
		        
		        System.out.printf("%.3f%n", qtdLitros);
		        
		        input.close();
		 
	}
}
