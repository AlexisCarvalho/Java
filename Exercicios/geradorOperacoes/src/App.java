import java.util.Scanner;
import java.util.Random;


public class App {
    public static void main(String[] args) throws Exception {
        
        int primeiroNumero, 
            segundoNumero,  
            operador,  
            resposta,
            resp = 1,
            internresp=0;  
        float resultado;

        Scanner teclado = new Scanner(System.in); 
        Random aleatorio = new Random();
        
        do{
            primeiroNumero = aleatorio.nextInt(1000);
            segundoNumero = aleatorio.nextInt(1000);
            operador = aleatorio.nextInt(4);

            switch (operador){
            
                
                case 0: 

                    System.out.println("Qual o resultado de "+primeiroNumero+"+"+segundoNumero+"?");                

                    do{

                        System.out.print("Resposta: ");
                        resposta = teclado.nextInt();

                        resultado = primeiroNumero+segundoNumero;

                        if (resposta==resultado){
                            System.out.println("Acertou mizeravi");
                            internresp = 0;
                        } 
                        else {

                            System.out.println("Errou!");
                            internresp = 1;   
  
                        }

                    }while(internresp==1);

                break;

                case 1:

                    System.out.println("Qual o resultado de "+primeiroNumero+"-"+segundoNumero+"?");

                    do{

                        System.out.print("Resposta: ");
                        resposta = teclado.nextInt();

                        resultado = primeiroNumero-segundoNumero;

                        if (resposta==resultado){
                            System.out.println("Acertou mizeravi");
                            internresp = 0;
                        } 
                        else {
 
                            System.out.println("Errou!");
                            internresp = 1;   
   
                        }

                    }while(internresp==1);

                break;

                case 2:

                    primeiroNumero = aleatorio.nextInt(100);
                    segundoNumero = aleatorio.nextInt(10);
                
                    System.out.println("Qual o resultado de "+primeiroNumero+"*"+segundoNumero+"?");
                    
                    do{

                        System.out.print("Resposta: ");
                        resposta = teclado.nextInt();

                        resultado = primeiroNumero*segundoNumero;

                        if (resposta==resultado){
                            System.out.println("Acertou mizeravi");
                            internresp = 0;
                        } 
                        else {
                            
                            System.out.println("Errou!");
                            internresp = 1;   

                        }

                    }while(internresp==1);

                break;

                case 3:

                    do{
                        primeiroNumero = aleatorio.nextInt(100);
                        segundoNumero = aleatorio.nextInt(10);

                        if(segundoNumero!=0 && primeiroNumero!=0){
                            if(primeiroNumero%segundoNumero==0){
                                internresp = 1;
                            } 
                            else{
                                internresp = 0;
                            } 
                        }
                    }while(internresp==0);    

                    System.out.println("Qual o resultado de "+primeiroNumero+"/"+segundoNumero+"?");

                    do{

                        System.out.print("Resposta: ");
                        resposta = teclado.nextInt();

                        resultado = primeiroNumero/segundoNumero;

                        if (resposta==resultado){
                            System.out.println("Acertou mizeravi");
                            internresp = 0;
                        } 
                        else {

                            System.out.println("Errou!");
                            internresp = 1;                              

                        }

                    }while(internresp==1);                

                break;
                

            }

        }while (resp==1);

        teclado.close();
    }
}
