package Classes_Metodos.Classe;

public class ProdutoTeste {
    public static void main(String[] args) {
    Produto produto1 = new Produto("Notebook",3354,0.15);
//    produto1.nome = "notebook";
//    produto1.preco = 3354;
//    produto1.desconto = 0.15;

    var produto2 = new Produto("caneta preta",3.5,0.15);
//    produto2.nome = "caneta preta";
//    produto2.preco = 3.5;
//    produto2.desconto = 0.15;

        System.out.println(produto1.MostrarProdutos());
        System.out.println(produto2.MostrarProdutos());

        Double precoFinal1 = produto1.precoComDesconto();
        Double precoFinal2 = produto2.precoComDesconto(0.1);
        Double mediaCarrinho = ((precoFinal1 + precoFinal2)/2);
        System.out.printf(" M�dia do carrinho: %.2f.",mediaCarrinho);
    }
}
