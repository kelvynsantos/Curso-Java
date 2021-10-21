package EstruturasDeDados;

import java.util.Objects;

public class Usuario {
    String nome;
    String email;

    @Override
    public boolean equals(Object o) {
//        if (this.equals(o)) return true;
//        if (o.equals(null) || getClass() != o.getClass()) return false;
        if (o instanceof Usuario) {
            Usuario usuario = (Usuario) o;
            boolean nomeIgual = usuario.nome.equals(this.nome);
            boolean emailIgual = usuario.email.equals(this.email);
            return nomeIgual && emailIgual;
        }else {
            return false;
        }
    }
    @Override
    public int hashCode() {
        return Objects.hash(nome, email);
    }
}
