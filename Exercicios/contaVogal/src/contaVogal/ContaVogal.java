package contaVogal;

import java.util.Scanner;

public class ContaVogal {
	
	private Scanner scanner;
	private char[] caracteres;
	private int vogais;
	
	public ContaVogal() {
		scanner = new Scanner(System.in);
		caracteres =  new char[15];
		vogais = 0;
	}

	public void entradaDadosVetor() {
		for (int smtr = 0; smtr < caracteres.length; smtr++) {
			System.out.print("Digite a " + (smtr + 1) + "ª letra: ");
			caracteres[smtr] = scanner.next().charAt(0);
		}
	}
	
	public void contaVogal() {
		for(char letra : caracteres) {
			if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
				vogais++;
			}
		}
	}
	
	public void saidaDados() {
		System.out.println("A quantidade de vogais e: "+vogais);
	}
}
