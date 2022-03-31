package aula_doze;


public final class Professor extends Pessoa{
    
    private String formacao;

    public Professor(String nome, int idade, double salario, String formacao) throws Exception{
        super(nome, idade, salario);
        this.setFormacao(formacao);
    }

    public Professor(){
        super();
        this.formacao = "estudante";
    }

    public String getFormacao(){
        return this.formacao;
    }

    public void setFormacao(String formacao) throws Exception{
        if(formacao.length() > 1)
            this.formacao = formacao;
        else
            throw new Exception("A formação deve ter pelo menos 2 caractéres!");
    }

    public void mostrarDados(){
        System.out.printf("%s tem %d anos, é formado em %s e recebe R$ %.2f.\n", 
        this.getNome(), this.getIdade(), this.getFormacao(), this.getSalario());
    }
}
