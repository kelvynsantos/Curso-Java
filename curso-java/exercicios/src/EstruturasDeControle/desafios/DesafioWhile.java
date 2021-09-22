package EstruturasDeControle.desafios;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int quantNotas = 0; 
		double nota = 0; 
		double total = 0;
		 
		while(nota != -1) { 
			System.out.println("Informe a nota (ou -1 p/ sair):");
			nota = input.nextDouble(); 
			if(nota <=10 && nota>=0) {
				total += nota; 
				quantNotas++; 
		}else if(nota != -1) { 
			System.out.println("Nota inválida!!! ;D");
		} 
		double media = total/quantNotas; 
		System.out.printf("Média = %2.d",media);
		input.close();
		}
	}

}
