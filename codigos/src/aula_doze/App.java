package aula_doze;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        
        List <Pessoa> pessoas = new ArrayList<Pessoa>();
        pessoas.add(new Aluno("Eduardo Lima", 20, "3490safsaf"));
        pessoas.add(new Professor("Rodrigo Vilar", 45, 8000, "Doutor em ciencia da computação"));
        pessoas.add(new Aluno("Adalmando Araujo", 21, "asdas32423"));

        //pessoas.stream().filter(a -> a.getIdade() == 45).forEach(a -> a.mostrarDados());

        for(Pessoa p : pessoas){
            p.mostrarDados();    
        }
    }
}
