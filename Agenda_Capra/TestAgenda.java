import java.time.LocalDate;

/**
 *
 * @author lorenzo capra
 */
public class TestAgenda {

    public static void main(String[] args) {
        LocalDate d1, d2;
        d1 = LocalDate.of(2017, 12, 19); // 19 Dicembre 2017
        d2 = LocalDate.now(); // oggi
        String luogo = "aula tau V. Comelico",
               descrizione = "laboratorio di programmazione";
        int ora = 13;
        boolean mezza = true;
        Evento e1 = new Evento(d1, ora, mezza, luogo, descrizione);
        Evento e2 = new Evento(d2, ora, mezza, luogo, descrizione);
        System.out.println("evento 1\n"+e1);
        System.out.println("evento 2\n"+e2);

        if (e1.compareTo(e2) < 0)
            System.out.println("evento 1 antecedente evento 2");
        else if (e1.compareTo(e2) > 0)
            System.out.println("evento 2 antecedente evento 1");
        else
            System.out.println("evento 1 simultaneo ad evento 2");
        
        Agenda a = new Agenda();
        a.aggiunge(e2);
        a.aggiunge(e1);
        System.out.println("agenda\n"+a);
        
        if (a.aggiunge(e2))
            System.out.println("errore: e2 gia' presente");
        System.out.println("agenda\n"+a);

	   Evento e;
        if ((e = a.evento(d2, ora, mezza)) != null)
            System.out.println("agenda contiene l'evento\n"+e); 

        ArrayList<Evento> elist;
        elist = a.eventi(d1);
        System.out.println("eventi in agenda in data "+d1+'\n'+elist);
        
        elist = a.eventi(d1,d2);
        System.out.println("eventi in agenda tra " +d1+" e "+d2+'\n'+elist);
        
        elist = a.eventi(d1,d1);
        System.out.println("eventi in agenda tra " +d1+" e "+d1+'\n'+elist);
        
        elist = a.eventi(d2,d1);
        System.out.println("eventi in agenda tra " +d2+" e "+d1+'\n'+elist);

        if (a.rimuove(e2))
             System.out.println("rimosso evento 2 da agenda");
        System.out.println("agenda\n"+a);
        
        a.aggiunge(e2); //riaggiunto
        System.out.println("agenda\n"+a);
        
        if (a.rimuove(d2))
            System.out.println("rimossi eventi con data " + d2 + " da agenda");
        System.out.println("agenda\n"+a);
        
    }
    
}
