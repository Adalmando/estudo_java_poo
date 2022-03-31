package aula_tres;

public class SwitchCase {  
    public static void main(String[] args) {
        
        int v1 = 10;
        int v2 = 5;
        char op = 'a';

        /**
         * no switch case, não precisamos abrir {} para passar os códigos, mesmo que 
         * seja mais de uma linha de códigos, só precisamos abrir se dentro do case
         * formos usar if/else, e no switch case, caso nenhum dos casos seja satisfeito
         * o programa irá rodar o default(que é a mesma coisa que else)!
         */

        switch (op) {
            case 'a':
                System.out.format("Soma: %d\n", v1+v2);
                break;
            case 's':
                System.out.format("Subtração: %d\n", v1-v2);
                break;
            case 'm':
                System.out.format("Multiplicação: %d\n", v1*v2);
                break;
            case 'd':
                if(v2 == 0)
                    System.out.println("Impossível dividir por zero!");
                else 
                    System.out.format("Divisção: %d\n", v1/v2);
                break;
            default: 
                System.out.println("Operação não reconhecida!");
        }
    }
}
