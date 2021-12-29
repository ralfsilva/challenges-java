package aplicattion;

public class ProgramForEach {
	public static void main(String[] args) {
		
		String[] vect = new String[] {"Maria", "João", "Jonas"};
		
		for (int i = 0; i < vect.length; i++) {
			System.out.println(vect[i]);
		}
		
		System.out.println("----------------");
		
		// para cada objeto nome contido em vect faça
		for (String nome : vect) { // (tipo apelido : coleção)
			System.out.println(nome);
		}
	}
}
