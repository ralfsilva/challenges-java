package aplicattion;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class ProgramEmployee {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		Employee e1, e2;
		
		System.out.println("Dados do primeiro funcionário: ");
		String name1 = input.next();
		Double valuePerHour1 = input.nextDouble();
		Integer hours1 = input.nextInt();
		e1 = new Employee(name1, valuePerHour1, hours1);
		
		System.out.println("Dados do segundo funcionário: ");
		String name2 = input.next();
		Double valuePerHour2 = input.nextDouble();
		Integer hours2 = input.nextInt();
		e2 = new Employee(name2, valuePerHour2, hours2);
		
		double total = e1.payEmployee() + e2.payEmployee();
		
		System.out.printf("Total: %.2f", total);
		
		
		input.close();
	}
}
