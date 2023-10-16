package termosSequencia;

import java.util.Scanner;

public class TermosSeq {
	
	private Scanner scanner;
	private int nTermos;
	
	public TermosSeq() {
		scanner = new Scanner(System.in);
		nTermos = 0;
	}
	
	public void entradaDados() {
		System.out.print("Digite o numero de termos: ");
		nTermos = scanner.nextInt();
	}
	
	public void gerarTermos() {
		int termo = 1;
		int termo2 = 4;
		int pulaLinha = 0;
		
		for(int smtr = 1;smtr <= nTermos;smtr++) {
			if(termo < 10) {
				System.out.print("0"+termo+",");
			} else {
				System.out.print(termo+",");
			}
			termo++;
			pulaLinha++;
			if(pulaLinha == 6) {
				System.out.println();
				pulaLinha = 0;
			}
			for(int smtr2 = 1;smtr < nTermos && smtr2 != 3;smtr++,smtr2++) {
				if(termo2 < 10) {
					System.out.print("0"+termo2+",");
				} else {
					System.out.print(termo2+",");
				}
				pulaLinha++;
				if(pulaLinha == 6) {
					System.out.println();
					pulaLinha = 0;
				}
			}
			termo2++;
		}
	}
}
