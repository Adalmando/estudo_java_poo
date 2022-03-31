package aula_onze;

public class Pessoa {
    
    private String nome;
    private int idade;
    private double peso;

    public Pessoa(String nome, int idade, double peso){
        this.nome = nome; 
        this.idade = idade; 
        this.peso = peso;
    }

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
        this.peso = 0;
    }
    public Pessoa(String nome){
        this.nome = nome;
        this.idade = 0;
        this.peso = 0;
    }

    public Pessoa(){
        this.nome = "Fulano de tal";
        this.idade = 0;
        this.peso = 0;
    }

    public void mostrarDados(){
        System.out.printf("%s tem %d anos e pesa %.2f Kg's.\n", this.nome, this.idade, this.peso);
        System.out.println();
    }
}
