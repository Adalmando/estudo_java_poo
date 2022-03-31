package aula_quatorze;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TipoFile {
    public static void main(String[] args) {
        ler("C:\\temp\\ai.txt");
    }

    public static void criaArquivo(String caminho){
        
        File arquivo = new File(caminho);
        try{
            if(arquivo.createNewFile()){
                System.out.println("Arquivo criado com sucesso!");
            }else{
                System.out.println("Arquivo ja existe!");
            }
        } catch(IOException e){
            System.out.println("Erro ao criar arquivo!");
            e.printStackTrace();
        }
    }

    public static String tradutor(boolean i){
        if(i)
            return "sim";
        else 
            return "não";
    }

    public static void informacao(String caminho){
        File arquivo = new File(caminho);
        System.out.printf("Existe: %s\n", tradutor(arquivo.exists()));
        System.out.printf("É um arquivo: %s\n", tradutor(arquivo.isFile()));
        System.out.printf("É diretório: %s\n", tradutor(arquivo.isDirectory()));
        System.out.printf("Pode ser escrito: %s\n", tradutor(arquivo.canWrite()));
        System.out.printf("Pode ser lido: %s\n", tradutor(arquivo.canRead()));
        System.out.printf("Pode ser executado: %s\n", tradutor(arquivo.canExecute()));
        System.out.printf("Pode ser criado: %s\n", tradutor(arquivo.mkdir()));
        System.out.printf("É oculto: %s\n", tradutor(arquivo.isHidden()));
        
        if(arquivo.exists()){
            if(arquivo.isFile()){
                System.out.printf("Tamanho: %d",arquivo.length());
            } else if (arquivo.isDirectory()){
                System.out.println("Conteúdo do diretório: ");
                String[] arquivos = arquivo.list();
                for(String a: arquivos){
                    System.out.println(a);
                }
            }
        }
    }

    public static void escrever(String caminho){
        try{
            FileWriter escrever = new FileWriter(caminho);
            escrever.write("Linha 1\nLinha 2\n");
            System.out.println("Escrito com sucesso!");
            escrever.close();
            } 
            catch(IOException e){
                System.out.println("Erro ao escrever no arquivo!");
        }
    }

    public static void ler(String caminho){
        
        try{
            File arquivo = new File(caminho);
            System.out.printf("DADOS DO DIRETÓRIO %s:\n",arquivo.getName().toUpperCase());
            System.out.println();
            if(arquivo.exists()){
                if(arquivo.isFile()){
                    Scanner leitor = new Scanner(arquivo);
                    while(leitor.hasNextLine()){
                        System.out.println(leitor.nextLine());
                    }
                    leitor.close();
                    System.out.println("\nFim da leitura.");
                }else{
                    System.out.println("\nO endereço digitado não é um arquivo!");
                }  
            } else{
                System.out.println("\nO enderenço digitado não existe!");
            }
        }catch(FileNotFoundException e){
            System.out.println("Arquivo não encontrado!");
        }
    }
}

