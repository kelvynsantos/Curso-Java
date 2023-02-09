package Lambdas;

import java.util.function.Function;

public class FunctionInterface {
    public static void main(String[] args) {
        Function<Integer, String> parOuImpar= numero -> numero% 2 == 00 ? "par" :"impar";

        System.out.println(parOuImpar.apply(33));

        Function<String, String> OResultadoE = valor -> "O resultado é " + valor;
        Function<String,String> excla = valor -> valor+" !!!!" ;
        String rfinal = parOuImpar
        .andThen(OResultadoE)
        .andThen(excla)
        .apply(22);
    }
    
}
