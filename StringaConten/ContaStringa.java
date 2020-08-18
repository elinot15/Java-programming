//1 Definire un metodo statico che calcoli quante volte una stringa sia contenuta in un'altra. Scrivere un programma per testare il metodo.

import java.lang.System;
import java.util.Scanner;

public class ContaStringa{
	
	public static int conta(String s, String base){
		
		int conta=0;
		for(int i=0; i<s.length()-base.length(); i++){
			if((s.substring(i,i+base.length())).equals(base))
				conta++;
		}
		
		return conta;
		
	}	
}
