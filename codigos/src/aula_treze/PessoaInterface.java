package aula_treze;

public interface PessoaInterface {
    
    public void mostrarIdade();
    public void mostrarNome();
    public int getIdade();
    public String getNome();
    public void setIdade(int idade)throws Exception;
    public void setNome(String nome)throws Exception;
}
