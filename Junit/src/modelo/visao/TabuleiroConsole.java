package modelo.visao;

import excecao.ExplosionException;
import excecao.SairException;
import modelo.Tabuleiro;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class TabuleiroConsole {
    private Tabuleiro tabuleiro;
    private Scanner input =  new Scanner(System.in);

    public TabuleiroConsole( Tabuleiro tabuleiro) {
        this.tabuleiro = tabuleiro;
        executarJogo();
    }
    private void executarJogo() {
        try {
            boolean continuar = true;
            while (continuar) {
                cicloJogo();
                System.out.println("Outra partida ? (S/n)");
                String resposta = input.nextLine();
                if ("n".equalsIgnoreCase(resposta)) {
                    continuar = false;
                } else {
                    tabuleiro.reiniciar();
                }
            }
        } catch (SairException e) {
            System.out.println("Tchau");
        } finally {
            input.close();
        }
    }
        private void cicloJogo(){

            try {
                while(!tabuleiro.objetivoAlcancado()) {
                    System.out.println(tabuleiro);
                    String digitado = capturarValorDigitado("Digite (x,y):");
//                    System.out.println(Arrays.toString(digitado.split(",")));
                    Iterator<Integer> xy =  Arrays.stream(digitado.split(",")).map(e -> Integer.parseInt(e.trim())).iterator();

                    digitado = capturarValorDigitado("1 - Abrir ou 2 - (Des)Marcar:");
                    if("1".equals(digitado)) {
                        tabuleiro.abrir(xy.next(), xy.next());
                    }else if("2".equals(digitado)){
                        tabuleiro.alterarMarcado(xy.next(), xy.next());
                    };
//                    System.out.println(xy.next());
//                    System.out.println(xy.next());
                }
                    System.out.println(tabuleiro);
                    System.out.println("Você ganhou!!!");
            } catch(ExplosionException e){
                System.out.println(tabuleiro);
                System.out.println("Você perdeu!!!");
            }
        }
        private String capturarValorDigitado(String texto) {
            System.out.println(texto);
            String digitado = input.nextLine();
            if("n".equalsIgnoreCase(digitado)) {
                throw new SairException();
            }
            return digitado;
        }
}
