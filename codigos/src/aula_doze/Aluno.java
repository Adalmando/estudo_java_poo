package aula_doze;

public final class Aluno extends Pessoa{
    
    private String matricula;

    public Aluno(){
        super();
        this.matricula = "inexistente";
    }

    public Aluno(String nome, int idade, String matricula){
        super(nome, idade);
        this.setMatricula(matricula);
    }

    public String getMatricula(){
        return this.matricula;
    }

    public void setMatricula(String matricula){
        this.matricula = matricula.toUpperCase();
    }

    public void mostrarDados(){
        System.out.printf("%s tem %d anos e sua matrícula é %s.\n",this.getNome(), this.getIdade(), this.getMatricula());
    }
}
