package src.Generics;

import java.util.Arrays;
import java.util.List;

public class ListaUtilTeste {
    public static void main(String[] args) {
        List<String> langs = Arrays.asList("JS","PHP","Java","C++");
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6);

        String ultimaLingaguem = (String) ListaUtil.getUltimo1(langs);
        System.out.println(ultimaLingaguem);

    }
}
