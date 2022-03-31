package aula_treze;

import java.lang.Exception;

public class Aluno extends Pessoa implements EstagiarioInterface{
    
    public String matricula;

    public Aluno(String nome, int idade, String matricula) throws Exception{
        super(nome, idade);
        this.setMatricula(matricula);
    }

    public String getMatricula(){
        return this.matricula;
    }

    public String getNome(){
        return this.nome;
    }
    
    
    public void setMatricula(String matricula) throws Exception{
        if(matricula.length()>1)
            this.matricula = matricula.toUpperCase(); 
        else
            throw new Exception("A matrícula deve conter mais de um caractére!");   
    }
    
    public void mostrarDados(){
        System.out.printf("Nome: %s\nIdade: %d\nMatricula: %s\n", this.getNome(), this.getIdade(), this.getMatricula());
        System.out.println();
    }

    @Override
    public void fazerProva() {
        System.out.println("Fazendo prova...");
    }

    @Override
    public void entregaRelatorio() {
        System.out.println("Entregando relatório...");   
    }
}