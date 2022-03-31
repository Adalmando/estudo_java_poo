
package aula_treze;

public class Professor extends Pessoa implements ProfessorInterface{
    
    public String formacao;

    public Professor(String nome, int idade, String formacao) throws Exception{
        super(nome, idade);
        this.setFormacao(formacao);
    }
    
    public String getFormacao(){
        return this.formacao;
    }

    public void setFormacao(String formacao)throws Exception{
        if(formacao.length()<2)
            throw new Exception("Formação deve ter melo menos 2 caractéres!");
        else
            this.formacao = formacao;
    }

    public void mostrarDados(){
        System.out.printf("Nome: %s\nIdade: %d\nFormação: %s\n",this.getNome(), this.getIdade(), this.getFormacao());
        System.out.println();
    }

    @Override
    public void corrigirProva() {
        System.out.println("Corrigindo provas!");
        
    }

    
}