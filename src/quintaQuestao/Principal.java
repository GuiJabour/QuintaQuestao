package quintaQuestao;

public class Principal {

	/*
	 * 5) Escreva um programa que inverta os caracteres de um string.
	 * 
	 * IMPORTANTE: a) Essa string pode ser informada através de qualquer entrada de
	 * sua preferência ou pode ser previamente definida no código; b) Evite usar
	 * funções prontas, como, por exemplo, reverse;
	 */
	public static void main(String[] args) {

		String palavra = "TargetSistemas";
		char palavraVet[];
		char palavraVetInvert[];
		
		palavraVet = palavra.toCharArray();
		palavraVetInvert = new char[palavraVet.length];
		
		int j = palavraVet.length - 1;
		
		for(int i = 0; i < palavraVet.length; i++) {
			palavraVetInvert[i] = palavraVet[j];
			j--;
		}
		
		System.out.println(palavraVetInvert);
		
	}

}
