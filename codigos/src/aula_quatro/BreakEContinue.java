package aula_quatro;

public class BreakEContinue {
    public static void main(String[] args) {

        //ao usar o break quando a estrutura de repetição chegar no 5,
        //fazemos com que naquela ocasião, a estrutura pare de rodar
        //e encerramos o bloco de estruturas, literalmente um break.
        System.out.println("break");
        for(int i = 0; i < 10; i++){
            if(i == 5){
                break;
            }
            System.out.format("%d, ", i);
        }
        System.out.println("\ncontinue");
        //ao usar o continue, quando a estutura chegar onde ele foi chamado, nesse
        //caso no 5, ele interrompe aquela interação isolada e pula para a interação
        //do 6, sem interromper o bloco instruções.
        for(int i = 0; i < 10; i++) {
            if(i == 5){
                continue;
            }
            System.out.format("%d, ", i);
        }
    }
}
