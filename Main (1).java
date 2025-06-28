import java.util.Scanner;
public class Main
{
    //1. Escreva um programa que guarde seu nome em uma variável chamada `nome` e exiba o conteúdo dessa variável na tela.
	public static void main(String[] args) {
	    Scanner entrada = new Scanner(System.in);
	    
	    System.out.print("Qual o seu nome: ");
	    String nome = entrada.nextLine();
	    
		System.out.println("Seu nome é "+ nome );
		
	//2. Escreva um programa que pergunte o nome de usuário usando Scanner e então exiba:

		int tamanho = nome.length();
		System.out.println("OIII "+nome+ " seu nome tem "+tamanho+" letras");
		

	}
}
