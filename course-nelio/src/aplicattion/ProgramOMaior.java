package aplicattion;

import java.util.Scanner;

public class ProgramOMaior {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		
		double maiorAB = (a + b + Math.abs(a - b))/2;
		
		if (c > maiorAB) {
			System.out.printf("%d eh o maior\n", c);
		} else if (maiorAB > c){
			System.out.printf("%d eh o maior\n", (int) maiorAB);
		}
		
		input.close();
	}
}
