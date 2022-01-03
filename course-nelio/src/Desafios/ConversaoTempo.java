package Desafios;

import java.util.Scanner;

public class ConversaoTempo {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int seg = input.nextInt();
		int min = 0;
		int hora = 0;
		
		min = seg/60;
		min = min % 60;
		hora = seg/3600;
		
		System.out.printf("%d:%d:%d%n", hora, min, seg%60);
		
		input.close();
	}
}
