package aula_quatro;

public class ForEach {
    public static void main(String[] args) {

        int[] vetor = {10, 20, 30, 40, 50};
        int soma = 0;

        //for-each = para cada
        for(int elemento : vetor){
            soma += elemento;
        }
        System.out.println(soma);
    }
}