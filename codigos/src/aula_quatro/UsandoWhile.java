package aula_quatro;

public class UsandoWhile {
    public static void main(String[] args) {
        
        int valor = 5;
        int fatorial = 1;

        // no while, primeiro se checa a condição, se ela não é satisfeita, o codigo
        // pula tudo que tiver dentro do bloco do while, caso seja satisfeita a 
        // condição, o codigo do bloco roda, até a condição não maias ser satisfeita
        while(valor > 1){
            fatorial *= valor;
            valor--;
        }
        System.out.println(fatorial);
    }
}
