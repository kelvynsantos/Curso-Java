package OO.Heranca.test;

import OO.Heranca.Heroi;
import OO.Heranca.Jogador;

public class Jogo {
    public static void main(String[] args) {
        Jogador j1 = new Jogador(11,11);
//        j1.andar(Direcao.NORTE);
//        j1.andar(Direcao.LESTE);
//        j1.andar(Direcao.NORTE);
//        j1.andar(Direcao.OESTE);

        j1.setY(10);
        j1.setX(10);
        Heroi h1 = new Heroi(12,11);
        h1.setX(10);
        h1.setY(11);
        System.out.println(j1.vida+"---"+ h1.vida);
        j1.atacar(h1);
        h1.atacar(j1);

        System.out.println(j1.vida+"-----"+h1.vida);

    }
}
