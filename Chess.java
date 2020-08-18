import java.lang.System;
import java.util.Scanner;


public class Chess {
	
	public static void main (String args[]) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Benvenuto al tavolo da gioco. Scegli il pezzo che vuoi muovere: inserisci B per l'alfiere, R per la torre, Q per la regina, P per il pedone, H per il cavallo, K per il re");
		String p=sc.nextLine();
		char pezzo=p.charAt(0);
		
		System.out.println("Inserisci la posizione iniziale del pezzo");
		String x0=sc.nextLine();
		char a= x0.charAt(0);
		int y0=sc.nextInt();
		
		System.out.println("Inserisci la posizione finale del pezzo");
		String g=sc.nextLine();
		String x1=sc.nextLine();
		char b= x1.charAt(0);
		int y1=sc.nextInt();
		
		int diff=(int)(b)-(int)(a);
		
		switch(pezzo){
			case 'B': 	if((Math.abs(y1-y0)==Math.abs(diff))&&(y1!=y0||a!=b))
						System.out.println("La mossa e' valida");
						else
						System.out.println("La mossa non e' valida");
						break;
						
			case 'R':	if((y1==y0||a==b)&&(y1!=y0||a!=b))
						System.out.println("La mossa e' valida");
						else
						System.out.println("La mossa non e' valida");
						break;
						
			case 'Q':	if(((Math.abs(y1-y0)==Math.abs(diff))&&(y1!=y0||a!=b))||((y1==y0||a==b)&&(y1!=y0||a!=b)))
						System.out.println("La mossa e' valida");
						else
						System.out.println("La mossa non e' valida");
						break;
			
			case 'P':	if((a==b)&&(y1!=y0)&&(y1-y0==1))
						System.out.println("La mossa e' valida");
						else
						System.out.println("La mossa non e' valida");
						break;
						
			case 'K':	if((((Math.abs(y1-y0)==Math.abs(diff))&&(Math.abs(y1-y0)==1)))||(((a==b)&&(y1-y0==1))||((y1==y0)&&(diff==1))))
						System.out.println("La mossa e' valida");
						else
						System.out.println("La mossa non e' valida");
						break;
						
			//case 'K':		
		}
		
		if(Math.abs(y1-y0)==Math.abs(diff))
		System.out.println("La mossa e' valida");
		else
		System.out.println("La mossa non e' valida");
		
	
		
	}
}
