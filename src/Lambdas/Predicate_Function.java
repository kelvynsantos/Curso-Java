package Lambdas;

import java.util.function.Predicate;

public class Predicate_Function {
    public static void main(String[] args) {
        Predicate<Produto> isCaro = prod -> (prod.preco * (1- prod.desconto)) >= 2500;

        Produto p1 = new Produto("Notebook", 4500.0, 0.14);
        System.out.println(isCaro.test(p1));

        Predicate<Integer> isPar = num -> num % 2 == 0;
        Predicate<Integer> isThreeDigitals = num -> num>= 100 && num <=999;

        System.out.println(isPar.and(isThreeDigitals).negate().test(333));
    }
}
