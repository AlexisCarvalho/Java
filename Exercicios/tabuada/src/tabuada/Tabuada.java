package tabuada;

import java.util.Scanner;

public class Tabuada {
	
	private int tabuadaDesejada;
	private Scanner scanner;
	
	public Tabuada() {
		
		tabuadaDesejada = 0;
		scanner = new Scanner(System.in);
		
	}
	
	protected void entradaDados() {
		
		System.out.print("Digite ate qual tabuada deseja ver (1 a N): ");
		tabuadaDesejada = scanner.nextInt();
		
	}
	
	protected void calcular() {
		
		for(int cnta = 1;cnta <= tabuadaDesejada;cnta++) {
			
			for(int cnta2 = 0;cnta2 <= 10;cnta2++) {
				
				System.out.println(cnta+"*"+cnta2+" = "+(cnta*cnta2));
				
			}
			
			System.out.println();
			
		}
		
	}

}
