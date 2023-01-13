package OO.Polimorfismo;

public class principal {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();

        Arroz a1 = new Arroz(0.3);
        Carne c1 = new Carne(0.1);
//        Comida cd1 = new Comida();

        System.out.println(p1.getPeso());
        p1.comer(a1);
        p1.comer(c1);
        System.out.println(p1.getPeso());

    }
}
