package maiorQueCinquenta;

import java.util.Scanner;

public class MaiorCinquenta {
	
	private Scanner scanner;
	private int[] numeros;
	
	public MaiorCinquenta() {
		scanner = new Scanner(System.in);
		numeros = new int[20];
	}
	
	public void entradaDados() {
		for(int smtr = 0;smtr < numeros.length;smtr++) {
			System.out.print("Digite o "+(smtr+1)+"º"+" numero: ");
			numeros[smtr] = scanner.nextInt();
		}
	}
	
	public void saidaDados() {
		System.out.println("Existem "+retornarQuantMaiorQueNumero(numeros,50)+" numeros maiores que cinquenta");
	}
	
	public int retornarQuantMaiorQueNumero(int[] array, int numero) {
		int maiorQueNumero = 0;
			for(int smtr = 0;smtr < array.length;smtr++) {
				if(array[smtr] > numero) {
					maiorQueNumero++;
				}
			}
		return maiorQueNumero;
	}
}
