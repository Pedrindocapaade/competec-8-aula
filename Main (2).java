import java.util.Scanner;
public class Main
{ 
    //3.Escreva um programa que pergunte para o usuário qual a palavra secreta.
	public static void main(String[] args) {
	    Scanner entrada = new Scanner(System.in);
	    System.out.print("Qual a palavra secreta: ");
	    
	    String secret = entrada.nextLine();
		
		String PalavraSecret = "BATATA";
		
		System.out.println(secret.equals(PalavraSecret));
		
		if (PalavraSecret.equals(secret)){
		    System.out.println("Parabéns, você acertou!!!!!");
		}
		else{
		    System.out.println("Que pena, você errou!!");
		}
		
	}
}