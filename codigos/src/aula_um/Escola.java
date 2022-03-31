package aula_um;

public class Escola {
     
    public void Matricular(Aluno aluno){
        System.out.printf("Aluno %s matriculado na escola!\n", aluno.getNome());
    }
    public void cancelarMatricula(Aluno aluno){
        System.out.printf("Aluno %s desmatriculado da escola!\n", aluno.getNome());
    }
}
