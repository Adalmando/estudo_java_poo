package aula_cinco;

public class Soma2Vetores {
    public static void main(String[] args) {
         
        //SOMA DE DOIS VETORES
        
         System.out.println("Soma de vet1 e vet2:");
         System.out.println("--------------------------");;
         int[] vet1 = {13, 25, 43, 78, 33}; 
         int[] vet2 = {54, 82, 26, 51, 26};
         int[] soma = new int[5];
 
         for(int i = 0; i < vet1.length; i++){
             soma[i] += vet1[i] + vet2[i];
         }
         for(int i = 0; i < vet1.length; i++){
             if(i == soma.length-1){
                 System.out.format("%d.", soma[i]);

             }else if(i == soma.length-2){
                System.out.format("%d e ", soma[i]);

             } else{
             System.out.format("%d, ",soma[i]);
             
            }
         } 
         System.out.println("\nFim");
    }
}
