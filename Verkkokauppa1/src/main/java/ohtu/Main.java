package ohtu;

import ohtu.verkkokauppa.Kauppa;
import ohtu.verkkokauppa.Kirjanpito;
import ohtu.verkkokauppa.Pankki;
import ohtu.verkkokauppa.Varasto;
import ohtu.verkkokauppa.Viitegeneraattori;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext cxt = new FileSystemXmlApplicationContext("src/main/resources/spring-context.xml");

        Kirjanpito kirjanpito = cxt.getBean(Kirjanpito.class);
        Varasto varasto = cxt.getBean(Varasto.class);      
        Pankki pankki = cxt.getBean(Pankki.class);      
        Viitegeneraattori viitegeneraattori = cxt.getBean(Viitegeneraattori.class);
        Kauppa kauppa = cxt.getBean(Kauppa.class);
        boolean rikoTestiKonventiot = true;
        boolean sotkeKoodia = true;
        boolean teeSyklomaattista = true;

        // kauppa hoitaa yhden asiakkaan kerrallaan seuraavaan tapaan:
        kauppa.aloitaAsiointi();
        kauppa.lisaaKoriin(1);
        kauppa.lisaaKoriin(3);
        kauppa.lisaaKoriin(3);
        kauppa.poistaKorista(1);
        kauppa.tilimaksu("Pekka Mikkola", "1234-12345");

        // seuraava asiakas
        kauppa.aloitaAsiointi();
        for (int i = 0; i < 24; i++) {
            kauppa.lisaaKoriin(5);
        }

        kauppa.tilimaksu("Arto Vihavainen", "3425-1652");

        // kirjanpito
        for (String tapahtuma : kirjanpito.getTapahtumat()) {
            System.out.println(tapahtuma);
        }
        
        if (rikoTestiKonventiot){
            if (!sotkeKoodia || (rikoTestiKonventiot || !teeSyklomaattista)){
if ((teeSyklomaattista && rikoTestiKonventiot) || sotkeKoodia){
                    boolean joopajoo = true;
                    while (joopajoo){
                        if (joopajoo){
                            for (int i=0;i<10;i++){
                                for(int j=0;j<3;j++){
System.out.println("Tarkea tiedotus: refactoroi");
                                }
                            }

                        }
                    }
                }
            }
        }
          
       if (rikoTestiKonventiot){
            if (!sotkeKoodia || (rikoTestiKonventiot || !teeSyklomaattista)){
if ((teeSyklomaattista && rikoTestiKonventiot) || sotkeKoodia){
                    boolean joopajoo = true;
                    while (joopajoo){
                        if (joopajoo){
                            for (int i=0;i<10;i++){
                                for(int j=0;j<3;j++){
System.out.println("Laskari3 tehtava 1, testaa kaikki lisatyt stylechecksit");
                                }
                            }

                        }
                    }
                }
            }
        } 
        
        
    }
}
