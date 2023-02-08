package OO.Interface.abstrato;

public class principal {
    public static void main(String[] args) {
        // Animal m = new Animal(); -- nao é posivvel instanciar uma classe abstrata
        Animal m = new Cachorro();
        System.out.println(m.mover());

    }
}
