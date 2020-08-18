import java.lang.System;
import java.util.Scanner;

public class ScanTesto{
	public static void main(String args[]){
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Inserisci una stringa: l'immissione termina con ******");
		int conta=0;
		StringBuilder sb=new StringBuilder();
		String t;
		
		do{
			t=sc.nextLine();
			sb.append(t);
			sb.append("\n");
		}
		while(!t.equals("******"));
		
		String s=sb.toString();
		conta+=TextUtils.contaParole(s);
		
		double media=TextUtils.mediaLunghezza(s);
		
		System.out.println("La lunghezza media delle parole e':"+media);
	}
}