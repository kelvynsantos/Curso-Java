package Lambdas;

import java.util.Arrays;
import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        List<String> apv = Arrays.asList("ana","pedro","gui");
        List<Integer> NT = Arrays.asList(6,7,8);

         for( String nome: apv) {
            System.out.println(nome);
         }
         for(Integer nt : NT){
            System.out.println(nt);
         }
         apv.forEach((nome) ->  System.out.println(nome +"!!") );
         NT.forEach(nt -> System.out.println(nt));

        //  method reference
        apv.forEach(System.out::println);
        
    }
}
