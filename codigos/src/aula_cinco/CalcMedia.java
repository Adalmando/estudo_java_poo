package aula_cinco;

public class CalcMedia {
    public static void main(String[] args) throws Exception {
        
        // CALCULANDO MÉDIA COM FOR E LENGHT:
        int[] vetor1 = {13, 25, 43, 78, 33};
        int somaVetor1 = 0;

        for(int i = 0; i < vetor1.length; i++){
            somaVetor1 += vetor1[i];
        }
        System.out.println("\n--------------------------");
        System.out.println("A média do vetor1 é " + (float)somaVetor1/vetor1.length);
        System.out.println("--------------------------");
        
        //CALCULANDO MÉDIA COM FOR-EACH:
        int[] vetor2 = {13, 25, 43, 78, 33};
        int somaVetor2 = 0;
        for(int elemento : vetor2){
            somaVetor2 += elemento;
        }
        System.out.println("A média do vetor2 é "+(float)somaVetor2/vetor2.length);
        System.out.println("--------------------------");

        //VETOR3 NA ORDEM INVERSA:
        int[] vetor3 = {13, 25, 43, 78, 33};
        System.out.println("Vetor3 na ordem inversa:");
        System.out.println("--------------------------");
        for (int i = vetor1.length-1; i >= 0; i-- ){
            System.out.format("%d, ", vetor3[i]);
        }
        System.out.println("\n--------------------------");

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
                break;
            }
            System.out.format("%d, ",soma[i]);
        }
    }

}
