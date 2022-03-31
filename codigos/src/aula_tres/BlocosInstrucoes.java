package aula_tres;

public class BlocosInstrucoes {
    public static void main(String[] args) {
        
        int valor = -1;

        //OBSERVE QUE PODEMOS CRIAR VARIÁVEIS COM MESMO NOME, SE ELAS ESTIVEREM
        //DENTRO DE BLOCOS DIFERENTES!!!! EX: CONT
        
        if(valor == 0){
            int cont = 0;
            cont++;
            System.out.println(cont);
        }else if(valor > 0){
            int cont = 0;
            cont--;
            System.out.println(cont); 
        }else{
            System.out.println("valor menor que zero!");
        }
    }
}
