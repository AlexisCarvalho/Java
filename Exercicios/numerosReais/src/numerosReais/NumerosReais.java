package numerosReais;

import java.util.Scanner;

public class NumerosReais {

	private Scanner scanner;
	private double[] vetor;
	private double media, soma;

	public NumerosReais() {
		scanner = new Scanner(System.in);
		vetor = new double[10];
		media = soma = 0;
	}

	public void entradaDados() {
		for (int smtr = 0; smtr < 10; smtr++) {
			System.out.print("Digite o " + (smtr + 1) + "º numero real: ");
			vetor[smtr] = scanner.nextDouble();
		}
	}

	public void somaMedia() {
		for (int smtr = 0; smtr < vetor.length; smtr++) {
			soma += vetor[smtr];
		}
		media = soma / vetor.length;
	}

	public void saidaDados() {
		System.out.println("A soma de todos os numeros e: " + soma);
		System.out.println("A media dos numeros e: " + media);
	}
}
