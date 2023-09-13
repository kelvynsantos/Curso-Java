package src.LEGACY.Arrays_e_Colecoes;

public class for_each {
    public static void main(String[] args) {
        double[] notas = {7.0,8.2,4.5,7.3};
        double total = 0;
        for( double nota: notas ) {
            total += nota;
        }
    }
}
