package Classes_Metodos.Classe;

public class ProdutoTeste {
    public static void main(String[] args) {
    Produto produto1 = new Produto();
    produto1.nome = "notebook";
    produto1.preco = 3354;
    produto1.desconto = 0.15;

    var produto2 = new Produto();
    produto2.nome = "caneta preta";
    produto2.preco = 3.5;
    produto2.desconto = 0.15;

        System.out.println(produto1.nome + produto1.preco + produto1.desconto);
        System.out.println(produto2.nome + produto2.preco + produto2.desconto);

        Double precoFinal1 = produto1.preco * (1-produto1.desconto);
        Double precoFinal2 = produto2.preco * (1- produto2.desconto);
        Double mediaCarrinho = ((precoFinal1 + precoFinal2)/2);
        System.out.printf(" Média do carrinho: %.2f.",mediaCarrinho);
    }
}
