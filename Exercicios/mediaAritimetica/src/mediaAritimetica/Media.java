package mediaAritimetica;

import java.util.Scanner;

public class Media {
	
	private Scanner scanner;
	private double[] vetor;
	private double media;
	
	public Media() {
		scanner = new Scanner(System.in);
		vetor = new double[4];
		media = 0;
	}
	
	public void entradaDadosVetor() {
		for (int smtr = 0; smtr < vetor.length; smtr++) {
			System.out.print("Digite o " + (smtr + 1) + "º numero real: ");
			vetor[smtr] = scanner.nextInt();
		}
	}
	
	private double mediaVetor(double[] vetor) {
		double soma, media;
		soma = media = 0;

		for (int smtr = 0; smtr < vetor.length; smtr++) {
			soma += vetor[smtr];
		}
		media = soma / vetor.length; 
		return media;
	}
	
	public void saidaDados() {
		media = mediaVetor(vetor);
		System.out.println("Media: "+media);
		System.out.print("Situacao: ");
		if (media < 3) {
			System.out.println("Reprovado");
		} else if (media >=3 && media < 7) {
			System.out.println("Nota media");
		} else {
			System.out.println("Aprovado");
		}
	}

}
