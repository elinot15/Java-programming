/*6 Scrivere un programma (applicazione) che operi come una semplice calcolatrice in grado di memorizzare i risultati parziali.
Il programma deve consentire all'utente di digitare attraverso il flusso di input standard espressioni nella forma seguente

numero  operatore

I seguenti operatori/comandi devono essere riconosciuti:
+  -   *  /  S  E

L'operatore S indica al programma di memorizzare in un accumulatore il numero digitato, mentre E indica la fine dell'esecuzione.
Le operazioni aritmetiche sono svolte sul contenuto dell'accumulatore e sul numero digitato, che funge da secondo argomento.
Dopo ogni operazione il programma produce in output il contenuto dell'accumulatore (il risultato parziale).
Il valore iniziale dell'accumulatore è 0. Ecco un esempio di esecuzione:

$ java Calcolatrice
10 S
= 10.00
2 /
= 5.00
55 -
= -50.00
100.25 S
= 100.25
4 *
= 401.00
E
$ 

Avvertenze. Ogni operazione/comando va scritta(o) su una riga diversa. Si assuma che il numero di argomenti in
ciascuna riga sia corretto, eventuali argomenti aggiuntivi dovranno essere ignorati. Qualora il primo argomento di una riga
sia 'E' l'esecuzione terminerà.
IL programma dovrà solo controllare il caso della divisione per zero e la sintassi degli operatori,
producendo se necessario un opportuno messaggio in output, senza interrompere l'esecuzione.*/

import java.lang.System;
import java.util.Scanner;

public class Calcolatrice{
	public static void main (String Args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Scrivi l'operazione che vuoi eseguire:");
		
		String s, t;
		double val=0;
		s = sc.nextLine();
		t=s.trim();
		
		while(!(t.charAt(0)=='E')){
		val=CalculationUtils.calc(t, val);
		System.out.println(val);
		s = sc.nextLine();
		t=s.trim();
		}
	}
}
