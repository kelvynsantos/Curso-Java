package Classes;

public class Produto {
    String nome;
    double preco;
     static double desconto  = 0.20;

    Produto(){

    }

    Produto(String nomeInicial, double precoProduto) {
        nome = nomeInicial;
        preco = precoProduto;
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


