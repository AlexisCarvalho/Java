package cuboInteiros;

import java.util.Scanner;
import java.lang.Math;

public class CuboInteiros {

	private Scanner scanner;
	private int[] numeros;
	
	public CuboInteiros() {
		scanner = new Scanner(System.in);
		numeros = new int[10];
	}
	
	public void entradaDados() {
		for(int smtr = 0;smtr < 10;smtr++) {
			System.out.print("Digite o "+(smtr+1)+"º"+" numero: ");
			numeros[smtr] = scanner.nextInt();
		}
	}
	
	public void calcularCubo() {
		int cubo = 0;
		for(int numero : numeros) {
			cubo = (int) Math.pow(numero, 3);
			System.out.println("Cubo de "+numero+" = "+cubo);
		}
	}
}
