package Fundamentos.desafios;

import java.util.Scanner;

public class desafioConversao {

	public static void main(String[] args) { 
		Scanner input = new Scanner(System.in); 
		System.out.print("Informe o primeiro salário:"); 
		String v1 = input.next().replace(",","."); 
		 
		System.out.print("\nInforme o segundo salário:"); 
		String v2 = input.next().replace(",",".");
		System.out.print("\nInforme o terceiro salário:"); 
		String v3 = input.next().replace(",","."); 
		 
		double salario1 = Double.parseDouble(v1); 
		double salario2 = Double.parseDouble(v2); 
		double salario3 = Double.parseDouble(v3); 
		 
		double media = (salario1 + salario2 + salario3) / 3;
		System.out.println("Amédia dos salários é :" + media);
		input.close();
	}

}
