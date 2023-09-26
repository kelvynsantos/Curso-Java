package src.Generics;

public class CaixaTeste {
    public static void main(String[] args) {
        Caixa caixaA = new Caixa();
        caixaA.guardar(2.3);
        Double coisa = (Double) caixaA.abrir();
        System.out.println(coisa);

    }
}
