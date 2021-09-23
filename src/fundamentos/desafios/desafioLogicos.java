package fundamentos.desafios;

public class desafioLogicos {

	public static void main(String[] args) {
		boolean t1 = false; 
		boolean t2 = true; 
		 
		boolean comprouTV50 = t1 && t2; 
		boolean comprouTV32 = t1 ^ t2; 
		boolean comprouSorvete = t1 || t2;
		//operador unario
		boolean maisaudavel = !comprouSorvete;
		System.out.println("Comprou TV 50\"?"+comprouTV50); 
		System.out.println("Comprou TV 32\"?"+ comprouTV32);
		System.out.println("Comprou sorvete\"?"+comprouSorvete); 
		System.out.println("Mais saudável ?"+maisaudavel);
	}

}
