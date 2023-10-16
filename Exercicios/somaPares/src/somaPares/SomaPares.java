package somaPares;

import java.util.Scanner;

public class SomaPares {

	private int soma,numero[];
	private Scanner scanner;

	public SomaPares() {
		
		soma = 0;
		numero = new int[5];
		scanner = new Scanner(System.in);
		
	}
	
	protected void entradaDados() {
		
		for(int cnta = 0;cnta < 5;cnta++) {
			
			System.out.print("Informe o "+(cnta+1)+"º"+" numero: ");
			numero[cnta] = scanner.nextInt();
			
		}
		
	}
	
	protected void somarPares() {
		
		for (int cnta = 0;cnta < 5;cnta++) {
			
			if(numero[cnta] %2 == 0) {
				
				soma += numero[cnta];
				
			}
			
		}
		
	}
	
	protected void saidaDados() {
		
		System.out.println("A soma dos pares e: "+soma);
		
	}	
	
}
