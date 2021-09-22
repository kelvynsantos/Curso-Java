package EstruturasDeControle;

public class BreakContinueRotulado {

	public static void main(String[] args) {
		externo: for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if(i == 1) {
					 break externo; 
				}
				System.out.printf("[%d %d]",i,j);
			}
			 System.out.println();
		} 
		externo : 
		for (int i = 0; i < args.length; i++) {
			for (int j = 0; j < args.length; j++) {
				if (i == 1) {
					continue externo;
				} 
				System.out.printf("[%d %d]",i,j);
			}
			 System.out.println();
		}
		 System.out.println("Fim!");
	}
}
