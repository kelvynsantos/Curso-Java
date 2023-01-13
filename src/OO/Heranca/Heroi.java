package OO.Heranca;

public class Heroi  extends Jogador{

    public Heroi(int x,int y) {
        super(x,y);
    }

    public boolean atacar(Jogador oponente){
        int deltaX = Math.abs(getX() - oponente.getX());
        int deltaY = Math.abs(getY() - oponente.getY());

        if (deltaX == 0 && deltaY == 1) {
            oponente.vida -= 20;
            return true;
        }else if (deltaX == 1 && deltaY == 0) {
            oponente.vida -= 20;
            return true;
        }else {
            return false;
        }
    }
}
