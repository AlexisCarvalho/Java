package impares30;

import java.util.Scanner;

public class Impares30 {
	
	private Scanner scanner;
	private int[] vetor;
	private int impar;
	
	public Impares30() {
		scanner = new Scanner(System.in);
		vetor = new int[30];
		impar = 0;
	}
	
	public void entradaDados() {
		System.out.println("--Digite 30 numeros inteiros--");
		for(int cnta = 0;cnta < 30;cnta++) {
			System.out.print("Entre com o "+(cnta+1)+"º numero: ");
			vetor[cnta] = scanner.nextInt();
		}
	}
	
	public void enconImpar() {
		for(int cnta = 0;cnta < 30;cnta++) {
			if(vetor[cnta] % 2 != 0) {
				impar++;
			}
		}
	}
	
	public void saidaDados() {
		System.out.println("--Existem "+impar+" numeros impares--");
	}
}
