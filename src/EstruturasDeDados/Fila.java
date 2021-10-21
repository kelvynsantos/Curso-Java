package EstruturasDeDados;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();

        fila.add("Ana"); //adicionar, retorna erro caso não consiga mais add
        fila.offer("Bia"); // Adicionar, retorna falso caso não consiga mais add
        fila.offer("Carlos");
        fila.add("Gui");
        fila.add("Bruna");
        fila.offer("Amanda");
        fila.add("Rafael");

        System.out.println(fila.peek()); //return false
        System.out.println(fila.element()); //return an exception

//         fila.size();
//         fila.clear();
//         fila.isEmpty();
        System.out.println(fila.poll()); // remove , return null
        System.out.println(fila.remove()); //remove, return an exceotion
        System.out.println(fila.contains("Amanda"));

    }
}
