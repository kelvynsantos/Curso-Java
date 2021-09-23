package fundamentos;

import java.util.Scanner;

public class StringEquals {
	public static void main(String[] args) {
		System.out.println("2" == "2"); //falsa impressao que deu certo
		 
		String s = new String("2"); 
		System.out.println("2".equals(s)); 
		 
		Scanner input = new Scanner(System.in); 
		String s2 = input.nextLine(); 
		System.out.println("2".equals(s2.trim()));
		input.close();
	}
}
