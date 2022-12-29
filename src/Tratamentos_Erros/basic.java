package Tratamentos_Erros;

public class basic {
    public static void main(String[] args) {
        Aluno a1 = null; //NullPointerException
        
        try {
            imprimirNome(a1);
        }catch(Exception e) {
            System.out.println("Erro");
        }
        try{
            System.out.println(7/0);
        }catch(ArithmeticException a) {
            a.printStackTrace();
        }
        
        try {
        	Aluno a2 = new Aluno("",-2);
        	Validar.aluno(a2);
        }catch(StringVaziaException e) {
        	System.out.println(e.getMessage());
       } catch(exemplosException e) {
    	   System.out.println(e.getMessage());
       }
        System.out.println("done");
    }
        public static void imprimirNome( Aluno aluno) {
            System.out.println(aluno.nome);
        }

	}
