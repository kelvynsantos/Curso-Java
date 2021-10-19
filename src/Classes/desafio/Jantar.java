package Classes.desafio;

public class Jantar {
    public static void main(String[] args) {

        Comida f  = new Comida(0.333,"feijao");
        Comida a = new Comida(0.400,"arroz");

        Pessoa p1 = new Pessoa("Marcos",54.00);
        System.out.println(p1.antes());
        p1.comer(f);
        System.out.println(p1.antes());
        p1.comer(a);
        System.out.println(p1.antes());
    }
}
