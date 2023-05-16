package src.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriarStream {
    public static void main(String[] args) {
        Consumer<Object> print = System.out::print;
        Stream<String> langs = Stream.of("Java ","Lisp ", "JS");
        langs.forEach(print);
        String[] morelangs = {"Python ","PHP ", "Pearl ", "Go\n"};
        Stream.of(morelangs).forEach(print);
        Arrays.stream(morelangs).forEach(print);
        Arrays.stream(morelangs,1,2).forEach(print);
        List<String> otherLangs = Arrays.asList("C ","Kotlin ","Flutter\n");
        otherLangs.stream().forEach(print);
        otherLangs.parallelStream().forEach(print); // executed in a parallel way, not ordenaded the way it was made

//        Stream.generate(() -> "a").forEach(print);
//        Stream.iterate(0, n -> n +1).forEach(print);

    }
}
