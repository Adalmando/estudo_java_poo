package aula_seis;

public class ManipulaVetor {    
    public static void main(String[] args) throws Exception {        
       int[] numerosPrimos = maximoDePrimos(1000);
       printarVetor(numerosPrimos);
       
    }
  
    public static int[] obterVetorInvertido(int[] vetor1){
        
        int[] vetorInvertido = new int[vetor1.length];
        int cont = 0;

        for(int i = vetor1.length-1; i>=0; i--){
            vetorInvertido[cont] = vetor1[i];
            cont++;        
        }
        return vetorInvertido;
    }

    public static void printarVetor(int[] vetor){
        
        for(int elemento : vetor){
            System.out.print(elemento + ", ");
        }
        System.out.println();
    }

    public static int[] somaVetores(int[] vetor1, int[] vetor2){
        
        int[] resultado = new int[vetor1.length];

        for(int k = 0; k< vetor1.length; k++){
            resultado[k] = vetor1[k] + vetor2[k];
        }

        return resultado;
    }

    public static int[] maximoDePrimos(int numero){
         //quantidades de numeros primos maximos do vetor
         int[] primos = new int[numero];
         int qtDePrimos = 0;
         int valorAtual = 1;
 
         while(qtDePrimos < primos.length){
             
             boolean ehPrimo = true;
            
             for(int i = 2; valorAtual > i; i++){
                 if(valorAtual % i == 0){
                     ehPrimo = false;
                     break;   
                 }
             }
 
             if(ehPrimo){
                 qtDePrimos++;
                 primos[qtDePrimos-1] = valorAtual;
             }
             valorAtual++;
         }
         return primos;
    }
}
