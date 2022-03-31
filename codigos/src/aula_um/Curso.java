package aula_um;

public class Curso {

    public void Matricular(Aluno aluno){
        System.out.printf("Aluno %s matriculado no curso!\n", aluno.getNome());
    }
    public void cancelarMatricula(Aluno aluno){
        System.out.printf("Aluno %s desmatriculado do curso!\n", aluno.getNome());
    }
}
