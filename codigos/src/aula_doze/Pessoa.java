package aula_doze;

public class Pessoa {
    
    private String nome;
    private int idade;
    private double salario;

    public String getNome(){
        return nome;
    }

    public void setNome(String nome) throws Exception{
        int qtdDePalavras = nome.trim().split(" ").length;
        if(qtdDePalavras>1){
            this.nome = nome;
        } else {
            throw new Exception("O nome deve conter mais de uma palavra");
        }
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade) throws Exception{
        if(idade < 0)
            throw new Exception("Idade deve ser maior ou igual a zero!");
        else if(idade > 120)
            throw new Exception("Idade deve ser menor ou igual a 120!");    
        else
            this.idade = idade;
    }

    public double getSalario(){
        return this.salario;
    }

    public void setSalario(double salario) throws Exception{
        if(salario > 0)
            this.salario = salario;
        else    
            throw new Exception("Salário deve ser maior que zero!");
    }

    public Pessoa(String nome, int idade, double salario) throws Exception{
        this.setNome(nome);
        this.setIdade(idade);
        this.setSalario(salario);
    }
    
    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
        this.salario = 0;
    }
    public Pessoa(String nome){
        this.nome = nome;
        this.idade = 0;
        this.salario = 0;
    }
    public Pessoa(){
        this.nome = "Fulano";
        this.idade = 0;
        this.salario = 0;
    }

    public void mostrarDados(){
        System.out.printf("%s tem %d anos de idade e recebe R$ %.2f.\n",this.getNome(), this.getIdade(), this.getSalario());
    }
}
