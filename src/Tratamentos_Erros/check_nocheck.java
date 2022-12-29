package Tratamentos_Erros;

@SuppressWarnings("serial")
public class check_nocheck {
	public static void main(String[] args) throws Exception {
		
		
		try {
			gerarError1();
		} catch (Exception e) {
			e.printStackTrace();
		}
//		try {
//			gerarError2();
//		} catch (Exception e) {
////			e.printStackTrace();
//		}
		try {
			gerarError2();
		} catch (Throwable e) {
System.out.println(e.getMessage());		
		}
		System.out.println("Fim");

	}
	//Não checada ou não verificada
	static void gerarError1() {
		throw new RuntimeException("ERROR CODE #1");
	}
	//exceção checada ou verificada - throws Exception
	static void gerarError2() throws Exception {
//		try {
			throw new Exception("Ocorreu um erro #2");
//		}catch(Exception e) {
//			System.out.println("end");
		}
//		new  RuntimeException("ERROR CODE #2 exemple");
	}
//}
