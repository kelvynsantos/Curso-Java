package EstruturasDeDados;
import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class CollectionSet2 {
    public static void main(String[] args) {
//        Set<String> Lista = new HashSet<>();
        SortedSet<String> Lista = new TreeSet<>();

        Lista.add("Ana");
        Lista.add("Maria");
        Lista.add("Mauro");
        Lista.add("Paulo");

        for(String candidato: Lista){
            System.out.println(candidato);
        }

        Set<Integer> numeros = new HashSet<>();

        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);

        for (Integer n : numeros) {
            System.out.println(n);
        }
    }
}
