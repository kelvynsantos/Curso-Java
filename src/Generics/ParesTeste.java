package src.Generics;

public class ParesTeste {
    public static void main(String[] args) {
        Pares<Integer, String> resultadoConcurso = new Pares<>();
        resultadoConcurso.adicionar(1,"Maria");
        resultadoConcurso.adicionar(2,"Joao");
        resultadoConcurso.adicionar(3,"Ana");
        resultadoConcurso.adicionar(4,"Rebeca");

    }
}
