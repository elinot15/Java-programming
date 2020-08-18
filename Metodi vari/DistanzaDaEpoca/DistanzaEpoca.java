import java.lang.System;
import java.util.Scanner;

public class DistanzaEpoca{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Inserisci una data nel formato gg/mm/aaaa:");
		String s= sc.nextLine();
		int pos1=s.indexOf('/');
		int pos2=s.indexOf('/', pos1+1);
		
		int g=Integer.parseInt(s.substring(0, pos1));
		int m=Integer.parseInt(s.substring(pos1+1, pos2));
		int a=Integer.parseInt(s.substring(pos2+1));
		
		int risultato=DateUtils.giorniDaEpoca(g, m, a);
		System.out.println("Il numero di giorni trascorsi dall'epoca e':"+risultato);
	}

}