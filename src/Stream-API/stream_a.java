import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class stream_a {
  public static void main(String[] args) {
      List<String> aprovados = Arrays.asList("Lu","Gui","Luan","Ana");      
      for(String nome: aprovados) {
        System.out.println(nome);
      }
      Iterator<String> iterator = aprovados.iterator();
      while(iterator.hasNext()) {System.out.println(iterator.next());}  

      Stream<String> stream = aprovados.stream();
      stream.forEach(System.out::println);
/*Stream  # Build Ops 
          # Intermediate Ops 
          # Terminal Ops = can be something different of a Stream */
      Consumer<Object> print = System.out::print;
      Stream<String> langs = Stream.of("Java","Golang","Lua","Swift\n");
      langs.forEach(print);
      String[] morelangs = {"Kotlin", "Python", "Rust", "C\n"};
      Stream.of(morelangs).forEach(print);
      Arrays.stream(morelangs).forEach(print);
      Arrays.stream(morelangs,1,2).forEach(print);
      List<String>  otherlangs = Arrays.asList("PHP", "Pearl", "JavaScript\n");
      otherlangs.stream().forEach(print);
      otherlangs.parallelStream().forEach(print);
      Predicate<? super String> predicate = s -> s.equals("Pearl");
      Stream<String> filterStream = ((Stream<String>) otherlangs).filter(predicate);
      // Stream.generate(() -> "b").forEach(print);
      // Stream.iterate(0, n -> n + 1).forEach(print);
  }
}
