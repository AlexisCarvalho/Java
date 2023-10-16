package aumentoSalario;
import java.util.Scanner;

public class AumentoSalario {
	
	private double salarioAntigo,salarioNovo;
	private Scanner scanner;
	
	public AumentoSalario() {
		
		salarioAntigo = salarioNovo = 0;
		scanner = new Scanner(System.in);
		
	}
	
	protected void entradaDados() {
		
		System.out.print("Digite o salario atual: ");
		salarioAntigo = scanner.nextDouble();
		
	}
	
	protected void calcular() {
		
		salarioNovo = salarioAntigo * 1.25;
		
	}
	
	protected void exibirDados() {
		
		System.out.print("O salario apos o aumento e: "+salarioNovo);
		
	}

}
