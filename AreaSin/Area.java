/*2 Definire un programma che calcoli (in modo approssimato) l'area sottesa dalla funzione sen x, nell'intervallo [0,b], dove b è un valore
tra 0 e pi scelto dall'utente (idea: considerare n punti equidistanti nell'intervallo [0,b] e contare quante volte un valore generato in modo
"random" nell'intervallo [0,1) cade al di sotto del valore della funzione calcolato negli n punti ...) .*/

import java.lang.System;
import java.util.Scanner;
import java.util.Random;

public class Area{
	
	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Inserisci il limite entro cui calcolare l'area:");
		double b=sc.nextDouble();
		
		if(b<0||b>Math.PI)
			System.out.println("ERRORE! Il numero inserito deve essere compreso tra 0 e Pi");
		else{
			Random rnd= new Random();
			double quota;
			double x;
			int conta=0;
			for(int i=1; i<=1000000; i++){
				quota=rnd.nextDouble();
				x=b/1000000*i;
				if(quota<=Math.sin(x))
					conta++;
			}
			
			double areaRet=b;
			double areaSin=(double)(conta)/1000000*areaRet;
			System.out.println(conta);
			System.out.println("L'area sotto la funzione e':"+areaSin);
		}
	}	
}
