package arrays;

import java.util.ArrayList;

public class Turma {

    String identificacao;
    String nomeProfessor;
    ArrayList<Aluno> alunos = new ArrayList<>();

    void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    void removeAluno(Aluno aluno) {
        alunos.remove(aluno);
    }

    void imprimirAlunos() {
        for (Aluno aluno : alunos) {
            System.out.printf("%s (%d anos)%n", aluno.nome, aluno.idade);
        }
    }


}
