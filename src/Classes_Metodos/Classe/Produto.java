package Classes_Metodos.Classe;

public class Produto {
    String nome;
    double preco;
    double desconto;

    Produto(){

    }

    Produto(String nomeInicial, double precoProduto, double descontoProduto) {
        nome = nomeInicial;
        preco = precoProduto;
        desconto = descontoProduto;

    }
    double precoComDesconto(double descontoGerente) {

        return preco * (1 - desconto + descontoGerente);
    }

    double precoComDesconto(){
        return preco * (1-desconto);
    }

    String MostrarProdutos() {
        return String.format("%s, preço: %f, desconto : %f",nome,preco,desconto);
    }
}


