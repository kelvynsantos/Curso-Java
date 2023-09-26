package src.LEGACY.Topicos_avancados;

public class recursive {
    public static void main(String[] args) {
        System.out.println(fatorial(4));
    }
        private static int fatorial(int numero){
            if( numero <= 1) {
                return 1;
            }
            return numero * fatorial(numero -1);
        }
    }
