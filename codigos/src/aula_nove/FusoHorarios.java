package aula_nove;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class FusoHorarios {
    public static void main(String[] args) {
        usarFusoHorario();
    }

    public static void usarFusoHorario(){
        //data e horário do por do sol do natal de 2020
        LocalDateTime porDoSolDeNatal = LocalDateTime.of(2020, 12, 25, 17, 36);
        //captura as regiões de fusos-horarios disponíveis
        Set <String> regioes = ZoneId.getAvailableZoneIds();
        //mostra as regiões que contém a palavra "America"
        for(String regiao : regioes){
            if(regiao.contains("America")){
                System.out.println(regiao);
            }
        }
        //mostra a quantidade de regiões disponíveis
        System.out.printf("%d regiões disponíveis.\n", regioes.size());
        //cria um objeto para armazenar data e horário com informações de região 
        ZoneId norteBr = ZoneId.of("America/Manaus");
        ZonedDateTime fusoNorteBr = ZonedDateTime.of(porDoSolDeNatal, norteBr);
        System.out.println(fusoNorteBr);

    }
}
