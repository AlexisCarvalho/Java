package produto;

import java.util.Scanner;

public class Produto {
	
	private Scanner scanner;
	private int numero,produto;
	private boolean respostaCerta;
	
	public Produto() {
		
		scanner = new Scanner(System.in);
		numero = 0;
		produto = 1;
		respostaCerta = false;
		
	}
	
	protected void entradaDados() {
		
		do {
		
		System.out.print("Insira um numero entre 1 a 10: ");
		numero = scanner.nextInt();
		
			if(numero > 0 && numero <= 10) {
			
				respostaCerta = true;
			
			}
		
		} while(!respostaCerta);
		
	}
	
	protected void calcularProduto() {
		
			if(numero > 3) {
		
				for(int cnta = 1;cnta <= numero;cnta++) {
				
					if(cnta %2 == 0) {
				
						produto *= cnta;
				
					}
			
				}
			} else produto = 0;
		}
		
	
	protected void saidaDados() {
		
		System.out.print("O produto dos numeros pares entre 1 e "+numero+" e: "+produto);
		
	}

}
