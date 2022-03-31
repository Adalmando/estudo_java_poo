package aula_quinze;

import java.io.Serializable;

public class Pessoa implements Serializable{

    private String nome;
    private int id;
    private int idade;
    private String senha;
       
    public Pessoa(String nome, int id, int idade, String senha){
        this.setNome(nome);
        this.setId(id);
        this.setIdade(idade);
        this.setSenha(senha);
    }

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public int getId(){
        return this.id;
    }
    public void setId(int id){
        this.id = id;
    }

    public int getIdade(){
        return this.idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }

    public String getSenha(){
        return this.senha;
    }
    public void setSenha(String senha){
        this.senha = senha;
    }

    public void mostrarDados(){
        System.out.printf("\nNome: %s\nID: %d\nIdade: %d\nSenha: %s",
        this.getNome(), this.getId(), this.getIdade(), this.getSenha());
    }

   


}