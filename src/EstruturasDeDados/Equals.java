package EstruturasDeDados;

import java.util.Date;

public class Equals {
    public static void main(String[] args) {
        Usuario u1 = new Usuario();
        u1.nome = "Pedro Santos";
        u1.email = "pedrosantos@gmail.com";

        Usuario u2 =  new Usuario();
        u2.nome = "Pedro Santos";
        u2.email = "pedrosantos@gmail.com";

//        System.out.println(u1 == u2);
        System.out.println(u1.equals(u2));
        System.out.println(u2.equals(u1));
        System.out.println(u2.equals(new Date()));
    }
}
