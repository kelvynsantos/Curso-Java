public class ProdutoTeste {
    public static void main(String[] args) {
        Produto p1 = new Produto();
        p1.nome = "Notebook Acer 15 8GB";
        p1.preco = 2300;
        // .desconto = 0.15;

        Produto p2 = new Produto("Caneta preta", 2.87);
        Produto.desconto = 0.12;
        System.out.println(p1.precoDesconto);
        System.out.println(p2.precoDesconto);
    }
}
