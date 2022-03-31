package o_jogo;

import java.util.Scanner;

public class Jogo {
  
    // NESSE CÓDIGO EU SEPAREI CADA ETAPA DO "JOGO" EM UM MÉTODO DIFERENTE, CADA MÉTODO EXECUTA APENAS UMA AÇÃO,
    // OU SEJA, FRAGMENTEI O CÓDIGO, DEIXANDO MAIS LEGÍVEL E FÁCIL DE SE FAZER MANUTENÇÃO!!
   
   
    public static void main(String[] args) throws InterruptedException {
        executarJogo();
    }





    public static void executarJogo() throws InterruptedException{
        int opcao;
        Scanner leitor = new Scanner(System.in);
        do{
            opcao = obterOpcaoDoJogo(leitor);
            executaOpcaoDoJogo(opcao);
        }while(opcao != 2);
        leitor.close();
    }

    public static int obterOpcaoDoJogo(Scanner leitor){
        
        System.out.println("1 - JOGAR");
        System.out.println("2 = Sair");
        System.out.print("Escolha uma opção: ");
        int opcao = leitor.nextInt();
        return opcao;

    }

    public static void executaOpcaoDoJogo(int opcao) throws InterruptedException{
        switch(opcao){
            case 1:
                System.out.println("Iniciando jogo...");
                Thread.sleep(1000);
                jogando();
                break;
            case 2:
                Thread.sleep(1000);
                System.out.println("Finalizando programa....");
                break;
            default:
                Thread.sleep(1000);
                System.out.println("Opção inválida!");
                break;
        }
    }

    public static void jogando() throws InterruptedException{
        for(int i =1; i<=5; i++){
            Thread.sleep(1000);
            System.out.printf("Você passou da fase %d...\n",i);
        }
        Thread.sleep(1000);
        System.out.println("Fim..");
        Thread.sleep(1000);
        System.out.println("Deseja jogar novamente?");
    }
}
