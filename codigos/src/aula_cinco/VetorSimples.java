package aula_cinco;

public class VetorSimples {
    public static void main(String[] args) {
        
        // vetor 1 não foi inicializado, por tanto, nenhum espaço da memoria foi 
        // reservao para ele.

        //vetor 2 foi inicializado com 3 posições (0,1,2), mas ambas vazias, pois não
        //foram especificadas.
      
        //vetor 3 foi inicializado e definido os elementos dele (10, 20 e 30)
        // [0] = 10, [1] = 20 e [2] = 30.
        
        //int[] vetor1;
        int[] vetor2 = new int[3];
        int[] vetor3 = {10, 20, 30};

        // não posso alterar o valor do indice 0 do vetor1, pois, ele não foi iniciali-
        //-zado, ja o vetor 2 e 3, sim.
        // vetor1[0] = 1;
        vetor2[0] = 1;
        vetor3[0] = 1;

        int soma = 0;
        for(int i = 0; i < vetor3.length; i++){
            soma += vetor3[i];
        }
        System.out.println(soma);

    }
}
