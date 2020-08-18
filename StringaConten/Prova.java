import java.lang.System;
import java.util.Scanner;

public class Prova{
	
	public static void main(String [] args){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Inserisci la stringa che vuoi controllare:");
		String s=sc.nextLine();
		System.out.println("Inserisci la stringa di cui vuoi controllare la ripetizione:");
		String base=sc.nextLine();
		
		int ris=ContaStringa.conta(s, base);
		System.out.println("La stringa "+base+" si ripete "+ris+" volte.");
	}
}
