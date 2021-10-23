package OO.Composicao;

public class CompraTeste {
    public static void main(String[] args) {
        Compra c1 = new Compra();
        c1.cliente = "João Paulo";
        c1.addItem("Caderno",2,23.4);
        c1.addItem("borracha",4,1.2);
        c1.addItem("canete", 10,2.5);
        c1.addItem("giz",7,1);

        System.out.println(c1.itens.size());
        System.out.println(c1.getValorTotal());
    }
}
