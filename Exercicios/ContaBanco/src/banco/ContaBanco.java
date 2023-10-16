package banco;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;

public class ContaBanco {
	
	static File file = new File("Cofre.txt");
	
	//Criar getter e setter para todos os atributos
	
	public int numConta;
	protected String tipo; // cc (Conta Corrente) ou cp (Conta poupança)
	private String dono;
	private float saldo;
	private boolean status;
	
	public ContaBanco() {
		
		this.numConta = 0;
		this.tipo = "inx";
		this.dono = "NULL";
		this.saldo = 0;
		this.status = false;
		
		try {
			
			FileWriter filewriter = new FileWriter (file);
			BufferedWriter bufferedwriter = new BufferedWriter (filewriter);
			
			bufferedwriter.write(String.valueOf(this.numConta)+";"+String.valueOf(this.saldo));
			
			bufferedwriter.close();
			
		} catch (IOException ex) {ex.printStackTrace();}
		
	}
	
	public void abrirConta(String tipoConta, String donoConta) {
		// Mudar status para verdadeiro
		this.numConta++;
		tipoConta = tipoConta.toLowerCase();
		
		if (tipoConta.equals("cc")){
			
			this.saldo += 50;
			this.dono = donoConta;
			this.status = true;
			this.tipo = tipoConta;
			
		} else if (tipoConta.equals("cp")){
			
			this.saldo += 150;
			this.dono = donoConta;
			this.status = true;
			this.tipo = tipoConta;
			
		} else 
		
		System.out.println("Tipo de conta invalido");
	
	}
	
	public void fecharConta() {
		
		if (this.saldo == 0) {
			
			this.numConta = 0;
			this.tipo = "NULL";
			this.dono = "NULL";
			this.saldo = 0;
			this.status = false;
			
			System.out.println("Conta fechada com sucesso");
			
		} else if (this.saldo > 0) {
			
			System.out.println("A conta possui saldo positivo, impossivel fechar conta");
			
		} else if (this.saldo < 0) {
			
			System.out.println("A conta possui saldo devedor, impossivel fechar conta");
			
		}
		
	}
	
	public void depositar(float valorASerDepositado) {
		
		if (this.status) {
			
			this.saldo += valorASerDepositado;
			
		} else {
			
			System.out.println("Conta fechada, impossivel fazer deposito");
			
		}
		
	}
	
	public void sacar(float valorASerSacado) {
		
		if (this.status && this.saldo > 0) {
			
			if(valorASerSacado <= this.saldo) {
				
				this.saldo -= valorASerSacado;
				
			} else {
				
				System.out.println("O valor supera o saldo. Saldo: "+this.saldo);
				
			}
			
		} else if (!this.status) {
			
			System.out.println("A conta encontra-se fechada");
			
		} else System.out.println("Impossivel sacar. Saldo devedor");
		
	}
	
	public void pagarMensal(String tipoConta) {
		
		if (this.status) {
			
			tipoConta = tipoConta.toLowerCase();
			
			if(this.tipo.equals("cc")) {
				
				this.saldo -= 12;
				
			} else {
				
				this.saldo -= 20;
				
			}
			
		} else System.out.println("A conta encontra-se fechada");
		
	}
	
	public void visualizarConta() {
		
		try {
		FileReader filereader = new FileReader(file);
		BufferedReader bufferedreader = new BufferedReader(filereader);
		
		
		
		System.out.println("+-----------------+");
		System.out.println("Titular: "+this.dono);
		System.out.println("Tipo de conta: "+this.tipo);
		System.out.println("Numero da conta: "+this.numConta);
		System.out.println("Saldo: "+this.saldo);
		
		
		
		if (this.numConta != 0) {
			
			String [] a = (bufferedreader.readLine()).split(";");
			System.out.println("Valor no cofre: "+a[1]);
			
		}
		
		System.out.println("+-----------------+");
		
		bufferedreader.close();
		
		} catch (IOException ex) {ex.printStackTrace();};
		
	}
	
	public float getSaldo () {
		
		return this.saldo;
		
	}
	
	public int getNumConta() {
		
		return this.numConta;
		
	}
	
	public void setSaldo(String operacao, float valor) {
		
		if (operacao.equals("+")){
			
			this.saldo += valor;
			
		} else if (operacao.equals("-")) {
			
			this.saldo -= valor;
			
		} else System.out.println("Operacao invalida");
		
	}
	
}
