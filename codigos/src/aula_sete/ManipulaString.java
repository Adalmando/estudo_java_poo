package aula_sete;

public class ManipulaString {
    public static void main(String[] args) {

       // String nomes = "  Amanda ADALMANDO ARMando francisca";
        String nomesComPonto = "adaLmando;tica;francelio;amandA";

       // String[] listaUmSeparada = separaStrings(nomes, " ");
        String[] listaDoisSeparada = Metodos.separaStrings(nomesComPonto, ";");

        
       // printaLista(listaUmSeparada);
        Metodos.printaLista(listaDoisSeparada);
        System.out.println(listaDoisSeparada);
    }

    class Metodos{

        public static String[] separaStrings(String nomes, String separador){
            String [] resultado;
            resultado = nomes.trim().toUpperCase().split(separador);
            return resultado;
        }
    
        public static String[] acharInicial(String[] lista, String inicial){
            String nomesEncontrados = "";
            for(String nomes : lista){
                if(nomes.indexOf(inicial) == 0){
                    nomesEncontrados+=(nomes +" ");
                }
            }
            String[] resultado = nomesEncontrados.toUpperCase().split(" ");
            return resultado;
        }
    
        public static void printaLista(String[] lista){
            int cont = 0;
            System.out.println("LISTA: ");
            for(String elemento : lista){
                System.out.printf("\n%s",elemento);
                cont++;
            }
            System.out.println("\n");
            System.out.println("A lista contém " +cont+ " elementos");
    
        }
    
    }
}
