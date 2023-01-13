package OO.Heranca;

public class Jogador {
    private int x,y;
    public int vida = 100;

    public int getX(){return x;}
    public int getY(){return y;}

    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }

    public Jogador(int x, int y){
        this.x = x;
        this.y = y;
    }
    public boolean andar(Direcao direcao){
        switch(direcao){
            case NORTE:
                y--;
                break;
            case SUL:
                y++;
                break;
            case LESTE:
                x++;
                break;
            case OESTE:
                x--;
                break;
        }
        return true;
    }
    public boolean atacar(Jogador oponente){
        int deltaX = Math.abs(x - oponente.x);
        int deltaY = Math.abs(y - oponente.y);

        if (deltaX == 0 && deltaY == 1) {
            oponente.vida -= 10;
            return true;
        }else if (deltaX == 1 && deltaY == 0) {
            oponente.vida -= 10;
            return true;
        }else {
            return false;
        }
    }
}
