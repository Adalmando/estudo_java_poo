package aula_treze;

import javax.print.event.PrintEvent;

public class Teste {
    public static void main(String[] args) {
        
        int [] numeros = {2,3,4,5};
        int[] denom = {1,2,3};

        for(int k =0; k<numeros.length; k++){
            System.out.println(numeros[k]+ "/" + denom[k]+ " ="+ (numeros[k]/denom[k]));
        }
    }
}
