package Desafios;

import java.util.Scanner;

public class OperadorBitwise {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int mask = 0b100000; // 32
		int n = input.nextInt();
		
		if ((n & mask) != 0) {
			System.out.println("6th bit is true!");
		} else {
			System.out.println("6th bit is false!");
		}
		
		
		input.close();
	}
}
