import java.time.LocalDate;
import java.util.List;


public class Agenda {
    
   /*
    * aggiunge un Evento all'Agenda, verificando che non ve ne sia gi√† uno memorizzato 
    * allo stesso orario; in quest'ultimo caso l'Agenda rimane invariata;
    * il metodo restituisce true o false a seconda che l'Agenda sia modificata o no.
    */
    public boolean aggiunge(Evento e) {
       throw new UnsupportedOperationException("Not yet implemented"); 
    } 
            
   /* 
    * restituisce l'Evento corrispondente ad una data e ad un orario specificati;
    *  il metodo restituisce null se l'Agenda non ne contiene uno.
    */
     public Evento evento(LocalDate d, int h, boolean mezza) {
       throw new UnsupportedOperationException("Not yet implemented"); 
    }
             
    /* 
     * restituisce una lista (anche vuota) con gli eventi fissati in una data specificata
     */
    public List<Evento> eventi(LocalDate d) {
       throw new UnsupportedOperationException("Not yet implemented"); 
    }
            
    /*
     * restituisce una lista (anche vuota) con gli Appuntamenti fissati
     * tra due date specificate (incluse).
     */
    public List<Evento> eventi(LocalDate from, LocalDate to) {
       throw new UnsupportedOperationException("Not yet implemented"); 
    }
    
    /* 
     * rimuove un Evento dall'Agenda, se essa ne contiene gi‡† uno identico;
     * il metodo restituisce true o false a seconda che l'Agenda sia modificata o no.
     */
     public boolean rimuove(Evento e) {
       throw new UnsupportedOperationException("Not yet implemented"); 
    }
                    
    /*
     * rimuove dall'Agenda qualsiasi Evento corrispondente ad una data specificata;
     * il metodo restituisce true o false a seconda che l'Agenda sia modificata o no.
     */
     public boolean rimuove(LocalDate d) {
       throw new UnsupportedOperationException("Not yet implemented"); 
    }
    
    
    /*
     * rimuove dall'Agenda l'Evento corrispondente ad una data e ad un orario specificati;
     * il metodo restituisce true o false a seconda che l'Agenda sia modificata o no
     */
    public boolean rimuove(LocalDate d, int h, boolean mezza) {
       throw new UnsupportedOperationException("Not yet implemented"); 
    }
                                    
    /*
     * fornisce una raprresentazione testuale dell'agenda
     */
    @Override
    public String toString() {
      throw new UnsupportedOperationException("Not yet implemented");   
    }
    
}
