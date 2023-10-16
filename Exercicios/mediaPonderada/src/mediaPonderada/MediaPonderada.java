package mediaPonderada;

import java.util.Scanner;

public class MediaPonderada {
	
	private Scanner scanner;
	private double n1,n2,media;
	
	public MediaPonderada() {
		
		n1 = n2 = media = 0;
		scanner = new Scanner(System.in);
		
	}
	
	protected void entradaDados() {
		
		System.out.print("Digite a primeira nota: ");
		n1 = scanner.nextDouble();
		
		System.out.print("Digite a segunda nota: ");
		n2 = scanner.nextDouble();
		
	}
	
	protected void calcularMedia() {
		
		media = (n1*2 + n2*3)/(2 + 3);
		
	}
	
	protected void exibirDados() {
		
		System.out.println("Media: "+media);
		
		if(media >= 6) {
			
			System.out.println("Aluno aprovado");
			
		} else {
			
			System.out.println("Aluno reprovado");
			
		}
		
	}

}
