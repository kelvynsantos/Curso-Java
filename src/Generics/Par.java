package src.Generics;

import java.util.Objects;

public class Par<C,V> {
    private C chave;
    private V valor;
    public Par(){

    }
    public Par(C chave, V valor) {
        super();
        this.chave = chave;
        this.valor = valor;
    }
    public C getChave() {
        return chave;
    }
    public V getValor(){
        return valor;
    }
    public void SetChave(C chave) {
        this.chave = chave;
    }
    public void SetValor(V valor) {
        this.valor = valor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Par<?, ?> par)) return false;
        return Objects.equals(chave, par.chave);
    }

    @Override
    public int hashCode() {
        return Objects.hash(chave);
    }
}
