package banco;

import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.File;

public class CofreBanco {
	
	static File file = new File("Cofre.txt");

	public void moverParaCofre(float quantiaAMover) {
		
		try {
			
			FileWriter filewriter = new FileWriter(file);
			BufferedWriter bufferedwriter = new BufferedWriter (filewriter);
			ContaBanco conta = new ContaBanco();
			
			
			if (conta.getSaldo() > 0) {
				
				if (conta.getSaldo() >= quantiaAMover) {
					
					bufferedwriter.write(String.valueOf(conta.getNumConta())+";");
					bufferedwriter.write(String.valueOf(conta.getSaldo()));
					conta.setSaldo("-", quantiaAMover);
					
				}
				
			} else System.out.println("Impossivel mover para o cofre. Saldo devedor");
			
			bufferedwriter.close();
			
			
		} catch (IOException ex) {ex.printStackTrace();}
		
	}
	
}
