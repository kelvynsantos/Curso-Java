package EstruturasDeControle;

import java.util.Scanner;

public class If { 
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		System.out.println("Informe a m�dia:"); 
		double media = input.nextDouble(); 
		// n�o usar ; em estruturas de controle (tem uma exce��o)
		if(media <=10 && media >= 7.0) {
			System.out.println("Aprovado"); 
		} 
		if(media < 7 && media >= 4.5) { 
			System.out.println("Recupera��o");
		} 
		if(media < 4.5 && media >= 0) { 
			System.out.println("Reprovado");
		}
		input.close();
	}

}
