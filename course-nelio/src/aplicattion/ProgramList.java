package aplicattion;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProgramList {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Ralf");
		list.add("Maria");
		list.add("Alex");
		list.add("Ana");
		list.add(1, "Velane"); // adicionando um elemento na posição 1
		list.add(5, "Marrone");
		
		System.out.println(list.size());

		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("-------------------");
		
		list.removeIf(x -> x.charAt(0) == 'M'); // Função Lambda
		
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("-------------------");
		System.out.println("Index of Velane: " + list.indexOf("Velane"));
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		System.out.println("-------------------");
		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());  // demonstração de elementos da lista com a inicial 'A'.
		// para isso, a lista foi transformada em stream (função lambda), e depois foi filtrado para encontrar o 'A' inicial, e no fim, sendo convertido novamente para lista
		
		for (String x : result) {
			System.out.println(x);
		}
		
		System.out.println("-------------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);

	}
}











