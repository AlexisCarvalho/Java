package intervalo;
import java.util.Scanner;

public class Intervalo {
	
	private Scanner scanner;
	private int primeiroInter, ultimoInter, somatorio;
	
	public Intervalo() {
		
		scanner = new Scanner(System.in);
		primeiroInter = ultimoInter = 0;
		
	}
	
	public void entradaDados() {
		
		System.out.print("Digite o primeiro valor do intervalo: ");
		primeiroInter = scanner.nextInt();
		
		System.out.print("Digite o ultimo valor do intervalo: ");
		ultimoInter = scanner.nextInt();
		
	}
	
	public void paresSoma() {
		
		int pulaLinha = 0;
		
		for(int cnta = primeiroInter; cnta <= ultimoInter;cnta++) {
			
			somatorio += cnta;
			
			if(cnta %2 == 0) {
				
				
				if(cnta<10) {
					System.out.print("0"+cnta+";");
				} else {
					System.out.print(cnta+";");
				}
				
				pulaLinha++;
				
				if(pulaLinha == 5) {
					
					System.out.println();
					pulaLinha = 0;
					
				}
				
			}
			
		}
		
		System.out.println();
		System.out.println("Somatorio = "+somatorio);
		
	}
	
}
