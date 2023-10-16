package conjuntoMult35;

import java.util.Scanner;

public class Conjunto {
	
	private Scanner scanner;
	private int tamanhoConj;
	private int[] conjunto;
	private boolean zero;
	
	public Conjunto(){
		scanner = new Scanner(System.in);
		tamanhoConj = 0;
		zero = false;
	}
	
	public void entradaDados() {
		System.out.print("Digite o tamanho do conjunto: ");
		tamanhoConj = scanner.nextInt();
		conjunto = new int[tamanhoConj];
		for(int cnta = 0;cnta < tamanhoConj;cnta++) {
			System.out.print("Digite o "+(cnta+1)+" valor: ");
			conjunto[cnta] = scanner.nextInt();
		}
	}
	
	public void exibirMult53() {
		int pulaLinha = 0;
		int temp = 0;
		for(int zro = 0;zro < tamanhoConj;zro++) {
			if(conjunto[zro] == 0) {
				zero = true;	
			}
		}
		for(int numero = 0;numero < tamanhoConj;numero++) {
			for(int repetido = 0;repetido < tamanhoConj;repetido++) {			
				if(conjunto[numero] == conjunto[repetido] && numero != repetido) {
					conjunto[numero] = 0;
				}
				if(conjunto[numero] < conjunto[repetido]) {
					temp = conjunto[numero];
					conjunto[numero] = conjunto[repetido];
					conjunto[repetido] = temp;
				}
			}	
		}
		
		System.out.println("Multiplos de 3:");
		if(zero) {
			System.out.print("00;");
		}
		pulaLinha = 0;
		for(int cnta = 0;cnta < tamanhoConj;cnta++) {
			if(conjunto[cnta] % 3 == 0 && conjunto[cnta] != 0) {
				if(conjunto[cnta] > 9) {
					System.out.print(conjunto[cnta]+";");
				} else {	
					System.out.print("0"+conjunto[cnta]+";");
				}
				pulaLinha++;
				if(pulaLinha == 5) {
					System.out.println();
				}	
			}
		}
		
		System.out.println("\nMultiplos de 5:");			
		if(zero) {
			System.out.print("00;");
		}
		for(int cnta = 0;cnta < tamanhoConj;cnta++) {			
			if(conjunto[cnta] % 5 == 0 && conjunto[cnta] != 0) {
				if(conjunto[cnta] > 9) {
					System.out.print(conjunto[cnta]+";");
				} else {	
					System.out.print("0"+conjunto[cnta]+";");
				}
				pulaLinha++;
				if(pulaLinha == 5) {
					System.out.println();
				}	
			}
		}		
	}	
}


