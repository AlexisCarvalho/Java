package numerosPrimos;

import java.util.Scanner;

public class NumerosPrimos {
	
	private int numero,espaco;
	private Scanner scanner;
	private boolean primo;
	
	public NumerosPrimos() {
		
		scanner = new Scanner(System.in);
		numero = espaco = 0;
		primo = true;
		
	}
	
	protected void entradaDados() {
		
		System.out.print("Digite ate onde deseja ver os numeros primos: ");
		numero = scanner.nextInt();
		
	}
	
	protected void numerosPrimos() {
		
		for(int cnta = 0;cnta <= numero;cnta++) {
			
			if(cnta != 2 && cnta != 3 && cnta != 5 && cnta != 7) {
				
				if(cnta % 2 == 0 || cnta == 1) {
			
					primo = false;
				
				}
				
				if(cnta % 3 == 0) {
					
					primo = false;
					
				}
				
				if(cnta % 5 == 0) {
					
					primo = false;
					
				}
			
				if(cnta % 7 == 0) {
				
					primo = false;
				
				}
				
				
				if (primo) {
					
					System.out.print(cnta+";");
					espaco++;
					
				} 
			
			} else {
				
				if(cnta != 11) {
					
					System.out.print("0"+cnta+";");
				
				} else {
					
					System.out.print(cnta+";");
					
				}
				
				espaco++;
				
			}	
			
			primo = true;
			
			if(espaco == 5) {
				
				System.out.println();
				espaco = 0;
				
			}
			
		}
		
	}

}
