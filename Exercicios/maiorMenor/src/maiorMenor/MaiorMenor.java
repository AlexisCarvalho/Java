package maiorMenor;

import java.util.Scanner;

public class MaiorMenor {
	
	private double[] numeros;
	private Scanner scanner;
	private double temp;
	
	public MaiorMenor() {
		
		scanner = new Scanner(System.in);
		numeros = new double[5];
		temp = 0;
		
	}
	
	protected void entradaDados() {
		
		for(int cnta = 0;cnta < 5;cnta++) {
			
			System.out.print("Informe o "+(cnta+1)+"º numero: ");
			numeros[cnta] = scanner.nextDouble();
			
		}
		
	}
	
	protected void dmn() {
		
		for(int cnta = 0;cnta < 5;cnta++) {
			
			for(int cnta2 = 0;cnta2 < 5; cnta2++) {
				
				if(numeros[cnta] < numeros[cnta2]) {
					
					temp = numeros[cnta];
					numeros[cnta] = numeros[cnta2];
					numeros[cnta2] = temp;
					
				}
				
			}
			
		}
		
	}
	
	protected void saidaDados() {
			
			System.out.println("Menor Numero: "+numeros[0]);
			System.out.println("Maior Numero: "+numeros[4]);
		
	}
	
}
