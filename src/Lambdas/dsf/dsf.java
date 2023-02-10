package Lambdas.dsf;

import java.util.function.Function;
import java.util.function.UnaryOperator;

import Lambdas.Produto;

public class dsf {
    public static void main(String[] args) {


    Function<Produto,Double> resu = pr  -> (pr.preco * (1 - pr.desconto));
    UnaryOperator<Double> imposto = preco -> preco >= 2500.0 ? preco * (1 + 0.085) : preco ;
    UnaryOperator<Double> frete = preco -> preco >= 3000 ? preco+100 : preco+50;
    UnaryOperator<Double> arredondar = preco -> Double.parseDouble(String.format("%2f",preco));
    Function<Double,String> formatar = preco -> ("R$ "+preco).replace(".", ",");
    
    Produto p = new Produto("Ipad", 4235.99, 0.12);
    String preco = resu.andThen(imposto)
    .andThen(frete)
    .andThen(arredondar)
    .andThen(formatar)
    .apply(p);

    System.out.println(preco);
    }
}
