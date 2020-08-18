import java.time.LocalDate;

/**
 *
 * @author lorenzo capra
 */
public class Evento implements Comparable<Evento> {
    //fields
    private final LocalDate date;
    private final int hour;
    private final boolean half;
    private final String place;
    private final String description;
    
    public Evento(LocalDate d, int ora, boolean mezza, String luogo, String descrizione) {
        if (ora < 0 || ora > 23)
            throw new IllegalArgumentException("illegal hour");
        date = d;
        hour = ora;
        half = mezza;
        place = luogo;
        description = descrizione;
    } 

    @Override
    public int compareTo(Evento e) {
        int comp = this.date.compareTo(e.date);
        if (comp == 0) { //same date
            comp = new Integer(hour).compareTo(e.hour);
            if (comp == 0)
                comp = new Boolean(half).compareTo(e.half);
        }
        return comp;
    }
    
    @Override
    public String toString() {
       return "giorno: "+date+", ora: "+hour +(half ? " e 30" : "")+", luogo: "
               +place +"\n" + description+"\n";  
    }
    
    public LocalDate data () {
        return date;
    }
    
    public String descrizione() {
        return description;
    }
    
    public String luogo () {
        return place;
    }
    
    public int ora () {
        return hour;
    }
    
    public boolean mezza () {
        return half;
    }
    
}
