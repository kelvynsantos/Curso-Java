package controle;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String resp = "";
		do { 
			System.out.println("Você precisa falar "
					+ "\nas palavras mágicas...");
			System.out.println("Quer sair?");
			 resp = input.nextLine(); 			
		}while(!resp.equalsIgnoreCase("por favor")); 
		System.out.println("Obrigado!");
		input.close();
	}

}
