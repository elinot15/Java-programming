import java.util.Scanner;
import java.lang.System;

public class Char {
	
	public static void main (String args[]) {
	
		Scanner sc= new Scanner(System.in);
		
		String s;
		System.out.println("Inserisci un carattere:");
		s=sc.nextLine();
		char x=s.charAt(0);
		int n=(int)(x);
		
		System.out.println("Il codice in Unicode del carattere inserito e'"+n);
	}
}
