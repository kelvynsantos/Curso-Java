import modelo.Tabuleiro;
import modelo.visao.TabuleiroConsole;

public class Aplicacao {
    public static void main(String[] args) {
        Tabuleiro tabuleiro = new Tabuleiro(6,6,6);

        new TabuleiroConsole(tabuleiro);
        tabuleiro.abrir(3,3);
        tabuleiro.alterarMarcado(4,4);
        tabuleiro.alterarMarcado(4,5);
        System.out.println(tabuleiro);

    }
}
