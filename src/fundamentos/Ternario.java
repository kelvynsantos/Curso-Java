 package fundamentos;

public class Ternario {

	public static void main(String[] args) {
		double media = 7.6; 
		String resultado = media >= 7.0 ? "Aprovado" : media>= 5 ? "Em recuperação" : "reprovado"; 
		System.out.println("O aluno está" + resultado);
		 
		double nota = 9.9; 
		boolean bomComp = false; 
		boolean passouMedia = nota >=7; 
		boolean temDesc = bomComp && passouMedia; 
		String resul = temDesc ? "Sim" : "Não"; 
		
		 System.out.printf("Tem desconto? %s",resul);
	}

}
