package controle;

import java.util.Scanner;

public class WhileIndeterminado {

	public static void main(String[] args) { 
		Scanner input = new Scanner(System.in); 
		String frase = "";
		System.out.println("Digite a frase");
		while(!frase.equalsIgnoreCase("sair")) {
		 frase = input.nextLine();
		} 
		 input.close();
	}
}
