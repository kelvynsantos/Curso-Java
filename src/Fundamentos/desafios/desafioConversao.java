package Fundamentos.desafios;

import java.util.Scanner;

public class desafioConversao {

	public static void main(String[] args) { 
		Scanner input = new Scanner(System.in); 
		System.out.print("Informe o primeiro sal�rio:"); 
		String v1 = input.next().replace(",","."); 
		 
		System.out.print("\nInforme o segundo sal�rio:"); 
		String v2 = input.next().replace(",",".");
		System.out.print("\nInforme o terceiro sal�rio:"); 
		String v3 = input.next().replace(",","."); 
		 
		double salario1 = Double.parseDouble(v1); 
		double salario2 = Double.parseDouble(v2); 
		double salario3 = Double.parseDouble(v3); 
		 
		double media = (salario1 + salario2 + salario3) / 3;
		System.out.println("Am�dia dos sal�rios � :" + media);
		input.close();
	}

}
