package fundamentos.desafios;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		//ler n1,n2 
		// + - * / %  
		Scanner input = new Scanner(System.in); 
		System.out.println("Informe o número:"); 
		double num1= input.nextDouble(); 
		System.out.println("Informe o numero:"); 
		double num2 = input.nextDouble(); 
		System.out.println("Informe a operação:"); 
		String operacao = input.next(); 
		 
		double resultado = "+".equals(operacao) ? num1 + num2 : 0; 
		resultado = "-".equals(operacao) ? num1 - num2 : resultado; 
		resultado = "*".equals(operacao) ? num1 * num2 : resultado; 
		resultado = "/".equals(operacao) ? num1 / num2 : resultado; 
		resultado = "%".equals(operacao) ? num1 % num2 : resultado;
		 
		System.out.printf("%.2f %s %.2f = %.2f",num1,operacao, num2, resultado);
		input.close(); 
		
	}

}
