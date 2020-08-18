import java.lang.System;
import java.util.Scanner;
import java.lang.Double;

	public class Round{
		public static void main(String args[]){
			
			Scanner sc = new Scanner(System.in);
			
			double n;
			int ris;
			
			System.out.println("Inserisci il numero che vuoi arrotondare:");
			n=sc.nextDouble();
			
			if(((n*10)%10)>=5) {
				n=n+1;
				ris=(int)(n);
				System.out.println("Il numero troncato e': "+ris);
			}
			
			else {
				ris=(int)(n);
				System.out.println("Il numero troncato e': "+ris);
			}
		}
	}