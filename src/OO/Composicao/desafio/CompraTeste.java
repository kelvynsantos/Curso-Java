package OO.Composicao.desafio;

public class CompraTeste {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("maria");
        Compra co1 = new Compra();
        co1.itemAdd("Caneta",9.65, 12);
        co1.additem(new Produto("Notebook", 3456), 2);

        c1.addCompra(co1);
        System.out.println(c1.total());
    }
}
