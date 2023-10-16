package areaTriangulo;

import java.util.Scanner;

public class AreaTriangulo {
	
	private double area,base,altura;
	private Scanner scanner;
	
	public AreaTriangulo() {
		
		area = base = altura = 0;
		scanner = new Scanner(System.in);
		
	}
	
	protected void entradaDados(){
		
		System.out.print("Informe a base: ");
		base = scanner.nextDouble();
		
		System.out.print("Informe a altura: ");
		altura = scanner.nextDouble();
		
	}
	
	protected void calcular() {
		
		area = (base * altura)/2;
		
	}
	
	protected void saidaDados() {
		
		System.out.println("A area do triangulo e: "+area);
		
	}

}
