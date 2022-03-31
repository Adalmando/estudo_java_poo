package aula_cinco;

public class NumerosPrimos {
    public static void main(String[] args) {
        
        //quantidades de numeros primos maximos do vetor
        int[] primos = new int[100];
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
                System.out.println("Numero primo encontrado: "+valorAtual);
            }
            valorAtual++;
        }
    }
}