import java.util.*;
public class _TestStatistiche {
    static int[] data = {1,1,3,2,4,5,1,4,6,7,3,5,5,8,9,10,0,0,2,1};
    static int[] frequenza=null;

    public static void main(String[] args) {
        frequenza = Statistiche.frequenze(data);
        stampa(); // dovrebbe stampare mediana 3.5

        data = new int[] {1,2,1,2,1,2,1,2,1,2,1,2,1};
        frequenza = Statistiche.frequenze(data);
        stampa(); // dovrebbe stampare mediana 1

        data = new int[] {3,1,5,6,7,8,9,1,3};
        frequenza = Statistiche.frequenze(data);
        stampa(); // dovrebbe stampare mediana 5
    }

    public static void stampa() {
        System.out.print("\n+ serie di dati: "+ Arrays.toString(data));

        System.out.println("\nfrequenze:");
        for (int i = 0; i < frequenza.length ; ++i)
            System.out.printf("%2d: %d\n", i, frequenza[i]);

        System.out.println("mediana: "+ Statistiche.mediana(data));

        Arrays.sort(data);
        System.out.println("sorted: "+ Arrays.toString(data));
    }
}
