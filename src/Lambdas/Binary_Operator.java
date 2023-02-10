package Lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class Binary_Operator {
    public static void main(String[] args) {
        BinaryOperator<Double> media = (Double n1, Double n2) -> (n1+n2) / 2;
        System.out.println(media.apply(22.2, 5.43));

        BiFunction< Double, Double, String> resu = (n1,n2) -> ((n1+n2)/2) >= 7 ? "Aprovado" : "Reprovado";
        System.out.println(resu.apply(8.5, 4.2));

        Function<Double, String> conceito = m -> m >= 7 ? "aprovado" : "reprovado";
        System.out.println(media.andThen(conceito).apply(9.7, 5.1));
        
    }    
}
