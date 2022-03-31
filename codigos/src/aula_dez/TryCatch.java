package aula_dez;

public class TryCatch {
    public static void main(String[] args) throws Exception {
        if(args.length ==3){
            int valor1 = 0, valor2 = 0, resultado = 0;
            char operador = '+';
            try {
                valor1 = Integer.parseInt(args[0]);
                operador = args[1].charAt(0);
                valor2 = Integer.parseInt(args[2]);
            } catch (NumberFormatException e) {
                System.err.println("Argumentos devem ser um inteiro, um caractere e um inteiro.");
                System.exit(1);
            }
            switch(operador){
                case '+':
                    resultado = valor1+valor2;
                    break;
                case '-':
                    resultado = valor1-valor2;
                    break;
                case 'x':
                    resultado = valor1*valor2;
                    break;
                case '/':
                    resultado = valor1/valor2;
                    break;
                default:
                    System.err.println("Operador não identificado!");
                    System.exit(2);
            }
            System.out.printf("Resultado = %d\n", resultado);
        }
        else{
            System.err.println("O programa deve receber 3 argumentos!");
            System.exit(3);
        }
    }
}

