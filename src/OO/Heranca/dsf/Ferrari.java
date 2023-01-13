package OO.Heranca.dsf;

public class Ferrari extends Carro implements Esportivo {
    public Ferrari(){
        this(321);
    }
    Ferrari( int VelMax) {
        super(VelMax);
        setDelta(15);

    }
    @Override
    public void acelerar() {
        VelAtual += 35;
    }
    @Override
    public void frear(){
        if (VelAtual >= 35){
        VelAtual -= 10;
    }else{
            VelAtual = 0;
        }
    }

    @Override
    public void ligarT() {
        setDelta(35);

    }

    @Override
    public void dlgT() {
        setDelta(15);
    }
}
