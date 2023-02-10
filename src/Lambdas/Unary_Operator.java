package Lambdas;
import java.util.function.UnaryOperator;
public class Unary_Operator {
 
    public static void main(String[] args) {
        UnaryOperator<Integer> maisDois = n -> n+2;
        UnaryOperator<Integer> vezes = n -> n * 2;
        UnaryOperator< Integer> quadrado = n -> n*n;

        int res =  quadrado.compose(vezes)
        .compose(maisDois)
        .apply(22);

        int res2 = quadrado.andThen(vezes)
        .andThen(quadrado)
        .apply(22);
        System.out.println(res +"----"+ res2);


        
    }
}
