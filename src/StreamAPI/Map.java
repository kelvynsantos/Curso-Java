package src.StreamAPI;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;


public class Map {
    public static void main(String[] args) {
        Consumer<Object> print = System.out::print;
        List<String> brands = Arrays.asList("BMW","Audi","Honda");
        brands.stream().map(m -> m.toUpperCase()).forEach(print);


        System.out.println("\n\nUsando composição");
        brands.stream().map(Utilitarios.maiuscula).map(Utilitarios.primeira).map(Utilitarios::exclamacao).forEach(print);

    }
}
