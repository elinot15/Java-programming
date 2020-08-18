//4 Definire una applicazione che verifichi se due stringhe sono una il "rovescio" dell'altra. Utilizzare esclusivamente i metodidella classe String(usa solo i cicli)

import java.util.Scanner;
import java.lang.System;

public class Rov{
	public static void main(String args[]){
	
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Inserisci la prima stringa:");
		String sa=sc.nextLine();
		System.out.println("Inserisci la seconda stringa:");
		String sb=sc.nextLine();
		
		String s1=sa.trim();
		String s2=sb.trim();
		
		boolean check=(s1.length()!=s2.length());
		int l=s1.length();
		int conta=0;
		
		if(check)
		System.out.println("Le stringhe non sono una il rovescio dell'altra.");
		else{
			for(int i=0; i<l; i++)
			if(s1.charAt(i)==s2.charAt(l-i-1))
			conta++;
			
			if(conta==l)
			System.out.println("Le stringhe sono una il rovescio dell'altra.");
		}
		
	}
}
