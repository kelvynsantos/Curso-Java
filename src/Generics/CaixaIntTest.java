package src.Generics;

public class CaixaIntTest {
    public static void main(String[] args) {
        CaixaInt<String> caixaA = new CaixaInt<>();
        caixaA.guardar("rr");
        String coisaA = caixaA.abrir();
        System.out.println(coisaA);

    }
}
