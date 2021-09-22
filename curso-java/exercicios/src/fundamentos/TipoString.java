package fundamentos;
import java.util.Scanner;
public class TipoString {

	public static void main(String[] args) {
// tipos nao primitivos
		Scanner scanner = new Scanner(System.in); 
		System.out.println("Digite o seu nome : ");
		 String nome = scanner.nextLine();
			String s = "Bom dia X ";
			s = s.replace("X",nome); 
			s = s.toUpperCase(); 
			s = s.concat("!!!!");
			System.out.println(s);
// tipos primitivos não tem o operador ponto
			 System.out.println(s.startsWith("BOM")); //string comeca com Bom ? 
			 System.out.println(s.endsWith("!"));  //string termina com '!' ? 
			 System.out.println(s.length()); //tamanho da string 
			 System.out.println(s.equalsIgnoreCase("bom dia " + nome +" !!!!"));  
			 String frase =  String.format("\nO senhor é meu pastor, e nada me faltara"); 
			 System.out.println(frase); 
			 scanner.close();
			 
			 
			 
			 
	}

}
