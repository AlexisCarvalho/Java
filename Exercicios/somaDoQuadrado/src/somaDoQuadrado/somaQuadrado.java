package somaDoQuadrado;

import java.lang.Math;

public class somaQuadrado {
	
	private double somaQuadrado;
	
	public somaQuadrado() {
		somaQuadrado = 0;
	}
	
	public void exibirNumeros() {
		int pulaLinha = 0;
		for(int smtr = 1;smtr != 31;smtr++) {
			if(smtr > 9) {
				System.out.print(smtr+";");
				pulaLinha++;
				if(pulaLinha == 5) {
					System.out.println();
					pulaLinha = 0;
				}
			} else {
				System.out.print("0"+smtr+";");
				pulaLinha++;
				if(pulaLinha == 5) {
					System.out.println();
					pulaLinha = 0;
				}
			}
			somaQuadrado += Math.pow(smtr, 2);
		}
		System.out.println("Soma dos quadrados: "+somaQuadrado);
	}

}
