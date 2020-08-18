import java.util.Scanner;
import java.lang.System;

public class AnnoBis{
	public static void main(String args[]){
	
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Inserisci un anno:");
		
		int anno=sc.nextInt();
		boolean y=((anno%4)==0);
		if(y)
			System.out.println("L'anno e' bisestile");
		else
			System.out.println("L'anno non e' bisestile");
			
			
		
	}
}