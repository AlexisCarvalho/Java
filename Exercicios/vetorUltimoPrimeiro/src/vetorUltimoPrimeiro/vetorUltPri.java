package vetorUltimoPrimeiro;

import java.util.Scanner;

public class vetorUltPri {
	Scanner scanner;
	int[] vetor;

	public vetorUltPri() {
		scanner = new Scanner(System.in);
		vetor = new int[10];
	}

	public void entradaDados() {
		for (int smtr = 0; smtr < 10; smtr++) {
			System.out.println("Digite o " + (smtr + 1) + "º numero: ");
			vetor[smtr] = scanner.nextInt();
		}
	}
	
	public void saidaDados() {
		exibeVetor(vetor);
	}

	private void exibeVetor(int[] vetor) {
		int pulaLinha = 0;
		for (int smtr = (vetor.length-1); smtr >= 0; smtr--) {

			if (vetor[smtr] > 9) {
				System.out.print(vetor[smtr] + ";");
				pulaLinha++;
			} else {
				System.out.print("0" + vetor[smtr] + ";");
				pulaLinha++;
			}
			if (pulaLinha == 5) {
				System.out.println();
				pulaLinha = 0;
			}
		}
	}
}
