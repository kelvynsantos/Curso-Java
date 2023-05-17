package src.StreamAPI;

import java.util.function.UnaryOperator;

public class Utilitarios {
    private Utilitarios(){}
    public final static UnaryOperator<String> maiuscula = n -> n.toUpperCase();
    public final static UnaryOperator<String> minuscula = n -> n.toLowerCase();
    public final static UnaryOperator<String> primeira = n -> n.charAt(0) + "";
    public final static String exclamacao(String n) { return  n + "!!!";}
}
