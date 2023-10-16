package media;

import java.util.Scanner;

public class Media {
	
	private int numero,impares,pares;
	private double mediaPares, mediaImpares;
	private Scanner scanner;
	
	public Media() {
		
		mediaPares = mediaImpares = numero = impares = pares = 0;
		scanner = new Scanner(System.in);
		
	}
	
	protected void entradaDados() {
		
		System.out.print("Digite um numero: ");
		numero = scanner.nextInt();
		
	}
	
	protected void mediaImpPar() {
		
		for(int cnta = 1;cnta <= numero;cnta++) {
			
			if(cnta %2 == 0) {
				
				mediaPares += cnta;
				pares++;
				
			} else {
				
				mediaImpares += cnta;
				impares++;
				
			}
			
		}
		
		if(mediaPares != 0) {
			
			mediaPares /= (double)pares;
			
		}
		
		if(mediaImpares != 0) {
			
			mediaImpares /= (double)impares;
			
		}
		
	}
	
	protected void saidaDados() {
		
		System.out.println("Media dos Pares: "+mediaPares);
		System.out.println("Media dos Impares: "+mediaImpares);
		
	}

}
