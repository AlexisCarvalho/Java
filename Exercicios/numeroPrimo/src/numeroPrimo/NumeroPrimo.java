package numeroPrimo;

import java.util.Scanner;

public class NumeroPrimo {
	
	private int numero;
	private Scanner scanner;
	private boolean primo;
	
	public NumeroPrimo(){
		
		numero = 0;
		scanner = new Scanner(System.in);
		primo = true;
		
	}
	
	protected void entradaDados() {
		
		System.out.print("Digite o numero: ");
		numero = scanner.nextInt();
		
	}
	
	protected void primo() {
		
		if(numero != 2 && numero != 3 && numero != 5 && numero != 7) {
		
			if(numero % 2 == 0 || numero == 1) {
		
				primo = false;
			
			}
			
			if(numero % 3 == 0) {
				
				primo = false;
				
			}
			
			if(numero % 5 == 0) {
				
				primo = false;
				
			}
		
			if(numero % 7 == 0) {
			
				primo = false;
			
			}
			
			
			if (primo) {
				
				System.out.println("O numero e primo");
				
			} else {
				
				System.out.println("O nomero nao e primo");
				
			}
		
		} else {
			
			System.out.println("O numero e primo");
			
		}
		
	}

}
