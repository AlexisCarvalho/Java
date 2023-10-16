package sequenciaPrimos;

import java.util.Scanner;

public class SequenciaPrimos {
	
	private Scanner scanner;
	private int tamSeque,primos,sequencia[];
	
	public SequenciaPrimos() {
		scanner = new Scanner(System.in);
		tamSeque = primos = 0;
	}
	
	public void entradaDados() {
		System.out.print("Digite o tamanho da sequencia: ");
		tamSeque = scanner.nextInt();
		sequencia = new int[tamSeque];
		for(int cnta = 0;cnta < tamSeque;cnta++) {
			System.out.print("Digite o "+(cnta+1)+"º numero da sequencia: ");
			sequencia[cnta] = scanner.nextInt();
		} 
	}
	
	public void numerosPrimos() {
		int temp = 0;
		for(int cnta = 0;cnta < tamSeque;cnta++) {
			for(int cnta2 = 0; cnta2 < tamSeque;cnta2++) {
				if((testaPrimo(sequencia[cnta])) && !(testaPrimo(sequencia[cnta2]))) {
					temp = sequencia[cnta2];
					sequencia[cnta2] = sequencia[cnta];
					sequencia[cnta] = temp;
				}
			}
		}
		for(int cnta = 0;cnta < tamSeque;cnta++) {
			if(testaPrimo(sequencia[cnta])){
				primos++;
			}
		}
	}
	
	public void saidaDados() {
		int espaco = 0;
		System.out.println("Numeros primos:");
		for(int cnta = 0;cnta < primos;cnta++) {
			if(sequencia[cnta] > 9) {
				System.out.print(sequencia[cnta]+";");
			} else {
				System.out.print("0"+sequencia[cnta]+";");
			}
			espaco++;
			if(espaco == 5) {
				System.out.println();
				espaco = 0;
			}
		}
		espaco = 0;
		System.out.println("\nNumeros não primos:");
		for(int cnta = primos;cnta < tamSeque;cnta++) {
			if(sequencia[cnta] > 9) {
				System.out.print(sequencia[cnta]+";");
			} else {
				System.out.print("0"+sequencia[cnta]+";");
			}
			espaco++;
			if(espaco == 5) {
				System.out.println();
				espaco = 0;
			}
		}
	}
	
	public boolean testaPrimo(int numero) {
		if(numero != 2 && numero != 3 && numero != 5 && numero != 7) {
			if(numero % 2 == 0 || numero == 1) {
				return false;
			}
			if(numero % 3 == 0) {	
				return false;
			}
			if(numero % 5 == 0) {	
				return false;	
			}
			if(numero % 7 == 0) {
				return false;
			}
		} 
		return true;
	}	
}
