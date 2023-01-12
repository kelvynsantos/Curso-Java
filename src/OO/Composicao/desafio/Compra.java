package OO.Composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {

    List<Item> itens = new ArrayList<>();
    void additem( Produto p, int qtd) {
        this.itens.add(new Item(p,qtd));
    }

    void itemAdd(String nome,double preco, int qtde){
        this.itens.add( new Item(new Produto(nome,preco), qtde));
    }
    double obterTotal() {
        double total = 0;
        for (Item item : itens) {
            total += item.quantidade * item.produto.preco;
        }
        return total;
    }
}
