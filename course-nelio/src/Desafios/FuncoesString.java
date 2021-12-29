package Desafios;

public class FuncoesString {
	public static void main(String[] args) {
		
		String original = "abcde FGHIJ ABC abc DEFG   ";
		
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim(); // eliminou os espaços ao fim da String
		String s04 = original.substring(2);
		String s05 = original.substring(2, 17); // endIndex (último caracter + 1), vai recortar do 17 para trás
		String s06 = original.replace('a', 'x');
		String s07 = original.replace("abc","xyz");
		int i = original.indexOf("bc"); // primeira ocorrência do bc
		int j = original.lastIndexOf("bc"); // ultima ocorrência do bc
		
		System.out.println("Original: -" + original + "-");
		System.out.println("ToLowerCase: -" + s01 + "-");
		System.out.println("ToUpperCase: -" + s02 + "-");
		System.out.println("Trim: -" + s03 + "-");
		System.out.println("Substring: -" + s04 + "-");
		System.out.println("Substring: -" + s05 + "-");
		System.out.println("Replace: -" + s06 + "-");
		System.out.println("Replace: -" + s07 + "-");
		System.out.println("IndexOf(\"bc\"): " + i);
		System.out.println("lastIndexOf(\"bc\"): " + j);
	}
}
