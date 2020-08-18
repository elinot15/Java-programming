import java.lang.System;
import java.util.Scanner;


public class Bishop {
	
	public static void main (String args[]) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Inserisci la posizione iniziale dell'alfiere");
		String x0=sc.nextLine();
		char a= x0.charAt(0);
		int y0=sc.nextInt();
		
		System.out.println("Inserisci la posizione finale dell'alfiere");
		String g=sc.nextLine();
		String x1=sc.nextLine();
		char b= x1.charAt(0);
		int y1=sc.nextInt();
		
		int diff=(int)(b)-(int)(a);
		
		if(Math.abs(y1-y0)==Math.abs(diff))
		System.out.println("La mossa e' valida");
		else
		System.out.println("La mossa non e' valida");
		
	
		
	}
}
