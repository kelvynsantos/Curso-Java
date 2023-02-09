package Lambdas;

import java.util.function.BinaryOperator;

public class Op_binario {
    public static void main(String[] args) {
        // não int == Double
        
    BinaryOperator<Integer> calc = (x,y) -> { return x+y;};
    System.out.println(calc.apply(2, 312));
    }
}
