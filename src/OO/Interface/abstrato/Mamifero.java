package OO.Interface.abstrato;

public abstract class Mamifero extends Animal{
    @Override
    public String mover(){
        return "patas";
    }
    public abstract String mamar();
}
