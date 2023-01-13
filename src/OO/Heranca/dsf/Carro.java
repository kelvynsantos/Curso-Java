package OO.Heranca.dsf;

public class Carro {
    public final int VelMax;
    public int VelAtual ;
    private int delta = 5;

     protected Carro (int velMaxima) {
         VelMax = velMaxima;
     }


     public void acelerar() {
         if (VelAtual + delta > VelMax) {
             VelAtual = VelMax;
         } else {
             VelAtual += delta;
         }
     }
    public void frear(){
         if (VelAtual >= 5){
             VelAtual -=5;
         }else {
             VelAtual = 0;
         }
    }

    public int getDelta(){return delta;}
    public void setDelta(int delta){
         this.delta = delta;
    }

    public String toString(){
         return "Velocidade e : "+ VelAtual +"km/h";
    }
}
