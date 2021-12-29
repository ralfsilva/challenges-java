package Desafios;

public class FuncaoSplit {
	public static void main(String[] args) {
		
		String s = "potato apple lemon";
		
		String[] vect = s.split(" ");
		String word1 = vect[0]; // guardando o vetor 0 em uma variável
		
		System.out.println(word1);
		System.out.println(vect[1]);
		System.out.println(vect[2]);
 	}
}
