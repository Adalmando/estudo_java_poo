package aula_sete;

public class CompareTo{
    public static void main(String[] args) {
      
        // compareTo usas uma comparação de ordem alfabética, e retorna valores inteiros, -X se a String comparada for menor, 0
        // se for igual e +X se for maior, excelente metodo para organização de elementos em ordem alfabética e usas muito pouco
        // sua memória para processsar as açoes!
        
        String a = "Casa";
        String b = "casa";

        System.out.println(a.compareTo(b));
        System.out.println(a.compareToIgnoreCase(b));

        if(a.compareTo(b)< 0)
            System.out.println("a é diferente de b e a possúi menons caractéres que b.");
         
        else if(a.compareTo(b) > 0)
            System.out.println("a é diferentte de b e a possúi mais caractéres que b.");
        
        else
            System.out.println("a é igual a b.");
        
    }
}