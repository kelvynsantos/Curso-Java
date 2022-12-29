package Tratamentos_Erros;
import OO.Composicao.Curso;
import java.util.ArrayList;
@SuppressWarnings("all")
public class Aluno {
    public final String nome;
    public final Integer nota;
    ArrayList<Curso> cursos = new ArrayList<>();
    Aluno(String nome) {
        this.nome = nome;
		this.nota = null;
    }
    public Aluno(String string, int i) {
		this.nome = string;
		this.nota = i;
		// TODO Auto-generated constructor stub
	}
	void addCurso(Curso curso) {
        this.cursos.add(curso);
//        curso.alunos.add(this);
    }
    public String toString() {
        return nome;
    }
    Curso obterCursoNome(String nome) {
        for(Curso curso: this.cursos) {
//            if(curso.nome.equalsIgnoreCase(nome)){
                return curso;
            }
//        }
        return  null;
    }
}
