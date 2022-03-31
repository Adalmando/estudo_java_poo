package aula_oito;

public class FormatacaoString{
    public static void main(String[] args) {
        listarProdutos();
    }

    public static void listarProdutos(){
        String[] nomes = new String[] {"Abacaxi", "Banana", "Laranja", "Morango", "Uva"};
        double[] precos = new double[] {4.25, 2.33, 2.99, 7.89, 11.79};
        int[] qtdes = new int[] {432, 26, 365, 811, 712};

        System.out.printf("%-10s|%7s | %7s%n", "Nome", "Preço", "Estoque");
        System.out.println("----------------------------");
        for(int i = 0; i< nomes.length; i++){
            System.out.printf("%-10s|%7.2f | %07d%n",nomes[i], precos[i], qtdes[i]);
        }
    }
}