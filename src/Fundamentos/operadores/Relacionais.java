package Fundamentos.operadores;

public class Relacionais {

	public static void main(String[] args) {
		/*
		 * int a = 97; int b = 'a'; //hexadecimal
		 * 
		 * System.out.println(a == b); System.out.println(\u0061);
		 */
		  
	System.out.println( 3 > 4); 
	System.out.println(3 >= 3); 
	System.out.println(3 < 7); 
	System.out.println(30 <= 7); 
	System.out.println(30 != 7); 
	 
	double nota = 7.3; 
	boolean bomComp = true; 
	boolean passouporMedia = nota >=7; 
	boolean temDesc = bomComp && passouporMedia; 
	System.out.println("Tem desconto?" + temDesc);
	}

}
