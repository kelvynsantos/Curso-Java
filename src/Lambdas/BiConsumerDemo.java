package Lambdas;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.BiConsumer;
public class BiConsumerDemo {
    public static void main(String[] args) {
        Map<Integer, String> map = new LinkedHashMap<>();
        map.put(1, "Java");
        map.put(2, "C++");
        map.put(3, "Kotlin");


        map.forEach((k, v) -> {
            System.out.println(k);
            System.out.println(v);
        });
        BiConsumer<Integer, Integer> biConsumer = (a,b) -> System.out.println(a+b);
         biConsumer.accept(11, 13);
        } 
}
