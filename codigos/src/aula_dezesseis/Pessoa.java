package aula_dezesseis;

public abstract class Pessoa implements PessoaInterface{
    
    protected String nome;
    protected int idade;

    public Pessoa(String nome, int idade) throws Exception{
        this.setNome(nome);
        this.setIdade(idade);
    }

    @Override
    public void mostrarIdade() {
        System.out.printf("Idade: %d\n",this.getIdade());        
    }

    @Override
    public void setIdade(int idade) throws Exception {
        if(idade < 0)
            throw new Exception("Idade menor que zero é impossível!");
        else if(idade>120)
            throw new Exception("Idade maior que 120 é impossível!");
        else
            this.idade = idade;
    }

    @Override
    public int getIdade() {
        return this.idade;
    }

    public void setNome(String nome)throws Exception{
        if(nome.length()<2)
            throw new Exception("Um nome deve ter mais de um caractére!");

        else if(!nome.matches("[A-Z a-z Çç]{"+nome.length()+"}"))
            throw new Exception("O nome não deve conter números!");        
        else               
            this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    @Override
    public void mostrarNome() {
        System.out.printf("Nome: %s\n",this.getNome());        
    }
}

