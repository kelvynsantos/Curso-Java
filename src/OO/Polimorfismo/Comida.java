package OO.Polimorfismo;

public abstract class Comida {
    private double peso;
    public Comida(double peso){
        setPeso(this.peso);
    }
    public double getPeso(){return peso;}
    public void setPeso(double peso){
        if (peso >=0){
            this.peso = peso;
        }
    }
}
