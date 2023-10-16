package fatorial;

import java.util.Scanner;

public class Fatorial {
	
	private double fatorial;
	private Scanner scanner;
	
	public Fatorial() {
		
		fatorial = 0;
		
		scanner = new Scanner(System.in);
		
	}
	
	protected void entradaDados() {
		
		do {
		
		System.out.print("Digite o fatorial (de 0 a 170): ");
		fatorial = scanner.nextInt();
		
		} while(fatorial < 0 || fatorial > 170);
		
	}
	
	protected void calcular() {
		
		if(fatorial != 0) {
		
			for(int cnta = ((int)fatorial-1);cnta != 0;cnta--) {
			
				fatorial *= cnta;
			
		}
		
		} else fatorial = 1;
		
	}
	
	protected void saidaDados() {
		
		System.out.println("Resultado: "+fatorial);
		
	}

}
