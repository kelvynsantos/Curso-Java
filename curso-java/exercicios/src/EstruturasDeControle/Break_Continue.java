package EstruturasDeControle;

public class Break_Continue {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			if(i == 3) { 
				break; //sai do for
			}
			System.out.println(i);
		} 
		for (int i = 0; i < args.length; i++) {
			if(i  == 3) { 
				continue;
			} 
			System.out.println(i);
		}
	}

}
