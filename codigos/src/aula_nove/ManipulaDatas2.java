package aula_nove;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;



public class ManipulaDatas2{
    public static void main(String[] args) throws InterruptedException {
                
    }

    public static void diasVividos(){
        //Aqui, o método recebe os valores(data de nascimento)
        Scanner leitor = new Scanner(System.in);
        System.out.printf("Digite sua data de nascimento: 'dd/mm/aaaa': ");
        String dataDigitada = leitor.nextLine();
        leitor.close();

        //Aqui criamos um formato chamado dataFormatada:
        DateTimeFormatter dataFormatada = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        //Aqui, criamos uma data que recebe uma String(dataDigitada) e um formato para moldar a String (dataFormatada)
        LocalDate dataInDate = LocalDate.parse(dataDigitada, dataFormatada);

        //Aqui, printamos quantos dias se passaram, between serve para comparar uma data de outra:
        System.out.printf("Até o momento, você viveu %d dias.\n", ChronoUnit.DAYS.between(dataInDate, LocalDate.now()));
    
    }

    public static void vencimentoBoleto(){
        Scanner leitor = new Scanner(System.in);
        System.out.printf("Digite a data de vencimento do boleto: 'dd/mm/aaaa': ");
        String dataDigitada = leitor.nextLine();
        leitor.close();

        //Aqui, criei um objeto format que molda a data para o padrão pt-br
        DateTimeFormatter dataFormatada = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        //Aqui, criei o objeto dadtat passando o format que criei comom molde dela:
        LocalDate diaVencimento = LocalDate.parse(dataDigitada, dataFormatada);

        if((diaVencimento.getDayOfWeek() == DayOfWeek.SATURDAY) || (diaVencimento.getDayOfWeek() == DayOfWeek.SUNDAY )){
            //Aqui, se o diaVencimento for sábado ou domingo, diaVencimento passa a ser a data da proxima segunda-feira:
            diaVencimento = diaVencimento.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
        }
        //Aqui, antes de printar a data, eu moldo ela novamente para o meu format que é padrão BR:
        System.out.printf("O vencimento da sua fatura é: %s", diaVencimento.format(dataFormatada));
    }

    public static void diasDosMeses(){
        Scanner leitor = new Scanner(System.in);
        System.out.printf("Digite o ano: ");
        int ano = leitor.nextInt();
        leitor.close(); 

        for(Month mes : Month.values()){
            YearMonth mesDoAno = YearMonth.of(ano, mes);
            System.out.printf("%s: %d dias\n", mes, mesDoAno.lengthOfMonth());
        }
    }

    public static void obterDomingos() throws InterruptedException{
        Scanner leitor = new Scanner(System.in);
        System.out.printf("Digite o ano: ");
        int ano = leitor.nextInt();
        System.out.printf("Digite o mês: ");
        int mes = leitor.nextInt();
        leitor.close();

        DateTimeFormatter dataFormatada = DateTimeFormatter.ofPattern("dd' de 'MMM' de 'yyyy");
        LocalDate data = LocalDate.of(ano, mes, 1); 
        LocalDate primeiroDomingo = data.with(TemporalAdjusters.firstInMonth(DayOfWeek.SUNDAY)); 

        do{       
            System.out.println(primeiroDomingo.format(dataFormatada));
            Thread.sleep(1000);
            primeiroDomingo = primeiroDomingo.plusWeeks(1);
        }while(data.getMonthValue() == primeiroDomingo.getMonthValue()); 
        System.out.println("Fim!!");       
    }

    public static int ObterQtdDeSextas13DoAno(int ano){
        LocalDate data = LocalDate.of(ano, 1, 1);
        LocalDate primeiraSexta = data.with(TemporalAdjusters.firstInMonth(DayOfWeek.FRIDAY));
        int qtdDeSextas13 = 0;

        while(primeiraSexta.getYear() == ano){
            if(primeiraSexta.getDayOfMonth() == 13){
                qtdDeSextas13++;
            }
            primeiraSexta = primeiraSexta.plusWeeks(1);
        }
        return qtdDeSextas13;
    }

    public static void anoComMaisSexta13(){
        int anoVencedor = 0;
        int sextasDoAnoVencedor = 0;

        for(int i= 0; i<LocalDate.now().getYear();i++){
            if(ObterQtdDeSextas13DoAno(i)>= sextasDoAnoVencedor){
                anoVencedor = i;
                sextasDoAnoVencedor = ObterQtdDeSextas13DoAno(i);
            }
        }
        System.out.printf("O ano com mais Sextas-feira 13 foi %d com %d ocorrências!\n",anoVencedor, sextasDoAnoVencedor);
    }
}