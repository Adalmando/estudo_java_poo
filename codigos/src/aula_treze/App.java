package aula_treze;

import java.util.ArrayList;

public class App{
    public static void main(String[] args) throws Exception {
        
        Aluno a1 = new Aluno("Adalmando Araujo", 21,"asdas787");

        Professor p1 = new Professor("Rodrigo Vilar", 21, "LCC");

        Aluno a2 = new Aluno("Eduardo Costa", 21, "Sds3434");
        
        Professor p2 = new Professor("Wagner Costa", 60, "Estrutura de dados");
        

        ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
        pessoas.add(a1);
        pessoas.add(p1);
        pessoas.add(a2);
        pessoas.add(p2);

        for(Pessoa p: pessoas){
            p.mostrarDados();
        }
       
    }    
}    