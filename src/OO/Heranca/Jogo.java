package OO.Heranca;
public class Jogo {
    public static void main(String[] args) {
        Jogador j1 = new Jogador();
//        j1.andar(Direcao.NORTE);
//        j1.andar(Direcao.LESTE);
//        j1.andar(Direcao.NORTE);
//        j1.andar(Direcao.OESTE);

        j1.y =10;
        j1.x = 10;
        Heroi h1 = new Heroi();
        h1.x = 10;
        h1.y = 11;
        System.out.println(j1.vida+"---"+ h1.vida);
        j1.atacar(h1);
        h1.atacar(j1);

        System.out.println(j1.vida+"-----"+h1.vida);

    }
}
