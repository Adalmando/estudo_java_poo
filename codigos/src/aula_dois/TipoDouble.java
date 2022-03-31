package aula_dois;

import java.util.Scanner;

public class TipoDouble {
    public static void main(String[] args) throws Exception {
       
        double n1 = 100.22;
        double n2 = 300.33;

        // AO COLOCAR O (double) ANTES DE UM VALOR DE QUALQUER TIPO, EU FORÇO QUE ESSA VARIAVEL SEJA
        // TIPADA COMO DOUBLE, MESMO QUE NÃO SEJA SUPORTADA PELO DOUBLE, EU FORÇO QUE O TIPO MUDE
        // CASO SEJA UM VALOR 64BITS MUDADO PARA UM 32BITS, EU PERCO ALGUMAS INFOS, MAS, O JAVA FORÇA
        // UMA MUDANÇA. ISSO SERVE PARA QUALQUER TIPO: (int) (float) (String)
        
        int resultado = (int)(n1+n2);
        System.out.println(resultado);

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        String result = leitor.nextLine();
        System.out.println("Prazer, "+result+", qual sua idade?");
        int idade = leitor.nextInt();
        System.out.println("Que legal, "+result+ ", "+ idade + " anos é uma ótima idade!");
        System.out.println("E qual é sua altura?");
        double altura = leitor.nextDouble(); 
        System.out.println("Que legal, "+result+ ", sua altura é muito boa "+altura);
        leitor.close();
    }
}
