import java.lang.System;
import java.util.Scanner;


public class Char2 {
	
	public static void main (String args[]) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Inserisci il codice numerico di un carattere Unicode:");
		
		int n=sc.nextInt();
		char x=(char)(n);
		
		System.out.println("Il carattere corrispondente e':"+x);
		
		
	
	
	}
}
