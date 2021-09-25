package Fundamentos.operadores;

public class Logicos {

	public static void main(String[] args) {
		boolean cond1 = true; 
		boolean cond2 = 3 > 7; 
		 
		System.out.println(cond1  && cond2); //E
		System.out.println(cond1 || cond2); //OU
		System.out.println(cond1 ^ cond2); //OU exclusivo 
		System.out.println(!cond1); 
		System.out.println(!cond2); 
		
	}

}
