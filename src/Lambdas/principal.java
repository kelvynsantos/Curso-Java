package Lambdas;

public class principal {
    public static void main(String[] args) {
        Calculo soma = (x,y) -> { return x + y;};

        System.out.println(soma.executar(2,3));

        Calculo multi =  (x,y) -> x+y;
        Calculo div = (x,y) -> x/y;
        Calculo sub = (x,y) -> x-y;

        System.out.println(multi.executar(2,3));
        System.out.println(div.executar(4,2));
        System.out.println(sub.executar(4,1));
    }
}
