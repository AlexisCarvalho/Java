package apresenVetor;

import java.util.Scanner;

public class ApVetor {
	
	private Scanner scanner;
	private int[] vetor;
	
	public ApVetor() {
		scanner = new Scanner(System.in);
		vetor = new int[10];
	}
	
	public void entradaDados() {
		for(int smtr = 0;smtr < 10;smtr++) {
			System.out.println("Digite o "+(smtr+1)+"º numero: ");
			vetor[smtr] = scanner.nextInt();
		}
	}
	
	public void saidaDados() {
		exibeVetor(vetor);
	}
	
	private void exibeVetor(int[] vetor) {
		int pulaLinha = 0;
		for(int valor : vetor) {
			if(valor > 9) {
				System.out.print(valor+";");
				pulaLinha++;
			}else {
				System.out.print("0"+valor+";");
				pulaLinha++;
			}
			if(pulaLinha == 5) {
				System.out.println();
				pulaLinha = 0;
			}
		}
	}
}
