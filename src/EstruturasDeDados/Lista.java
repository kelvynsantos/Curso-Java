package EstruturasDeDados;

import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {
        ArrayList<User> lista = new ArrayList<>();
        User u1 = new User("Ana");
        lista.add(u1);

        lista.add(new User("Marcos"));
        lista.add(new User("Manu"));
        lista.add(new User("Isa"));
        lista.add(new User("Ana"));
        lista.add(new User("Bia"));
        lista.add( new User("Marcos"));

        System.out.println(lista.get(4)); //acessar pelo indice
        for (User u : lista) {
            System.out.println(u.toString());
        }
        lista.remove(1);
        lista.remove(new User("Ana"));

        System.out.println("Tem ? " + lista.contains(new User("Isa")));
    }
}
