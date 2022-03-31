package aula_um;

public class App {
    public static void main(String[] args) {
        
        Aluno a1 = new Aluno("Adalmando", "20190091030");
        Aluno a2 = new Aluno("Rodrigo", "20140041260");

        Escola e1 = new Escola();
        Curso c1 = new Curso();

        e1.Matricular(a1);
        e1.cancelarMatricula(a1);

        c1.Matricular(a2);
        c1.cancelarMatricula(a2);
    }
}

