package banco;

public class GerenciaBanco {

	public static void main(String[] args) {
		
		ContaBanco conta = new ContaBanco();
		
		
		conta.abrirConta("cc", "Ju");
		
		conta.visualizarConta();
		
		conta.depositar(105);
		
		conta.visualizarConta();
		
		conta.sacar(100);
		
		conta.visualizarConta();
		
		conta.sacar(55);
		
		conta.visualizarConta();
		
		conta.pagarMensal("cp");
		
		conta.sacar(10);
		
		conta.visualizarConta();
		
		
	}

}
