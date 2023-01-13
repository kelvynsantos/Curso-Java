package OO.Heranca.dsf;

public class Fusca extends Carro{
    public Fusca(int VelAtual, int VelMax) {
        super(VelAtual,VelMax);
    }
    @Override
    public void acelerar() {
            VelAtual += 3;
        }
    @Override
    public void frear(){
    if (VelAtual >= 3){
        VelAtual -= 2;
    } else{
        VelAtual = 0;
        }
    }
}
