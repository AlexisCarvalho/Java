package maiorDeDez;

import java.util.Scanner;

public class MaiorDeDez {

	private Scanner scanner;
	private int[] numeros;
	
	public MaiorDeDez() {
		scanner = new Scanner(System.in);
		numeros = new int[10];
	}
	
	public void entradaDados() {
		for(int smtr = 0;smtr < 10;smtr++) {
			System.out.print("Digite o "+(smtr+1)+"º"+" numero: ");
			numeros[smtr] = scanner.nextInt();
		}
	}
	
	public int acharMaiorInteiros(int[] array) {
		int temp = 0;
		int smtr2 = 0;
		for(int smtr = 0;smtr < array.length;smtr++) {
			for(smtr2 = 0;smtr2 < array.length;smtr2++) {
				if(array[smtr] < array[smtr2]) {
					temp = array[smtr];
					array[smtr] = array[smtr2];
					array[smtr2] = temp;
				}
			}
		}
		return array[smtr2-1];
	}
	
	public void saidaDados() {
		int maiorNumero = acharMaiorInteiros(numeros);
		System.out.println("O maior numero e: "+maiorNumero);
	}
	
}
