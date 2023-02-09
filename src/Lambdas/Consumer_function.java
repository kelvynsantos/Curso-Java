package Lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumer_function {
    public static void main(String[] args) {
        Consumer<Produto> imprimir = p -> System.out.println(p.nome);
        Produto p1 = new Produto("null", 20, 0.01);
        Produto p2 = new Produto("null1", 22, 0.01);

        imprimir.accept(p1);
        List<Produto> prod = Arrays.asList(p1,p2);
        prod.forEach(imprimir);
        prod.forEach(p -> System.out.println(p.preco));
        prod.forEach(System.out:: println);
        
    }
}
