import java.util.Scanner;
import java.lang.System;

public class Codice{
	public static void main(String args[]){
	
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Inserisci il codice fiscale:");
		String cf;
		cf=sc.nextLine();
		
		String a, b, c, d, e, f, g;
		a=cf.substring(0,6);
		b=cf.substring(6,8);
		c=cf.substring(8,9);
		d=cf.substring(9,11);
		e=cf.substring(11,12);
		f=cf.substring(12,15);
		g=cf.substring(15,16);
		
		if(cf.length()>16) 
			System.out.println("ERRORE! Il CF deve essere di 16 caratteri.");
		else {
			
			boolean cod1=(Character.isLetter(cf.charAt(0)))&&(Character.isLetter(cf.charAt(1)))&&(Character.isLetter(cf.charAt(2)))&&(Character.isLetter(cf.charAt(3)))&&(Character.isLetter(cf.charAt(4)))&&(Character.isLetter(cf.charAt(5)))&&(Character.isLetter(cf.charAt(8)))&&(Character.isLetter(cf.charAt(11)))&&(Character.isLetter(cf.charAt(15)));
			boolean cod2=(Integer.parseInt(b)>=0)&&(Integer.parseInt(b)<100)&&(Integer.parseInt(d)>0)&&(Integer.parseInt(d)<72)&&(Integer.parseInt(f)>0)&&(Integer.parseInt(f)<1000);
			
			if(cod1&&cod2){
				String eta=cf.substring(9,11);
				if(Integer.parseInt(eta)>40)
					System.out.println("La persona e' una donna");
				else
					System.out.println("La persona e' un uomo");
			}
			else
					System.out.println("Errore nell'inserimento del codice fiscale");
			
		}
	}
}