package EstruturasDeDados;

import java.util.HashSet;

public class Hash {
    public static void main(String[] args) {
        HashSet<User> usuarios = new HashSet<>();

        usuarios.add(new User("Pedro"));
        usuarios.add(new User("Maria"));
        usuarios.add(new User("Ana"));
        usuarios.add(new User("Guilherme"));

        boolean result = usuarios.contains(new User("Ana"));
        System.out.println(result);

    }
}
