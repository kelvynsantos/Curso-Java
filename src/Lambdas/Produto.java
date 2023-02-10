package Lambdas;

public class Produto extends Object {
    final String nome;
    public final double preco;
    public final double desconto;

    public Produto( String nome, Double preco, Double desconto) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    }

    public String toString(){
        double precof = preco * (1 - desconto);
        return "Nome" + nome +  "tem o preco de R$" + precof;

    }
}
