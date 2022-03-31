package aula_nove;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;
import java.time.Year;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

public class ManipulaDatas{
    public static void main(String[] args) {
        exercicio5();
    }

    public static void exercicio1(){
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite a data de seu nascimento (dd/mm/aaaa): ");
        String dataLida = leitor.nextLine();
        leitor.close();

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate data = LocalDate.parse(dataLida, formato);
        
        System.out.printf("Você ja viveu %d dias.", ChronoUnit.DAYS.between(data, LocalDate.now()));
    }

    public static void exercicio2(){
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite a data de seu nascimento (dd/mm/aaaa): ");
        String dataLida = leitor.nextLine();
        leitor.close();

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate data = LocalDate.parse(dataLida, formato);

        if(data.getDayOfWeek() == DayOfWeek.SATURDAY || data.getDayOfWeek() == DayOfWeek.SUNDAY){
            data = data.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
        }
        System.out.printf("Sua fatura deve ser paga no dia %s" ,data.format(formato));
    }

    public static void exercicio3(){
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o ano: ");
        int ano = leitor.nextInt();
        leitor.close();

        for(Month mes : Month.values()){
            YearMonth mesDoAno = YearMonth.of(ano, mes);
            System.out.printf("%s : %d dias.\n", mesDoAno.getMonth(), mesDoAno.lengthOfMonth());
        }
    }

    public static void exercicio4(){
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o ano: ");
        int ano = leitor.nextInt();
        System.out.print("Digite o mês: ");
        int mes = leitor.nextInt();
        leitor.close();

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate data = LocalDate.of(ano, mes, 1);
        LocalDate primeiroDomingo = data.with(TemporalAdjusters.firstInMonth(DayOfWeek.SUNDAY));
        System.out.println();

        System.out.println("Datas que caíram os domingos desse mês:");
        while(primeiroDomingo.getMonth() == data.getMonth()){
            System.out.println( primeiroDomingo.format(formato));
            primeiroDomingo = primeiroDomingo.plusWeeks(1);
        }
    }

    public static int qtdDeSextas13(int ano){
        LocalDate data = LocalDate.of(ano, 1, 1);
        LocalDate primeiraSexta = data.with(TemporalAdjusters.firstInMonth(DayOfWeek.FRIDAY));
        int totalSextas = 0;

        while(primeiraSexta.getYear() == data.getYear()){
            if(primeiraSexta.getDayOfMonth()==13){
                totalSextas++;
                primeiraSexta = primeiraSexta.plusWeeks(1);
            }
            primeiraSexta = primeiraSexta.plusWeeks(1);
        }
        return totalSextas;
    }   
    
    public static void exercicio5(){
        int anoVencedor = 0;
        int qtdVencedora = 0;

        for(int i = 0; i <= LocalDate.now().getYear(); i++){
            if(qtdDeSextas13(i)>= qtdVencedora){
                anoVencedor = i;
                qtdVencedora = qtdDeSextas13(i);
            }
        }
        System.out.printf("O ano com mais sextas-feiras 13 foi %d com %d ocorrências.", anoVencedor, qtdVencedora);
    }
}