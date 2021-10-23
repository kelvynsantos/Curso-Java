package OO.Composicao;

public class CursoTeste {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Maria");
        Aluno a2 = new Aluno("João");
        Aluno a3 = new Aluno("Marcos");

        Curso c1 = new Curso("Java Completo");
        Curso c2 = new Curso("Desenvolvimento Web Completo");
        Curso c3 = new Curso("React Native");

        c1.addAluno(a1);
        c1.addAluno(a2);

        c2.addAluno(a1);
        c2.addAluno(a3);

        a1.addCurso(c3);
        a2.addCurso(c3);
        a3.addCurso(c3);

        for (Aluno aluno: c1.alunos) {
            System.out.println("alunos do curso " + c1.nome);
            System.out.println("nomes: " + aluno.nome);
        }
        a1.obterCursoNome("Java Completo");

    }
}
