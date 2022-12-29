package OO.Composicao;

import java.util.ArrayList;

public class Curso {
    final String nome;
    private final ArrayList<Aluno> alunos = new ArrayList<>();
    Curso(String nome) {
        this.nome = nome;
    }
    void addAluno(Aluno aluno){
        this.getAlunos().add(aluno);
        aluno.cursos.add(this);
    }
	public ArrayList<Aluno> getAlunos() {
		return alunos;
	}
}
