package OO.Interface;
import java.util.function.BiConsumer;
public class BiConsumerDemo implements BiConsumer<Integer, Integer> {
    public static void main(String[] args) {
        BiConsumer<Integer, Integer> biConsumer = new BiConsumerDemo();
        biConsumer.accept(10, 11);
    }
/**
 * Functional Interface:
This is a functional interface and can therefore be used as the assignment target for a lambda expression or method reference.
 */
    @Override
    public void accept(Integer a, Integer b) {
        // TODO Auto-generated method stub
        System.out.println(a+b);
    }
    
}
