package EstruturasDeDados;

import java.util.Objects;

public class User {
    String nome;

    User (String nome) {
        this.nome = nome;
    }
    public  String toString() {
        return "Meu nome é" + this.nome + ".";
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return nome.equals(user.nome);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result =  prime * result + ((nome == null) ? 0 : nome.hashCode());
                 return result ;
    }
}