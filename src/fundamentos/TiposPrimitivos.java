package fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {  
		//informacoes do funcionario
    byte anosdeEmpresa = 23;
     short NumeroVoos = 543;
      int id = 2343345; 
      long pontosAcumulados = 3_456_465_233L; // valor maior que o suportado por int Precisa do L no final 
 //numericos reais 
       float salario = 11234.33f; 
       double Vendas = 1232435.33;
        boolean estadeFerias = false ; 
         char status = 'a'; 
         System.out.println(anosdeEmpresa * 365); 
         System.out.println(NumeroVoos / 2);
         System.out.println("o id  :" + id + " ganha : " + salario); 
         System.out.println(pontosAcumulados / Vendas); 
         System.out.println("Status do funcionário e ferias : " + estadeFerias + status);
  
	}

}
