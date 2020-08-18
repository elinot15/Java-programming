import java.util.Scanner;
import java.lang.System;

public class Arrotonda{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		System.out.println("Inserisci il numero da arrotondare:");
		double n = sc.nextDouble();
		
		System.out.println("Inserisci la posizione a cui lo vuoi arrotondare");
		int k = sc.nextInt();
		
		System.out.println("Vuoi arrotondare il numero oppure troncarlo?(arrotondare: Y, troncare: N)");
		String a=sc.nextLine();
		String s = sc.nextLine();
		
		String t = s.trim();
		String q = t.toUpperCase();
		boolean check;
		int pos=0;
		
		if(q.charAt(pos)=='Y')
			check=true;
		else
			check=false;
		
		System.out.println(DoubleUtils.arrotondaNumero(n, k, check));
		System.out.println(DoubleUtils.troncaNumero(n, k));
	}
}
